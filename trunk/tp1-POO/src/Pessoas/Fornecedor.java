package Pessoas;

public class Fornecedor extends Pessoa {
	 
	private String cnpj;
	public Fornecedor (String cnpj,String nome,int codigo,String endereco,String telefone) {
		super (nome,codigo,endereco,telefone);
		this.cnpj = cnpj;
	}
	public String getCnpj (  ) {
		return this.cnpj;
	}
	
	public void setCnpj ( String cnpj  ) {
		this.cnpj = cnpj;
	}
}

