package cui;
import java.io.IOException;

import persistencia.AccessControl;
import persistencia.Log;



public class Main {

	/**
	 * Realiza o login no sistema, a partir da entrada do nome de usuário e da senha
	 * e registra em um arquivo de log esse acesso.
	 * @author Isac
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//AccessControl.RemoverUsuario("admin2","senha");
		//AccessControl.cadastroUsuario("admin","senha", true);
		System.out.println("Informe seu nome de usuario:");
		String username = Console.readString();
		System.out.println("Informe sua senha");
		String passwd = Console.readString();
				
		if (AccessControl.login(username, passwd,true)){
			Log log = Log.getLoginstance(null);
			log.info("Autentication sucessfull for user "+username);
			log.error("erro!");
			log.warn("warning");
			log.fatal("fatal");
			Menu.principal();
		} 
		else{
			System.out.println("privilégios administrativos requeridos para acesso ao sistema!!");
		}
	}
}
