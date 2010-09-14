package Pessoas;
 
public class Fornecedor extends Pessoa{

	private String cnpj;

	public Fornecedor(String nome,int codigo,String endereco,String telefone,String cnpj){
		super(nome,codigo,endereco,telefone);	
		this.cnpj = cnpj;
	}
	
	private String getCnpj(  ) {
		return cnpj;
	}
 
	private void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

}

