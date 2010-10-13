package persistencia;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import pessoas.Cliente;
import persistencia.PersistenciaCliente;


public class PersistenciaClienteTestes {

	@Test
	public void testCadastro() throws IOException {
		PersistenciaCliente persistenciaClienteTeste = PersistenciaCliente.getInstance();
		Cliente clienteTeste = new Cliente("063507306-40","Luiz Carlos Oliveira","bla","bla");
		assertEquals(true,persistenciaClienteTeste.cadastro(clienteTeste));
		persistenciaClienteTeste.removerCliente("Luiz Carlos Oliveira");
		
		
	}
	
	@Test
	public void testSave() throws IOException {
		PersistenciaCliente persistenciaClienteTeste = PersistenciaCliente.getInstance();
		assertEquals(true, persistenciaClienteTeste.save());
	}

	@Test
	public void testSearchCliente() throws IOException {
		PersistenciaCliente persistenciaClienteTeste = PersistenciaCliente.getInstance();
		Cliente clienteTeste = new Cliente("063507306-40", "Luiz Carlos Oliveira","bla","bla");
		persistenciaClienteTeste.cadastro(clienteTeste);
		assertEquals(clienteTeste,persistenciaClienteTeste.searchCliente("063507306-40"));
		assertEquals(clienteTeste,persistenciaClienteTeste.searchCliente("Luiz Carlos Oliveira"));
		assertEquals(null,persistenciaClienteTeste.searchCliente("nome inexistente"));
		assertEquals(null,persistenciaClienteTeste.searchCliente("876817618761876"));
		persistenciaClienteTeste.removerCliente("Luiz Carlos Oliveira");
	}

	@Test
	public void testOverview() throws FileNotFoundException, IOException {
		PersistenciaCliente persistenciaClienteTeste = PersistenciaCliente.getInstance();
		persistenciaClienteTeste.purge();
		//overview sem itens na lista
		assertEquals(null,persistenciaClienteTeste.overview());
		Cliente clienteTeste = new Cliente("063507306-40", "Luiz Carlos Oliveira","bla","bla");
		persistenciaClienteTeste.cadastro(clienteTeste);
		assertNotNull(persistenciaClienteTeste.overview());
		persistenciaClienteTeste.getCliente();
		
		
		
	}

}
