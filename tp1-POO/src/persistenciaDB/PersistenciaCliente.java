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
			rs = stat.executeQuery("select * from Cliente where cpf = "+query+" or name = "+query);
			Cliente cliente = new Cliente(rs.getString("cpf"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
			return cliente;
		} catch (SQLException e) {
			return null;
		}
	}
	/**
	 * 
	 */
	public boolean cadastro (Cliente cliente) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Cliente where cpf = "+cliente.getCpf()+" or name ="+ cliente.getNome());
			if ( ! rs.wasNull()){
				return false;
			}
			
			stat.executeUpdate("insert into Cliente (cpf,nome,endereco,telefone) " +
					"values('"+cliente.getCpf()+"','"+cliente.getNome()+"','"+cliente.getEndereco()+"','"+cliente.getTelefone()+"')");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean removerCliente(String query){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Cliente wehre cpf = "+query+" or nome = "+query);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Cliente");
		} catch (SQLException e) {
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
			if (rs.wasNull()){
				return null;
			}
			while (rs.next()){
				Cliente cliente = new Cliente(rs.getString("cpf"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
				clientes.add(cliente);	
			}
			return clientes;
		} catch (SQLException e) {
			return null;
		}
	}
}

