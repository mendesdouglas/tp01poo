package Pessoas;

public class Cliente extends Pessoa {

	private String cpf;
	
	public Cliente (String cpf,String nome,int codigo,String endereco,String telefone ) {
		super (nome,codigo,endereco,telefone);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

