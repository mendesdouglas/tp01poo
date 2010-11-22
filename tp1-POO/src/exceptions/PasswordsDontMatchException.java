package exceptions;

public class PasswordsDontMatchException extends Exception {

	private static final long serialVersionUID = 1L;
	private String passwd;

	public PasswordsDontMatchException(String passwd) {
		super("A senha "+passwd+" não bate com a armazenada no banco");
		this.passwd = passwd;
	}

	public String getPasswd() {
		return this.passwd;
	}
	


}
