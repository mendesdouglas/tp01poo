package persistencia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import pessoas.Cliente;


public class PersistenciaCliente {
	

	private static PersistenciaCliente ClienteInstance;
	private Connection conn;
	
/**
 * Conexão com o banco de dados
 * 
 */
	private PersistenciaCliente () {
		Conecta c = Conecta.getConnection();
		this.conn = c.conn;
	}
	 
/**
 * 
 * Singleton. Usado para que haja apenas uma conexão com o banco sendo usada no sistema
 * 
 */
	public static PersistenciaCliente getInstance(){
		if(ClienteInstance == null) {
			ClienteInstance = new PersistenciaCliente();
	    }
	    return ClienteInstance;
	 }
	
	/**
	 * removido, pertencia a primeira parte do trabalho 
	 */
	public boolean save(){
		return true;
	}
	
	/**
	 * removido, pertencia a primeira parte do trabalho 
	 */
	public void getCliente(){
	}
	
	/**
	 * 
	 * Busca um cliente pelo cpf ou pelo nome
	 * @param query
	 * @return informações sobre o cliente procurado
	 */
	public Cliente searchCliente (String query) {
		Statement stat;
		ResultSet rs;
		Cliente cliente = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Cliente where cpf = '"+query+"' or nome = '"+query+"'");
			if (rs.next()) {
				cliente = new Cliente(rs.getString("cpf"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
			}
			rs.close();
			stat.close();
			return cliente;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}
/**
 * 
 * Método para o cadastro de um cliente que ainda não foi cadastrado.
 * @param cliente
 * @return true se é possível realizar cadastro
 */
	public boolean cadastro (Cliente cliente) {
		Statement stat;
		//ResultSet rs;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("insert into Cliente (cpf,nome,endereco,telefone) " +
					"values('"+cliente.getCpf()+"','"+cliente.getNome()+"','"+cliente.getEndereco()+"','"+cliente.getTelefone()+"')");
			stat.close();
			Log.getLoginstance(null).info("Cliente de CPF "+cliente.getCpf()+" cadastrado no banco de dados.");
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 
	 * Remove um cliente se informado o cpf ou o nome do mesmo
	 * @param query
	 * @return true se é possível remover o cliente
	 */
	public boolean removerCliente(String query){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Cliente wehre cpf = "+query+" or nome = "+query);
			stat.close();
			Log.getLoginstance(null).info("Cliente de nome ou cpf "+query+" cadastrado no banco de dados.");
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 
	 * Método que remove todos os clientes do banco de dados
	 */
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Cliente");
			stat.close();
			Log.getLoginstance(null).info("Todos os dados da tabela cliente foram excluidos com sucesso.");
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
		}
	}
	
	/**
	 * 
	 * Método que retorna uma cópia do Array de clientes
	 * @return  a lista de clientes
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
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}
}
