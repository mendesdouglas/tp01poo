package cui;
import java.io.IOException;
import java.sql.SQLException;

import exceptions.PasswordsDontMatchException;
import exceptions.UserNotFoundException;

import persistencia.AccessControl;
import persistencia.Log;



public class Main {

	/**
	 * Realiza o login no sistema, a partir da entrada do nome de usuário e da senha
	 * e registra em um arquivo de log esse acesso.
	 * @author Isac
	 * @param args
	 * @throws IOException
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws IOException, SQLException {
		AccessControl.cadastroUsuario("isac2","isac2","senha2",1);
		//AccessControl.cadastroUsuario("vendedor","vendedor",false);
		//AccessControl.cadastroUsuario("comprador","comprador",false);
		Log.getLoginstance(null).info("info");
		Log.getLoginstance(null).error("erro!");
		Log.getLoginstance(null).warn("warning");
		Log.getLoginstance(null).fatal("fatal");
		
		System.out.println("Informe seu nome de usuario:");
		String username = Console.readString();
		System.out.println("Informe sua senha");
		String passwd = Console.readString();
				
		try {
			if (AccessControl.login(username, passwd)){
				Menu.principal();
			} 
			else{
				System.out.println("privilégios administrativos requeridos para acesso ao sistema!!");
			}
		} catch (UserNotFoundException e) {
			System.out.println("usuário inexistente: "+e.getUsername());
			Log.getLoginstance(null).error(e.getMessage());	
		} catch (PasswordsDontMatchException e) {
			System.out.println("Password não bateu: "+e.getPasswd());
			Log.getLoginstance(null).error(e.getMessage());
		}
	}
}
