package Pessoas;
 
public class Fornecedor extends Pessoa{

	private String cnpj;

	public Fornecedor(String cnpj){ 
		this.cnpj = cnpj;
	}
	
	private String getCnpj(  ) {
		return cnpj;
	}
 
	private void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

}

