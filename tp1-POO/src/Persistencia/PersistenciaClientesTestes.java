package Persistencia;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Pessoas.Cliente;

public class PersistenciaClientesTestes {

	@Test
	public void testCadastro() {
		PersistenciaClientes persistenciaClienteTeste = PersistenciaClientes.getInstance();
		Cliente clienteTeste = new Cliente("063507306-40", "Luiz Carlos Oliveira","bla","bla");
		assertEquals(true,persistenciaClienteTeste.cadastro(clienteTeste));
	}
	
	@Test
	public void testSave() throws IOException {
		PersistenciaClientes persistenciaClienteTeste = PersistenciaClientes.getInstance();
		assertEquals(true, persistenciaClienteTeste.save());
	}

	@Test
	public void testSearchCliente() {
		fail("Not yet implemented");
	}

	@Test
	public void testOverview() {
		fail("Not yet implemented");
	}

}
