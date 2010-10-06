package Cui;
import java.io.FileNotFoundException;
import java.io.IOException;

import Persistencia.*;
import Pessoas.Cliente;
import Pessoas.Fornecedor;
import Estoque.*;

public class Menu {
	public static void principal() throws FileNotFoundException, IOException {
		System.out.println("\t\tSJDR Confecções - Controle de Vendas e Estoque");
		System.out.println("");
		System.out.println("Bem Vindo! Escolha a sua opção:");
		System.out.println("Digite (1) para cadastros, ou");
		System.out.println("Digite (2) para consultas.");
		System.out.println("Digite (3) para sair do sistema.");
		System.out.println("Opção:");
		int opt;
		opt=Console.readInteger();
		switch (opt) {
		
		case 1: 
			cadastro();
			break;
			
		case 2: 
			consulta();
			break;
			
		case 3: 
			System.exit(0);
			break;
			
		default: 
			System.out.println("Opção inválida! Por favor, tente novamente.");
			principal();
			break;
		}
	}
	
	public static void cadastro() throws FileNotFoundException, IOException {
		System.out.println("Escolha qual tipo de cadastro deseja realizar:");
		System.out.println("Digite (1) para cadastrar um novo item.");
		System.out.println("Digite (2) para cadastrar um novo fornecedor.");
		System.out.println("Digite (3) para cadastrar um novo cliente.");
		System.out.println("Digite (4) para voltar ao menu principal.");
		int opt;
		opt=Console.readInteger();
		
		switch (opt) {
		
		case 1:
			cadastrarItem();
			break;
			
		case 2:
			cadastrarFornecedor();
			break;
			
		case 3:
			cadastrarCliente();
			break;
			
		default: principal();
			break;
		}
	}
	//
	public static void cadastrarItem() throws IOException {
		
	cadastroItem();
	
	System.out.println("Deseja cadastrar outro item?");
	System.out.println("Digite (1) para SIM e (2) para NAO.");
	int opt = Console.readInteger();
	
	switch (opt) {
	case 1:
		cadastrarItem();
		break;

	default:
		cadastro();
		break;
	}
}

	public static void cadastroItem() throws IOException {
		PEstoque estoque = PEstoque.getInstance();
		System.out.println("Formulário de cadastro de itens");
		System.out.println("Por favor, preencha corretamente os campos abaixo:\n");
		
		System.out.println("Item:");
		String nome = Console.readString();
		
		System.out.println("preco de Custo:");
		float precoCusto = Console.readFloat();
		
		System.out.println("Margem de lucro:");
		float margemLucro = Console.readFloat();
		
		System.out.println("quantidade:");
		int quant = Console.readInteger();
		
	System.out.println("Caso o código já exista, o sistema pedirá a que você insira um novo código repedidas vezes.");		
	int codigoItem;
	do {
	System.out.println("código:");
	codigoItem = Console.readInteger();
	}
	while(estoque.searchItem(codigoItem) != null);
	
	estoque.cadastro(new Item(nome,codigoItem,precoCusto,margemLucro,quant));
	estoque.save();
	}
	
	
	public static void cadastrarFornecedor() throws FileNotFoundException, IOException {
		
		cadastroFornecedor();
		
		
		System.out.println("Deseja cadastrar outro fornecedor?");
		System.out.println("Digite (1) para SIM e (2) para NAO.");
		int opt = Console.readInteger();
		
		switch (opt) {
		case 1:
			cadastrarFornecedor();
			break;

		default:
			cadastro();
			break;
		}
	}

	public static void cadastroFornecedor() throws IOException {
		PFornecedor fornecedor = PFornecedor.getInstance();
		System.out.println("Formulario de cadastro de fornecedores");
		System.out.println("Por favor, preencha corretamente os campos abaixo:\n");
		
		System.out.println("Nome(Razao Social): ");
		String nome = Console.readString();
		
		System.out.println("CNPJ: ");
		String cnpj = Console.readString();
		
		System.out.println("Rua e Numero(Rua,Numero): ");
		String ruaNumero = Console.readString();
		
		System.out.println("Bairro: ");
		String bairro = Console.readString();
		
		System.out.println("Telefone: ");
		String telefone = Console.readString();
		
		System.out.println("Caso o código já exista, o sistema pedirá a que você insira um novo código repedidas vezes.");		
		int codigo;

		do {
			System.out.println("Código: ");
			codigo = Console.readInteger();
		}while(fornecedor.searchFornecedor(codigo) != null);
		
		String endereco = ruaNumero+","+bairro;
		fornecedor.cadastro(new Fornecedor(cnpj,nome,codigo,endereco,telefone));
		fornecedor.save();
	}
	
