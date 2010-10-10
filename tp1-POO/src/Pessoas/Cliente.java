package Pessoas;

public class Cliente extends Pessoa {

	private String cpf;
	
	public Cliente (String cpf,String nome) {
		super (nome);
		this.cpf = cpf;
	}
	
	public Cliente (String cpf,String nome,String endereco,String telefone ) {
		super (nome,endereco,telefone);
		this.cpf = cpf;
	}
		
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

