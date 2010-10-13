package estoque;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstoqueTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalculaPrecoMedioPonderado() {
		Item itemTest = new Item ("Camisa",1200,(float)1,(float)20,10);
		ItemCompra itemCompraTest = new ItemCompra (itemTest,(float) 1.10,10);
		float result = (float) 1.05;
		assertEquals(result, Estoque.calculaPrecoMedioPonderado(itemCompraTest));
	}

}