	public static void cadastrarCliente() throws FileNotFoundException, IOException {
		
		cadastroClientes();
		
		System.out.println("Deseja cadastrar outro cliente?");
		System.out.println("Digite (1) para SIM e (2) para NAO.");
		int opt = Console.readInteger();
		
		switch (opt) {
		case 1:
			cadastrarCliente();
			break;

		default:
			cadastro();
			break;
		}
	}

	public static void cadastroClientes() throws IOException {
		PClientes cliente = PClientes.getInstance();
		System.out.println("Formulario de cadastro de clientes");
		System.out.println("Por favor, preencha corretamente os campos abaixo:\n");
		
		System.out.println("Nome Completo: ");
		String nome = Console.readString();
		
		System.out.println("CPF: ");
		String cpf = Console.readString();
		
		System.out.println("Rua e Numero(Rua,Numero): ");
		String ruaNumero = Console.readString();
		
		System.out.println("Bairro: ");
		String bairro = Console.readString();
		
		System.out.println("Telefone: ");
		String telefone = Console.readString();
		
		System.out.println("Caso o código já exista, o sistema pedirá a insersão de um novo código repedidas vezes.");
		int codigo;

		do {
			System.out.println("Código: ");
			codigo = Console.readInteger();
		}while(cliente.searchCliente(codigo) != null);
		
		String endereco = ruaNumero+", "+bairro;
		cliente.cadastro(new Cliente(cpf,nome,codigo,endereco,telefone));
		cliente.save();
	}
	
	public static void consulta() throws FileNotFoundException, IOException{
		System.out.println("Escolha qual tipo de consulta deseja realizar:");
		System.out.println("Digite (1) para listar todos os itens do estoque.");
		System.out.println("Digite (2) para listar informacoes de um item especificamente.");
		System.out.println("Digite (3) para listar os fornecedores.");
		System.out.println("Digite (4) para listar os clientes.");
		System.out.println("Digite (5) para voltar ao menu principal.");
		int opt;
		opt=Console.readInteger();
		
		switch (opt) {
		
		case 1:
			listarItem();
			break;
			
		case 2:
			listarItemEspecifico();
			break;
			
		case 3:
			listarFornecedores();
			break;
			
		case 4:
			listarClientes();
			break;
			
		default: principal();
			break;
		}
	}
	
	public static void listarItem() throws FileNotFoundException, IOException {
		
		PEstoque estoqueControle = PEstoque.getInstance();
		estoqueControle.overview();
		
		consulta();
	
	}
	
	public static void listarItemEspecifico() throws FileNotFoundException, IOException {
		
		PEstoque estoqueControle = PEstoque.getInstance();
		System.out.println("Escolha qual tipo de consulta deseja realizar:");
		System.out.println("Digite (1) exibir informacoes de um item pesquisando pelo nome.");
		System.out.println("Digite (2) exibir preco de um item pesquisando pelo codigo");
		int opt;
		opt=Console.readInteger();
		
		switch (opt) {
		
		case 1:
			System.out.println("digite o nome do item.");
			String nome = Console.readString();
			Item item = estoqueControle.searchItem(nome);
			System.out.println("\nExibindo dados do item "+item.getNome());
			System.out.println("\nCodigo: "+item.getCodigo()+"\nMargem Lucro: "+item.getMargemLucro()+"\nPreco Custo: "+item.getPrecoCusto()+"\nQuant: "+item.getQuant());
			consulta();
			break;
			
		case 2:
			System.out.println("digite o codigo do item.");
			int codigo = Console.readInteger();
			Item item2 = estoqueControle.searchItem(codigo);
			System.out.println("\nPreco de venda do item "+item2.getNome()+":\t"+(item2.getPrecoCusto()*(item2.getMargemLucro()+1)));
			consulta();
			break;
			
		default: consulta();
			break;
		}
	}
		
		

	
	public static void listarFornecedores() throws FileNotFoundException, IOException  {
		PFornecedor fornecedorControle = PFornecedor.getInstance();
		fornecedorControle.overview();
		
		consulta();
	}
	
	public static void listarClientes() throws FileNotFoundException, IOException {
		PClientes clienteControle = PClientes.getInstance();
		clienteControle.overview();
		
		consulta();
	}

}
