package Estoque;

public class Estoque {

	public Estoque (){}
	/**
	 * 
	 */
	public float calculaMP (ItemCompra itemCompra) {
		return (itemCompra.getItem().getPrecoCusto()+itemCompra.getPrecoCompra())/2;
	}
}

