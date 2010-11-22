package exceptions;

public class UserNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;

	public UserNotFoundException(String username){
		super("Usuário "+username+" não existe na Base de dados");
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}

}
