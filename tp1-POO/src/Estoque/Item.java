package Estoque;

public class Item {
 
	private String nome; 
	private int codigo;
	private float precoCusto; 
	private float margemLucro;
	private int quant;

	public Item (String nome,int codigo,float precoCusto,float margemLucro,int quant) {
		this.nome = nome;
		this.codigo = codigo;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
		
	}

	private String getNome () {
		return this.nome;
	}

	private void setNome ( String nome  ) {
		this.nome = nome;
	}

	private int getCodigo () {
		return this.codigo;
	}
	
	private void setCodigo ( int codigo  ) {
		this.codigo = codigo;
	}

	private float getPrecoCusto () {
		return this.precoCusto;
	}
 
	private void setPrecoCusto ( float precoCusto  ) {
		this.precoCusto = precoCusto;
	}

	private float getMargemLucro (  ) {
		return this.margemLucro;
	}
 
	private void setMargemLucro ( float value  ) {
		this.margemLucro = value;
	}
 
	private int getQuant (  ) {
		return this.quant;
	}

	private void setQuant ( int value  ) {
		this.quant = value;
	}

}

