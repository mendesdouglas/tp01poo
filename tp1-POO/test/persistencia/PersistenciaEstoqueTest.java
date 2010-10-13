package persistencia;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class PersistenciaEstoqueTest {

	@Test
	public void testSave() throws IOException {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		assertEquals(true,persistenciaEstoqueTeste.save());
	}

	@Test
	public void testSaveCompra() {
		PersistenciaEstoque persistenciaEstoqueTeste = PersistenciaEstoque.getInstance();
		assertEquals(true,persistenciaEstoqueTeste.saveCompra(compra);
	}

	@Test
	public void testSavePedido() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchItemInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchItemString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCadastro() {
		fail("Not yet implemented");
	}

	@Test
	public void testOverview() {
		fail("Not yet implemented");
	}

}
