package persistencia;

import java.sql.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import exceptions.PasswordsDontMatchException;
import exceptions.UserNotFoundException;

public class AccessControl {
	
	/**
	 * Realiza o login do usuário no sistema
	 * @param username Nome do usuário
	 * @param passwd Senha do usuário
	 * @param adminRquired true se privilégios administrativos são requeridos, senao false
	 * @return true se usuário existe ou é administrador(no caso de ser requerido)
	 * @return false se usuário não existe ou nao é administrador(no caso de ser requerido)
	 * @throws UserNotFoundException Caso o usuário nao exista no banco 
	 * @throws PasswordsDontMatchException  caso a senha informada nao bata com a senha armazenada no banco
	 * @exception SQLException no caso de erro na conexão
	 */
	public static boolean login(String username,String passwd,boolean adminRequired) throws UserNotFoundException, PasswordsDontMatchException{
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
						throw new PasswordsDontMatchException(passwd);
					}		
				}
				else{
					if(rs.getString("passwd").equals(processa(passwd))){
						Log.getLoginstance(null).info("Usuário "+username+" Logado com sucesso no sistema");
						return true;
					}
					else{
						throw new PasswordsDontMatchException(passwd);
					}
				}
			}
			else{
				throw new UserNotFoundException(username);
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
	public static boolean cadastroUsuario(String name,String username,String passwd,Integer access){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				Log.getLoginstance(null).error("Tentativa de cadastro de usuário já existente "+username);
				return false;
			}
			stat.executeUpdate("insert into Users (completeName,name,passwd,permition) values ('"+name+"','"+username+"','"+processa(passwd)+"','"+access.toString()+"')");
			Log.getLoginstance(null).info("Usuário "+name+" de login "+username+" cadastrado com sucesso");
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
	 * @throws UserNotFoundException caso o usuário não estaja cadastrado
	 * @exception SQLException no caso de erro na conexão
	 */
	public static boolean RemoverUsuario(String username,String passwd) throws UserNotFoundException{
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
					throw new UserNotFoundException(username);
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
	
