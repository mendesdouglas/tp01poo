package Estoque;

public class ItemPedido {

	Item item;
	private float precoPedido;
	private int quant;
	
	public ItemPedido (float precoPedido,int quant) {
		this.precoPedido = precoPedido;
		this.quant = quant;
	}
	
	/**
	 * Get the value of precoPedido
	 * @return the value of precoPedido
	 */
	public Item getItem () {
		return this.item;
	}
	/**
	 * Set the value of precoPedido
	 */
	public void setItem (Item item) {
		this.item = item;
	}
	/**
	 * Get the value of precoPedido
	 * @return the value of precoPedido
	 */
	public float getPrecoPedido () {
		return this.precoPedido;
	}
	/**
	 * Set the value of precoPedido
	 */
	public void setPrecoPedido (float precoPedido) {
		this.precoPedido = precoPedido;
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
	public void setQuant (int quant) {
		this.quant = quant;
	}
}

