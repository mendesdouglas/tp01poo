package Cui;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

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
		boolean permissao;
		PersistenciaEstoque estoque = PersistenciaEstoque.getInstance();
		System.out.println("Formulário de cadastro de itens");
		System.out.println("Por favor, preencha corretamente os campos abaixo:\n");
		
		String nome;
		do {
			System.out.println("Nome:");
			nome = Console.readString();
			if(nome == null || nome.length() == 0){
				System.out.println("O campo nome é obrigatório!! Por favor verifique o que foi digitado");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
		
		float precoCusto;
		do {
			System.out.println("Preco de custo:");
			precoCusto = Console.readFloat();
			if(precoCusto <= 0){
				System.out.println("O campo preço não pode ser menor ou igual a zero!! Por favor verifique o que foi digitado");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
		float margemLucro;
		do {
			System.out.println("Margem de lucro (%):");
			margemLucro = (Console.readFloat()/100);
			if(margemLucro <= 0){
				System.out.println("O campo Margem de Lucro não pode ser menor ou igual a zero!! Por favor verifique o que foi digitado");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
		int quant;
		do {
			System.out.println("Quantidade:");
			quant = Console.readInteger();
			if(margemLucro < 0){
				System.out.println("O campo Quantidade não pode ser menor que zero!! Por favor verifique o que foi digitado");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
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
		boolean permissao;
		PersistenciaFornecedor fornecedor = PersistenciaFornecedor.getInstance();
		System.out.println("Formulario de cadastro de fornecedores");
		System.out.println("Por favor, preencha corretamente os campos abaixo:\n");
		
		String nome;
		do {
			System.out.println("Nome(Razao Social): ");
			nome = Console.readString();
			if(nome == null || nome.length() == 0){
				System.out.println("O campo nome é obrigatório!!");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
		String cnpj;
		do {
			System.out.println("Cnpj: ");
			cnpj = Console.readString();
			if(fornecedor.searchFornecedor(cnpj) != null){
				System.out.println("Fornecedor já cadastrado! Verifique o cnpj digitado");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
		System.out.println("Rua e Numero(Rua,Numero): ");
		String ruaNumero = Console.readString();
		
		System.out.println("Bairro: ");
		String bairro = Console.readString();
		
		System.out.println("Telefone: ");
		String telefone = Console.readString();
		
		String endereco = ruaNumero+","+bairro;
		fornecedor.cadastro(new Fornecedor(cnpj,nome,endereco,telefone));
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
		boolean permissao;
		PersistenciaClientes cliente = PersistenciaClientes.getInstance();
		System.out.println("Formulario de cadastro de clientes");
		System.out.println("Por favor, preencha corretamente os campos abaixo:\n");
		
		String nome;
		do {
			System.out.println("Nome Completo: ");
			nome = Console.readString();
			if(nome == null || nome.length() == 0){
				System.out.println("O campo nome é obrigatório!!");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);

		String cpf;
		do {
			System.out.println("CPF: ");
			cpf = Console.readString();
			if(cliente.searchCliente(cpf) != null){
				System.out.println("Cliente já cadastrado! Verifique o cpf digitado");
				permissao=true;
			}
			else {
				permissao=false;
			}	
		}while(permissao);
		
		System.out.println("Rua e Numero(Rua,Numero): ");
		String ruaNumero = Console.readString();
		
		System.out.println("Bairro: ");
		String bairro = Console.readString();
		
		System.out.println("Telefone: ");
		String telefone = Console.readString();
				
		String endereco = ruaNumero+", "+bairro;
		cliente.cadastro(new Cliente(cpf,nome,endereco,telefone));
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
		
		PersistenciaEstoque estoqueControle = PersistenciaEstoque.getInstance();
		@SuppressWarnings("unchecked")
		ArrayList<Item> itens = (ArrayList<Item>) estoqueControle.overview();
		if (itens == null){
			System.out.println("Não há itens cadastrados no sistema!\n");
		}
		else{
    	System.out.println("codigo\tnome\tpreco custo\tmargem lucro\tquantidade");
	    for (Item item : itens) {
	    	System.out.println(item.getCodigo()+"\t"+item.getNome()+"\t"+item.getPrecoCusto()+"\t"+item.getMargemLucro()+"\t"+item.getQuant());
		}
	    System.out.println();
		}
		consulta();
	
	}
	
	public static void listarItemEspecifico() throws FileNotFoundException, IOException {
		
		PersistenciaEstoque estoqueControle = PersistenciaEstoque.getInstance();
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
		PersistenciaFornecedor fornecedorControle = PersistenciaFornecedor.getInstance();
		ArrayList<Fornecedor> fornecedores = fornecedorControle.overview();	
		if (fornecedores == null){
			System.out.println("Não há fornecedores cadastrados no sistema!\n");
		}
		else{
	    	System.out.println("codigo\tnome\ttelefone\n");
		    for (Fornecedor fornecedor : fornecedores) {
		    	System.out.println(fornecedor.getCnpj()+"\t"+fornecedor.getNome()+"\t"+fornecedor.getTelefone());
			}
		    System.out.println();
		    } 
		consulta();
	}
	
	public static void listarClientes() throws FileNotFoundException, IOException {
		PersistenciaClientes clienteControle = PersistenciaClientes.getInstance();
		ArrayList<Cliente> compradores = clienteControle.overview();
		if (compradores == null){
			System.out.println("Não há clientes cadastrados no sistema!\n");
		}
		else{
    	System.out.println("Cpf\tNome\tEndereco\tTelefone\n");
    	for (Cliente cliente : compradores) {
    		System.out.println(cliente.getCpf()+"\t"+cliente.getNome()+"\t"+cliente.getEndereco()+"\t"+cliente.getTelefone());
		}
    	System.out.println();
		}
		consulta();	
	}
}
