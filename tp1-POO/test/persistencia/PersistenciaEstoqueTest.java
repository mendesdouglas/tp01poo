package persistencia;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import pessoas.Cliente;
import pessoas.Fornecedor;

import estoque.Compra;
import estoque.Item;
import estoque.Pedido;

public class PersistenciaEstoqueTest {

	@Test
	public void testSave() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		assertEquals(true,persistenciaEstoqueTeste.save());
	}

	@Test
	public void testSaveCompra() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		Fornecedor fornecedor = new Fornecedor("18979187","fornecedorteste");
		Compra compra = new Compra(fornecedor);
		//salvando compra vazia
		assertEquals(false,persistenciaEstoqueTeste.saveCompra(compra));
		compra.addItem(new Item("camisa",1212,(float)9.80,(float)0.35,9),(float)8.9,4);
		//salvando compra nao vazia
		assertEquals(true,persistenciaEstoqueTeste.saveCompra(compra));
	}

	@Test
	public void testSavePedido() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		Cliente cliente = new Cliente("18979187","clienteteste");
		Pedido pedido = new Pedido(cliente);
		//salvando pedido vazia
		assertEquals(false,persistenciaEstoqueTeste.savePedido(pedido));
		pedido.addItem(new Item("camisa",1212,(float)9.80,(float)0.35,9),4);
		//salvando compra nao vazia
		assertEquals(true,persistenciaEstoqueTeste.savePedido(pedido));
	}

	@Test
	public void testSearchItemInt() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		persistenciaEstoqueTeste.cadastro(new Item("camisa",1212,(float)9.80,(float)0.35,9));
		//pesquisando por item ineistente
		assertEquals(null,persistenciaEstoqueTeste.searchItem(2424242));
		//pesquisando por item existente
		assertNotNull(persistenciaEstoqueTeste.searchItem(1212));
		persistenciaEstoqueTeste.delItem(1212);
	}

	@Test
	public void testSearchItemString() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		persistenciaEstoqueTeste.cadastro(new Item("camisa",1212,(float)9.80,(float)0.35,9));
		//pesquisando por item ineistente
		assertEquals(null,persistenciaEstoqueTeste.searchItem("skjabskjaslkjaskj"));
		//pesquisando por item existente
		assertNotNull(persistenciaEstoqueTeste.searchItem("camisa"));
		persistenciaEstoqueTeste.delItem(1212);
	}

	@Test
	public void testCadastro() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		//adicionando item novo
		assertEquals(true,persistenciaEstoqueTeste.cadastro(new Item("camisa",1212,(float)9.80,(float)0.35,9)));
		//adicionando item existente
		assertEquals(false,persistenciaEstoqueTeste.cadastro(new Item("camisa",1212,(float)9.80,(float)0.35,9)));
		persistenciaEstoqueTeste.delItem(1212);
	}

	@Test
	public void testOverview() {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		persistenciaEstoqueTeste.purge();
		//overview sem itens na lista
		assertEquals(null,persistenciaEstoqueTeste.overview());
		
		Item ItemTeste = new Item("camisa",1212,(float)9.80,(float)0.35,9);
		persistenciaEstoqueTeste.cadastro(ItemTeste);
		//overview Com itens na lista
		assertNotNull(persistenciaEstoqueTeste.overview());
	}

}
