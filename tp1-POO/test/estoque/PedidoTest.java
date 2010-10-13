package estoque;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import cui.Console;

import pessoas.Cliente;

public class PedidoTest {

	private Pedido populaPedido() {
		Cliente cliente = new Cliente("123123","testecliente","endereco","33717171");
		Pedido pedido = new Pedido(cliente);
		Item item0 = new Item("camisa",1212,(float)9.80,(float)0.35,9);
		Item item1 = new Item("blusa",1213,(float)9.80,(float)0.35,9);
		Item item2 = new Item("calça",1214,(float)9.80,(float)0.35,9);
		Item item3 = new Item("tenis",1215,(float)9.80,(float)0.35,9);
		pedido.addItem(item0,4);
		pedido.addItem(item1,4);
		pedido.addItem(item2,4);
		pedido.addItem(item3,4);
		return pedido;
	}
	
	@Test
	public void testGetNomeCliente() {
		Pedido pedido = populaPedido();
		assertEquals("testecliente",pedido.getNomeCliente());
	}
	@Test
	public void testGetCpfCliente() {
		Pedido pedido = populaPedido();
		assertEquals("123123",pedido.getCpfCliente());
	}

	@Test
	public void testGetDataPedido() {
		Pedido pedido = populaPedido();
		assertEquals(new Date(),pedido.getDataPedido());
	}

	@Test
	public void testGetDataPedidoString() {
		Pedido pedido = populaPedido();
		assertEquals(Console.date2str(null, null),pedido.getDataPedido(null));
	}

	@Test
	public void testSetQuantidade() {
		Pedido pedido = populaPedido();
		//colocado uma quantidade de itens que existe no estoque
		assertEquals(true,pedido.setQuantidade(0,2));
		//agora colocando uma quantidade de itens que nao existe no estoque
		assertEquals(false,pedido.setQuantidade(0,10));
	}

	@Test
	public void testGetCodigoItem() {
		Pedido pedido = populaPedido();
		assertEquals(1212,pedido.getCodigoItem(0));
		assertEquals(1213,pedido.getCodigoItem(1));
	}

	@Test
	public void testDelItem() {
		Pedido pedido = populaPedido();
		assertEquals(true,pedido.delItem(0));
		assertEquals(false,pedido.delItem(10));
	}

	@Test
	public void testSearchItemPedido() {
		Pedido pedido = populaPedido();
		//codigo valido
		assertEquals(true,pedido.searchItemPedido(1212));
		//codigo invalido
		assertEquals(false,pedido.searchItemPedido(6666));		
	}

	@Test
	public void testAddItem() {
		Pedido pedido = populaPedido();
		Item item0 = new Item("camisa",1212,(float)9.80,(float)0.35,9);
		Item item1 = new Item("top",1216,(float)9.80,(float)0.35,9);
		//adicionando item que ja esta no pedido
		assertEquals(false,pedido.addItem(item0,4));
		//adicionando item valido,mas com uma quantidade errada
		assertEquals(false,pedido.addItem(item1,17));
		//adicionando item valido com quantidade valida
		assertEquals(true,pedido.addItem(item1,4));
	}

	@Test
	public void testOverview() {
		Cliente cliente = new Cliente("123123","testecliente","endereco","33717171");
		Pedido pedido = new Pedido(cliente);
		
		assertEquals(null,pedido.overview());
		
		Item item0 = new Item("camisa",1212,(float)9.80,(float)0.35,9);
		Item item1 = new Item("blusa",1213,(float)9.80,(float)0.35,9);
		Item item2 = new Item("calça",1214,(float)9.80,(float)0.35,9);
		Item item3 = new Item("tenis",1215,(float)9.80,(float)0.35,9);
		pedido.addItem(item0,4);
		pedido.addItem(item1,4);
		pedido.addItem(item2,4);
		pedido.addItem(item3,4);
		
		assertNotNull(pedido.overview());
		
	}

}
