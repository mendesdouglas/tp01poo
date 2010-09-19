package Pessoas;

public class Cliente extends Pessoa {

	private String cpf;
	
	public Cliente (String cpf,String nome,int codigo,String endereco,String telefone ) {
		super (nome,codigo,endereco,telefone);
		this.cpf = cpf;
	}
	
	private String getCpf() {
		return this.cpf;
	}
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

