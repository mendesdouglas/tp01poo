package persistenciaDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import pessoas.Cliente;


public class PersistenciaCliente {
	

	private static PersistenciaCliente ClienteInstance;
	private Connection conn;
	
	private PersistenciaCliente () {
		Conecta c = Conecta.getConnection();
		this.conn = c.conn;
	}
	 
	public static PersistenciaCliente getInstance(){
		if(ClienteInstance == null) {
			ClienteInstance = new PersistenciaCliente();
	    }
	    return ClienteInstance;
	 }
	/**
	 * 
	 */
	public boolean save(){
		return true;
	}
	/**
	 *  
	 * 
	 */
	public void getCliente(){
	}
	
	/**
	 * 
	 */
	public Cliente searchCliente (String query) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Cliente where cpf = "+query+" or nome = "+query);
			Cliente cliente = new Cliente(rs.getString("cpf"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
			rs.close();
			stat.close();
			return cliente;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 */
	public boolean cadastro (Cliente cliente) {
		Statement stat;
		//ResultSet rs;
		try {
			stat = conn.createStatement();
			//rs = stat.executeQuery("select * from Cliente where cpf = "+cliente.getCpf()+" or name ="+ cliente.getNome());
			stat.executeUpdate("insert into Cliente (cpf,nome,endereco,telefone) " +
					"values('"+cliente.getCpf()+"','"+cliente.getNome()+"','"+cliente.getEndereco()+"','"+cliente.getTelefone()+"')");
			stat.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean removerCliente(String query){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Cliente wehre cpf = "+query+" or nome = "+query);
			stat.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Cliente");
			stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * 
	 */
	public ArrayList<Cliente> overview (){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Cliente");
			while (rs.next()){
				Cliente cliente = new Cliente(rs.getString("cpf"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
				clientes.add(cliente);	
			}
			rs.close();
			stat.close();
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

