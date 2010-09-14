package Pessoas;
 
public class Cliente extends Pessoa{
	
	private String cpf;
	
	public Cliente(String nome,int codigo,String endereco,String telefone,String cpf){
		super(nome,codigo,endereco,telefone);	
		this.cpf = cpf;
	}
	
	private String getCpf(){
		return this.cpf;
	}
	
	private void setCpf(String cpf){
		this.cpf = cpf;
	}
	
}

