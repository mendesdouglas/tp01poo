package estoque;

public class Estoque {

	public Estoque (){}

	/**
	 * Calcula o preço médio ponderado baseado no preço de custo dos ItemCompra recém cadastrados.
	 * 
	 * @param itemCompra Objeto da classe ItemCompra
	 * @return O novo preço para os itens do mesmo tipo.
	 */
	public static float calculaPrecoMedioPonderado (ItemCompra itemCompra) {
		float result = ((itemCompra.getQuantItem()*itemCompra.getPrecoCustoItem())+(itemCompra.getQuant()*itemCompra.getPrecoCompra()))/(itemCompra.getQuantItem()+itemCompra.getQuant());
		return result;
	}
}

