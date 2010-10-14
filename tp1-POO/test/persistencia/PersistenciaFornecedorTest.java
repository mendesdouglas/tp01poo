package persistencia;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import pessoas.Fornecedor;

public class PersistenciaFornecedorTest {

	@Test
	public void testSave() throws IOException {
		PersistenciaFornecedor persistenciaFornecedorTeste = PersistenciaFornecedor.getInstance();
		assertEquals(true,persistenciaFornecedorTeste.save());
	}

	@Test
	public void testSearchFornecedor() throws IOException {
		PersistenciaFornecedor persistenciaFornecedorTeste = PersistenciaFornecedor.getInstance();
		Fornecedor fornecedorTest = new Fornecedor("65421324654", "iFree Ltda.","bla","bla");
		persistenciaFornecedorTeste.cadastro(fornecedorTest);
		assertEquals(fornecedorTest,persistenciaFornecedorTeste.searchFornecedor("65421324654"));
		assertEquals(fornecedorTest,persistenciaFornecedorTeste.searchFornecedor("iFree Ltda."));
		assertEquals(null,persistenciaFornecedorTeste.searchFornecedor("nome inexistente"));
		assertEquals(null,persistenciaFornecedorTeste.searchFornecedor("cnpj inexistente"));
		//remoção é feita em para que o teste dê sempre certo.
		persistenciaFornecedorTeste.removerFornecedor("iFree Ltda.");
	}

	@Test
	public void testCadastro() throws IOException {
		PersistenciaFornecedor persistenciaFornecedorTeste = PersistenciaFornecedor.getInstance();
		
		Fornecedor fornecedorTest = new Fornecedor("65421324654", "iFree Ltda.","bla","bla");
		assertEquals(true,persistenciaFornecedorTeste.cadastro(fornecedorTest));
		//remoção é feita em para que o teste dê sempre certo.
		persistenciaFornecedorTeste.removerFornecedor("iFree Ltda.");
	}

	@Test
	public void testOverview() {
		PersistenciaFornecedor persistenciaFornecedorTeste = PersistenciaFornecedor.getInstance();
		persistenciaFornecedorTeste.purge();
		//overview sem itens na lista
		assertEquals(null,persistenciaFornecedorTeste.overview());
		
		Fornecedor fornecedorTest = new Fornecedor("65421324654", "iFree Ltda.","bla","bla");
		persistenciaFornecedorTeste.cadastro(fornecedorTest);
		//overview com itens na lista
		assertNotNull(persistenciaFornecedorTeste.overview());
	}

}
