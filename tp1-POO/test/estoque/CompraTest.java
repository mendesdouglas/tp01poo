package estoque;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import pessoas.Fornecedor;

public class CompraTest {
	
	private Compra constroiCompra() throws IOException {
		Fornecedor fornecedor = new Fornecedor ("032568956-80","iFree Ltda");
		Compra compra = new Compra(fornecedor);
		Item item0 = new Item("camisa",1212,(float)9.80,(float)0.35,9);
		Item item1 = new Item("blusa",1213,(float)9.80,(float)0.35,9);
		Item item2 = new Item("calça",1214,(float)9.80,(float)0.35,9);
		Item item3 = new Item("tenis",1215,(float)9.80,(float)0.35,9);
		compra.addItem(item0,(float)3.90,4);
		compra.addItem(item1,(float)3.90,4);
		compra.addItem(item2,(float)3.90,4);
		compra.addItem(item3,(float)3.90,4);
		return compra;
	}
	

	@Test
	public void testSetQuantidade() throws IOException {
		Compra compra = constroiCompra();
		//Setando quantidade positiva
		assertEquals(true, compra.setQuantidade(0,10));
		//Setando quantidade negativa
		assertEquals(false, compra.setQuantidade(0,-5));
		//Setando quantidade quantidade numa posição inexistente
		assertEquals(false, compra.setQuantidade(4,10));
	}

	@Test
	public void testSetPrecoCompra() throws IOException {
		Compra compra = constroiCompra();
		//Setando preço positivo
		assertEquals(true, compra.setPrecoCompra(0,(float)10));
		//Setando preço negativo
		assertEquals(false, compra.setPrecoCompra(0,(float)-5));
		//Setando preço numa posição inexistente
		assertEquals(false, compra.setPrecoCompra(4,(float)10));
	}

	@Test
	public void testRemoveLinha() throws IOException {
		Compra compra = constroiCompra();
		//Removendo linha inexistente
		assertEquals(false, compra.removeLinha(4));
		//Removendo uma linha existente
		assertEquals(true, compra.removeLinha(3));
		
	}

	@Test
	public void testAddItem() throws IOException {
		Compra compra = constroiCompra();
		Item itemTeste = new Item("tenis",1215,(float)9.80,(float)0.35,9);
		Item itemTeste2 = new Item("camiseta",1216,(float)9.80,(float)0.35,9);
		
		//Adicionando um item já existente na compra
		assertEquals(false, compra.addItem(itemTeste, (float)3.90, 4));
		//Adicionando um item na compra
		assertEquals(true, compra.addItem(itemTeste2, (float)3.90, 4));
		
	}

	@Test
	public void testOverview() throws IOException {
		Fornecedor fornecedor = new Fornecedor ("032568956-80","iFree Ltda");
		Compra compra = new Compra(fornecedor);
		
		assertEquals(null,compra.overview());
		
		Item item0 = new Item("camisa",1212,(float)9.80,(float)0.35,9);
		Item item1 = new Item("blusa",1213,(float)9.80,(float)0.35,9);
		Item item2 = new Item("calça",1214,(float)9.80,(float)0.35,9);
		Item item3 = new Item("tenis",1215,(float)9.80,(float)0.35,9);
		compra.addItem(item0,(float)3.90,4);
		compra.addItem(item1,(float)3.90,4);
		compra.addItem(item2,(float)3.90,4);
		compra.addItem(item3,(float)3.90,4);
		
		assertNotNull(compra.overview());		
		
	}

}
