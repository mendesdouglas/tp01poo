package cui;

import java.sql.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import persistenciaDB.Conecta;

public class AccessControl {

	public static boolean login(String username,String passwd,boolean adminRequired){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				if (adminRequired){
					return (rs.getString("passwd").equals(processa(passwd)) && isAdmin(username));
				}
				else return rs.getString("passwd").equals(processa(passwd));
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static boolean cadastroUsuario(String username,String passwd,Boolean admin){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				return false;
			}
			stat.executeUpdate("insert into Users (name,passwd,admin) values ('"+username+"','"+processa(passwd)+"','"+admin.toString()+"')");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	public static boolean RemoverUsuario(String username,String passwd){
		ResultSet rs;
		try {
			Statement stat = Conecta.getConnection().conn.createStatement();
			rs = stat.executeQuery("select * from Users where name='"+username+"'");
			if (rs.next()){
				if (rs.getString("passwd").equals(processa(passwd))){
					stat.executeUpdate("delete from Users where name='"+username+"'");
					return true;
				}
				else{
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
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
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static String processa(String senha){
		String sen = "";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
		sen = hash.toString(16);			
		return sen;
	}
	
}
	

