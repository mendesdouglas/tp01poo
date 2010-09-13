package Estoque;

public class Item {
 
	private String nome; 
	private int codigo;
	private float precoCusto; 
	private float margemLucro;
	private int quant;

	public Item () { }

	private String getNome () {
		return this.nome;
	}

	private void setNome ( String value  ) {
		this.nome = value;
	}

	private int getCodigo (  ) {
		return this.codigo;
	}

	private void setCodigo ( int value  ) {
		this.codigo = value;
	}

	private float getPrecoCusto (  ) {
		return this.precoCusto;
	}
 
	private void setPrecoCusto ( float value  ) {
		this.precoCusto = value;
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

