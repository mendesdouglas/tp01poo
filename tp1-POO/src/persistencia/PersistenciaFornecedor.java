package persistencia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import persistencia.Conecta;
import pessoas.Fornecedor;


	public class PersistenciaFornecedor {

		private static PersistenciaFornecedor FornecedorInstance;
		public Connection conn;
		
		/**
		 * Conexão com o banco de dados
		 * 
		 */
		private PersistenciaFornecedor () {
			Conecta c = Conecta.getConnection();
			this.conn = c.conn;
		}
		 
		/**
		 * 
		 * Singleton. Usado para que haja apenas uma conexão com o banco sendo usada no sistema
		 */
		public static PersistenciaFornecedor getInstance(){
			if(FornecedorInstance == null) {
				FornecedorInstance = new PersistenciaFornecedor();
		    }
		    return FornecedorInstance;
		 }
	/**
	 * Removido
	 */
	public boolean save (){
		return true;
	}
	/**
	 * Removido
	 */
	@SuppressWarnings("unused")
	private void getFornecedor (){	
	}
	
	/**
	 * 
	 * Busca por um fornecedor através do cnpj ou do nome
	 * @param query
	 * @return o fornecedor procurado
	 */
	public Fornecedor searchFornecedor (String query) {
		Statement stat;
		ResultSet rs;
		Fornecedor fornecedor = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Fornecedor where cnpj = '"+query+"'"+" or nome = '"+query+"'");
			if (rs.next()) {
			  fornecedor = new Fornecedor(rs.getString("cnpj"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
			}
			rs.close();
			stat.close();
			return fornecedor;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}
	/**
	 * 
	 * Cadastra um fornecedor sendo necessário informar cnpj, nome, endereco e telefone
	 * @param fornecedor
	 * @return true se foi possível realizar o cadastro
	 */
	public boolean cadastro (Fornecedor fornecedor) {
		Statement stat;
		//ResultSet rs;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("insert into Fornecedor (cnpj,nome,endereco,telefone) " +
					"values('"+fornecedor.getCnpj()+"','"+fornecedor.getNome()+"','"+fornecedor.getEndereco()+"','"+fornecedor.getTelefone()+"')");
			stat.close();
			Log.getLoginstance(null).info("Fornecedor de CNPJ "+fornecedor.getCnpj()+" cadastrado com sucesso.");
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 
	 * Remove um fornecedor se inserido o cnpj ou nome
	 * @param query
	 * @return true se é possível remover
	 */
	public boolean removerFornecedor(String query){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Fornecedor where cnpj = "+query+" or nome = "+query);
			stat.close();
			Log.getLoginstance(null).info("Fornecedor de CNPJ ou Razão Social "+query+" foi removido com sucesso.");
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return false;
		}
	}
	
	/**
	 * Remove toda a tabela de fornecedor
	 * 
	 */
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Fornecedor");
			stat.close();
			Log.getLoginstance(null).info("Todos os dados da tabela fornecedores foram excluidos com sucesso.");
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
		}
	}
	
	/**
	 * 
	 * Retorna uma cópia da lista de fornecedores
	 */
	public ArrayList<Fornecedor> overview () {
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Fornecedor");
			while (rs.next()){
				Fornecedor fornecedor = new Fornecedor(rs.getString("cnpj"),rs.getString("nome"),rs.getString("endereco"),rs.getString("telefone"));
				fornecedores.add(fornecedor);	
			}
			rs.close();
			stat.close();
			return fornecedores;
		} catch (SQLException e) {
			Log.getLoginstance(null).error("Ocorreu um erro: "+e.getMessage());
			return null;
		}
	}
}