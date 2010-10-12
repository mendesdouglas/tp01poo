package pessoas;

public class Fornecedor extends Pessoa {
	 
	private String cnpj;

	public Fornecedor (String cnpj,String nome) {
		super (nome);
		this.cnpj = cnpj;
	}
	
	public Fornecedor (String cnpj,String nome,String endereco,String telefone) {
		super (nome,endereco,telefone);
		this.cnpj = cnpj;
	}
	public String getCnpj (  ) {
		return this.cnpj;
	}
	
	public void setCnpj ( String cnpj  ) {
		this.cnpj = cnpj;
	}
}

