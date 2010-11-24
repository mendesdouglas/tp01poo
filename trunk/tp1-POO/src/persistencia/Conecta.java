package persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@SuppressWarnings("unused")

public class Conecta {

	private static Conecta connection;
	public Connection conn;
	private String databaseName;
	private String host;
	private String username;
	private String passwd;
	
	/**
	 * Construtor da classe. Basicamente ele configura uma nova conexão  e a disponibiliza para ser usada
	 * @exception ClassNotFoundException Caso o driver de conexão não estaja disponível
	 * @exception SQLException em caso de uma conexão malformatada
	 */
	private Conecta () {
		this.databaseName = "databaseData/database.sqlite";
		//this.databaseName = "banco_sistema"; 
		this.host = "localhost";
		this.username = "aluno";
		this.passwd = "aluno";
		try {
			this.connectSqlite(this.databaseName);
			//this.connectMysql(host, databaseName, username, passwd);
		} catch (ClassNotFoundException e) {
			Log.getLoginstance(null).fatal(e.getMessage());
			System.exit(1);
		} catch (SQLException e) {
			Log.getLoginstance(null).fatal(e.getMessage());
			System.exit(1);
		}		
	}
	 

	/**
	 * Singleton. Usado para que haja apenas uma conexão com o banco sendo usada no sistema
	 * @return uma instância desta classe
	 */
	public static synchronized Conecta getConnection(){
		if(connection == null) {
			connection = new Conecta();
	    }
	    return connection;
	 }
	
	public void Desconecta(){
		try {
			this.conn.close();
		} catch (SQLException e) {
			Log.getLoginstance(null).error(e.getMessage());
		}
	}
	
	/**
	 * Configura uma nova conexão usando Banco de dados Sqlite
	 * @param nomeDB O nome do arquivo de conexão com o banco
	 * @throws ClassNotFoundException Caso o driver de conexão não estaja disponível
	 * @throws SQLException em caso de uma conexão malformatada
	 */
	private void connectSqlite(String nomeDB) throws ClassNotFoundException, SQLException{
		Class.forName("org.sqlite.JDBC");
	    this.conn = DriverManager.getConnection("jdbc:sqlite:"+nomeDB);
	    Log.getLoginstance(null).info("Conectado com sucesso ao banco "+nomeDB);
	}

	/**
	 * Configura uma nova conexão usando Banco de dados Mysql
	 * @param host O nome ou IP do servidor
	 * @param nomeDB O nome do banco
	 * @param user O nome do usuário
	 * @param passwd O senha do usuário
	 * @throws ClassNotFoundException Caso o driver de conexão não estaja disponível
	 * @throws SQLException em caso de uma conexão malformatada
	 */
	private void connectMysql(String host,String nomeDB,String user,String passwd) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
	    this.conn = DriverManager.getConnection("jdbc:mysql://"+host+"/"+nomeDB+"?user="+user+"&password="+passwd);
	    Log.getLoginstance(null).info("Conectado com sucesso ao banco "+nomeDB+" com usuário "+user);
	} 
	
}
