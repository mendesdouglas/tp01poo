package estoque;

public class Estoque {

	public Estoque (){}
	/**
	 * 
	 */
	public static float calculaPrecoMedioPonderado (ItemCompra itemCompra) {
		float result = ((itemCompra.getQuantItem()*itemCompra.getPrecoCustoItem())+(itemCompra.getQuant()*itemCompra.getPrecoCompra()))/(itemCompra.getQuantItem()+itemCompra.getQuant());
		return result;
	}
}

