package estoque;

public class Estoque {

	public Estoque (){}
	/**
	 * 
	 */
	public float calculaPMP (ItemCompra itemCompra) {
		return (itemCompra.getPrecoCustoItem()+itemCompra.getPrecoCompra())/2;
	}
}

