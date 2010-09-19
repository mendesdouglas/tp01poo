package Estoque;

public class ItemCompra {

	private Item item;
	private float precoCompra;
	private int quant;

	public ItemCompra (float precoCompra,int quant){
		this.precoCompra = precoCompra;
		this.quant = quant;	
	}
	
	/**
	 * Get the value of precoCompra
	 * @return the value of precoCompra
	 */
	public float getPrecoCompra () {
		return this.precoCompra;
	}
	/**
	 * Set the value of precoCompra
	 */
	public void setPrecoCompra ( float precoCompra  ) {
		this.precoCompra = precoCompra;
	}
	
	/**
	 * Get the value of item
	 * @return the value of item
	 */
	public Item getItem () {
		return this.item;
	}
	/**
	 * Set the value of precoCompra
	 */
	public void setItem ( Item item  ) {
		this.item = item;
	}
	/**
	 * Get the value of quant
	 * @return the value of quant
	 */
	public int getQuant () {
		return this.quant;
	}
	/**
	 * Set the value of quant
	 */
	public void setQuant ( int quant  ) {
		this.quant = quant;
	}
}

