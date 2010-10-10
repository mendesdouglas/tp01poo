package Pessoas;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa (String nome) {
		this.nome = nome;
		}
	
	public Pessoa (String nome,String endereco,String telefone ) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome () {
		return this.nome;
	}
	public void setNome ( String nome  ) {
		this.nome = nome;
	}
	
	public String getEndereco () {
		return this.endereco;
	}
	 public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone () {
		return this.telefone;
	}
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
}

