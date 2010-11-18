package cui;
import java.io.IOException;

import persistenciaDB.AccessControl;



public class Main {

	/**
	 * 
	 */
	public static void main(String[] args) throws IOException {
		//AccessControl.RemoverUsuario("admin2","senha");
		//AccessControl.cadastroUsuario("admin","senha", true);
		System.out.println("Informe seu nome de usuario:");
		String username = Console.readString();
		System.out.println("Informe sua senha");
		String passwd = Console.readString();
				
		if (AccessControl.login(username, passwd,true)){
			System.out.println("\nAutentication sucessfull for user "+username+"\n");
			Menu.principal();
		} 
		else{
			System.out.println("privilégios administrativos requeridos para acesso ao sistema!!");
		}
	}
}
