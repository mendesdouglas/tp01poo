package Pessoas;

public class Pessoa {
 
	private String nome; 
	private int codigo;
	private String endereco;
	private String telefone;

	public Pessoa (String nome,int codigo,String endereco,String telefone) {
		this.nome = nome; 
		this.codigo = codigo;
		this.endereco = endereco;
		this.telefone = telefone;	
		
	}

	private String getNome () {
		return this.nome;
	}
	 
	private void setNome (String nome) {
		this.nome = nome;
	}
	 
	private int getCodigo () {
		return this.codigo;
	}
	
	private void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	 
	private String getEndereco () {
		return this.endereco;
	}
	 
	private void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	 
	private String getTelefone () {
		return this.telefone;
	}
	 
	private void setTelefone (String telefone) {
		this.telefone = telefone;
	}
}

