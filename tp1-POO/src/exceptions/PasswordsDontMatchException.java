package exceptions;

public class PasswordsDontMatchException extends Exception {

	private static final long serialVersionUID = 1L;
	private String passwd;
/**
 * Excecão implementada para tratar casos em que a senha do usuário não é
 * compatível com a do banco de dados.
 * @param passwd
 */
	public PasswordsDontMatchException(String passwd) {
		super("A senha "+passwd+" não bate com a armazenada no banco");
		this.passwd = passwd;
	}
/**
 * Retorna um senha.  
 * @return  Retorna senha.
 */
	public String getPasswd() {
		return this.passwd;
	}
	


}
