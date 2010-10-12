package estoque;

public class Estoque {

	public Estoque (){}
	/**
	 * 
	 */
	public static float calculaPrecoMedioPonderado (ItemCompra itemCompra) {
		return (itemCompra.getPrecoCustoItem()+itemCompra.getPrecoCompra())/2;
	}
}

