package Estoque;

public class Estoque {

	public Estoque (){}
	/**
	 * 
	 */
	public float calculaMP (ItemCompra itemCompra) {
		return (itemCompra.getPrecoCustoItem()+itemCompra.getPrecoCompra())/2;
	}
}

