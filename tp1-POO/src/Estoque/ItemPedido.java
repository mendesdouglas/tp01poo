package Estoque;

public class ItemPedido {

	private Item item;
	private float precoPedido;
	private int quant;

	public ItemPedido (Item item,int quant) {
		this.item = item;
		this.quant = quant;
		this.precoPedido = ((this.item.getPrecoCusto()*this.item.getMargemLucro())+this.item.getPrecoCusto());
	}
	
	/**
	 * Get the value of codigo of Item
	 * @return the value of codigo
	 */
	public int getCodigoItem () {
		return this.item.getCodigo();
	}
	/**
	 * Get the value of precoPedido
	 * @return the value of precoPedido
	 */
	
	public String getNomeItem () {
		return this.item.getNome();
	}
	/**
	 * Get the value of precoPedido
	 * @return the value of precoPedido
	 */
	public float getPrecoPedido () {
		return this.precoPedido;
	}

	/**
	 * Get the value of quant
	 * @return the value of quant
	 */
	public int getQuant () {
		return this.quant;
	}

	/**
	 * Get the value of quant
	 * @return the value of quant
	 */
	public int getQuantItem () {
		return this.item.getQuant();
	}	
	/**
	 * Set the value of quant
	 */
	public boolean setQuant (int quant) {
		if (quant > 0){
			this.quant = quant;
			return true;	
		}
		return false;
	}
}

