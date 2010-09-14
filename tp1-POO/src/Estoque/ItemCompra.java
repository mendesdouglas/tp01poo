package Estoque;

public class ItemCompra {
 
	private float preco; 
	private int quant;

	public ItemCompra (float preco,int quant) {
		this.preco = preco;
		this.quant = quant;		
	}
 
	private float getPreco (  ) {
		return this.preco;
	}
	private void setPreco (float preco) {
		this.preco = preco;
	}
	private int getQuant () {
		return this.quant;
	}
	private void setQuant (int quant) {
		this.quant = quant;
	}
}

