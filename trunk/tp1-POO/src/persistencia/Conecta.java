package persistencia;

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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	 
	public static Conecta getConnection(){
		if(connection == null) {
			connection = new Conecta();
	    }
	    return connection;
	 }
	
	private void connectSqlite(String nomeDB) throws ClassNotFoundException, SQLException{
		Class.forName("org.sqlite.JDBC");
	    this.conn = DriverManager.getConnection("jdbc:sqlite:"+nomeDB);		
	}
	
	private void connectMysql(String host,String nomeDB,String user,String passwd) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
	    this.conn = DriverManager.getConnection("jdbc:mysql://"+host+"/"+nomeDB+"?user="+user+"&password="+passwd);
	} 
	
}
