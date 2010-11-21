package persistencia;

import java.sql.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AccessControl {
	
	/**
	 * Realiza o login do usuário no sistema
	 * @param username Nome do usuário
	 * @param passwd Senha do usuário
	 * @param adminRquired true se privilégios administrativos são requeridos, senao false
	 * @return true se usuário existe ou é administrador(no caso de ser requerido)
	 * @return false se usuário não existe ou nao é administrador(no caso de ser requerido)
	 * @exception SQLException no caso de erro na conexão
	 */
	public static boolean login(String username,String passwd,boolean adminRequired){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				if (adminRequired){
					if (rs.getString("passwd").equals(processa(passwd)) && isAdmin(username)){
						Log.getLoginstance(null).info("Usuário "+username+" Logado com sucesso no sistema");
						return true;
					}
					else{
						Log.getLoginstance(null).error("Senha informada está errada");
						return false;
					}		
				}
				else{
					if(rs.getString("passwd").equals(processa(passwd))){
						Log.getLoginstance(null).info("Usuário "+username+" Logado com sucesso no sistema");
						return true;
					}
					else{
						Log.getLoginstance(null).error("Senha informada está errada");
						return false;
					}
				}
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			Log.getLoginstance(null).error(e.getMessage());
			return false;
		}
	}
	
	/**
	 * Realiza o cadastro do usuário no sistema
	 * @param username Nome do usuário
	 * @param passwd Senha do usuário
	 * @param admin se usuário terá privilégios administrativos
	 * @return true no caso do cadstro ocorrer com sucesso
	 * @return false caso o cadstro não ocorra com sucesso
	 * @exception SQLException no caso de erro na conexão
	 */	
	public static boolean cadastroUsuario(String username,String passwd,Boolean admin){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				Log.getLoginstance(null).error("Tentativa de cadstro de usuário já existente "+username);
				return false;
			}
			stat.executeUpdate("insert into Users (name,passwd,admin) values ('"+username+"','"+processa(passwd)+"','"+admin.toString()+"')");
			Log.getLoginstance(null).info("Usuário "+username+" cadastrado com sucesso");
			return true;
		} catch (SQLException e) {
			Log.getLoginstance(null).error(e.getMessage());
			return false;
		}
	}
	
	/**
	 * Remove o cadastro do usuário no sistema
	 * @param username Nome do usuário
	 * @param passwd Senha do usuário
	 * @return true no caso da remoção ocorrer com sucesso
	 * @return false caso da remoção não ocorrer com sucesso
	 * @exception SQLException no caso de erro na conexão
	 */
	public static boolean RemoverUsuario(String username,String passwd){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				if (rs.getString("passwd").equals(processa(passwd))){
					stat.executeUpdate("delete from Users where name='"+username+"'");
					Log.getLoginstance(null).info("Usuário "+username+" removido com sucesso");
					return true;
				}
				else{
					Log.getLoginstance(null).error("Usuário "+username+" nao pode ser removido pois não existe");
					return false;
				}
			}
		} catch (SQLException e) {
			Log.getLoginstance(null).error(e.getMessage());
			return false;
		}
		return false;
	}
	
	/**
	 * Verifica se o usuário tem privilégios administrativos
	 * @param username Nome do usuário
	 * @return true em caso positivo
	 * @return false em caso negativo
	 * @exception SQLException no caso de erro na conexão
	 */
	public static boolean isAdmin(String username){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				return rs.getString("admin").equalsIgnoreCase("true");
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			Log.getLoginstance(null).error(e.getMessage());
			return false;
		}
		
	}
	
	/**
	 * Método para gerar uma hash da senha do usuário para armazenamento no banco de dados 
	 * @param senha Senha do usuário
	 * @return hash da senha passada como parâmetro
	 * @exception SQLException no caso de erro na conexão
	 */
	public static String processa(String senha){
		String sen = "";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			Log.getLoginstance(null).error(e.getMessage());
		}
		BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
		sen = hash.toString(16);			
		return sen;
	}
	
}
	

