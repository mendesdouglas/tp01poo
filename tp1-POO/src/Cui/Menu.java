package Cui;
import java.io.FileNotFoundException;
import java.io.IOException;

import Persistencia.*;
import Pessoas.Cliente;
import Pessoas.Fornecedor;

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
	public static void cadastrarItem() {
		//TODO implementar - ISAC e AMANDA
	}
	
	public static void cadastrarFornecedor() throws FileNotFoundException, IOException {
		PFornecedor fornecedor = PFornecedor.getInstance();
		fornecedor.getFornecedor();
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
	
	public static void cadastrarCliente() throws FileNotFoundException, IOException {
		PClientes cliente = PClientes.getInstance();
		cliente.getCliente();
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
	
	public static void consulta() throws FileNotFoundException, IOException{
		System.out.println("Escolha qual tipo de consulta deseja realizar:");
		System.out.println("Digite (1) para pesquisar um item.");
		System.out.println("Digite (2) para listar os fornecedores.");
		System.out.println("Digite (3) para listar os clientes.");
		System.out.println("Digite (4) para voltar ao menu principal.");
		int opt;
		opt=Console.readInteger();
		
		switch (opt) {
		
		case 1:
			pequisarItem();
			break;
			
		case 2:
			listarFornecedores();
			break;
			
		case 3:
			listarClientes();
			break;
			
		default: principal();
			break;
		}
	}
	
	public static void pequisarItem() {
		//TODO implementar - ISAC e AMANDA
	}
	
	public static void listarFornecedores() throws FileNotFoundException, IOException  {
		PFornecedor fornecedorControle = PFornecedor.getInstance();
		fornecedorControle.getFornecedor();
		fornecedorControle.overview();
		
		consulta();
	}
	
	public static void listarClientes() throws FileNotFoundException, IOException {
		PClientes clienteControle = PClientes.getInstance();
		clienteControle.getCliente();
		clienteControle.overview();
		
		consulta();
	}

}
