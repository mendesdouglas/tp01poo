package exceptions;

public class UserNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String username;
/**
 * 
 * Exceção implementada para tratar casos em que o usuário não
 * foi encontrado no banco de dados
 * @param username
 */
	public UserNotFoundException(String username){
		super("Usuário "+username+" não existe na Base de dados");
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}

}
