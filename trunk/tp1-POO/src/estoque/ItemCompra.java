package estoque;

public class ItemCompra {

	private Item item;
	private float precoCompra;
	private int quant;

	public ItemCompra (Item item,float precoCompra,int quant){
		this.item = item;
		this.precoCompra = precoCompra;
		this.quant = quant;	
		
	}
	
	/**
	 * Recupera o código de um itemCompra.
	 * 
	 * @return O código de um itemCompra.
	 */
	public int getCodigoItem () {
		return this.item.getCodigo();
	}
	
	/**
	 * Recupera a quantidade de um de um itemCompra numa compra em aberto.
	 * 
	 * @return A quantidade de um itemCompra numa compra em aberto.
	 */
	public int getQuantItem () {
		return this.item.getQuant();
	}
	
	/**
	 * Recupera o nome de um itemCompra.
	 * 
	 * @return O nome de um itemCompra.
	 */
	public String getNomeItem () {
		return this.item.getNome();
	}
	
	/**
	 * Recupera o valor do preço de custo de um itemCompra.
	 * 
	 * @return O preço de custo de um itemCompra.
	 */
	public float getPrecoCustoItem () {
		return this.item.getPrecoCusto();
	}
	
	/**
	 * Recupera o valor do preço de compra de um itemCompra.
	 * 
	 * @return O preço de compra de um itemCompra.
	 */
	public float getPrecoCompra () {
		return this.precoCompra;
	}

	/**
	 * Altera o valor do preço de compra de um itemCompra.
	 * 
	 * @param precoCompra ????
	 */
	public void setPrecoCompra ( float precoCompra  ) {
		this.precoCompra = precoCompra;
	}
	
	/**
	 * Recupera a quantidade de um itemCompra numa compra em aberto.
	 * 
	 * @return A quantidade de um itemCompra numa compra ainda em aberto.
	 */
	public int getQuant () {
		return this.quant;
	}
	/**
	 * Altera a quantidade de um itemCompra numa compra ainda em aberto.
	 * 
	 * @param quant Inteiro com a nova quantidade a ser alterada.
	 */
	public void setQuant ( int quant  ) {
		this.quant = quant;
	}
}

