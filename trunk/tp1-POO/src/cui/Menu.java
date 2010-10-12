package cui;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import persistencia.*;
import pessoas.Cliente;
import pessoas.Fornecedor;

import estoque.*;


public class Menu {
	
	public static void principal() throws FileNotFoundException, IOException {
		System.out.println("\t\tSJDR Confecções - Controle de Vendas e estoque\t"+Console.date2str(null, null));
		System.out.println("");
		System.out.println("Bem Vindo! Escolha a sua opção:");
		System.out.println("Digite (1) para cadastros, ou");
		System.out.println("Digite (2) para consultas.");
		System.out.println("Digite (3) para iniciar uma compra.");
		System.out.println("Digite (4) para iniciar um pedido.");
		System.out.println("Digite (5) para sair do sistema.");
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
			iniciarCompra();
			break;
			
		case 4: 
			iniciarPedido();
			break;
			
		case 5: 
			System.exit(0);
			break;
			
		default: 
			System.out.println("Opção inválida! Por favor, tente novamente.");
			principal();
			break;
		}
	}
	
	private static void cadastro() throws FileNotFoundException, IOException {
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

	private static void cadastrarItem() throws IOException {
		
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

	public static Item cadastroItem() throws IOException {
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
		}while(estoque.searchItem(codigoItem) != null);
		Item item = new Item(nome,codigoItem,precoCusto,margemLucro,quant);
		estoque.cadastro(item);
		estoque.save();
		return item;
	}
	
	private static void cadastrarFornecedor() throws FileNotFoundException, IOException {
		
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

	public static Fornecedor cadastroFornecedor() throws IOException {
		boolean permissao;
		PersistenciaFornecedor pfornecedor = PersistenciaFornecedor.getInstance();
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
			if(pfornecedor.searchFornecedor(cnpj) != null){
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
		Fornecedor fornecedor = new Fornecedor(cnpj,nome,endereco,telefone);
		pfornecedor.cadastro(fornecedor);
		pfornecedor.save();
		return fornecedor;
	}
	
	private static void cadastrarCliente() throws FileNotFoundException, IOException {
		
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

	public static Cliente cadastroClientes() throws IOException {
		boolean permissao;
		PersistenciaClientes pcliente = PersistenciaClientes.getInstance();
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
			if(pcliente.searchCliente(cpf) != null){
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
		
		Cliente cliente = new Cliente(cpf,nome,endereco,telefone);
		pcliente.cadastro(cliente);
		pcliente.save();
		return cliente;
	}
	
	private static void consulta() throws FileNotFoundException, IOException{
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
	
	private static void listarItem() throws FileNotFoundException, IOException {
		
		listaItem();
		consulta();
	
	}

	private static void listaItem() {
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
	}
	
	private static void listarItemEspecifico() throws FileNotFoundException, IOException {
		
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
		
	private static void listarFornecedores() throws FileNotFoundException, IOException  {
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
	
	private static void listarClientes() throws FileNotFoundException, IOException {
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
	
	private static void iniciarCompra(){
		
	}

	private static void iniciarPedido() throws IOException{
		PersistenciaClientes pclientes = PersistenciaClientes.getInstance();
		PersistenciaEstoque pestoque = PersistenciaEstoque.getInstance();
		System.out.println("Para iniciar um novo pedido digite o cpf ou o nome do cliente:");
		String query = Console.readString();
		Cliente cliente = pclientes.searchCliente(query);
		if (cliente == null){
			do{
				System.out.println("Cliente não encontrado em nossos registros:");
				System.out.println("Digite (1) Para uma nova pesquisa");
				System.out.println("Digite (2) Para cadastrar o novo cliente");
				int opt = Console.readInteger();
				switch(opt){
					case 1:
						System.out.println("Digite o cpf ou o nome do cliente:");
						query = Console.readString();
						cliente = pclientes.searchCliente(query);
						break;
					
					case 2:
						cliente = Menu.cadastroClientes();
						break;
					} 
				}while (cliente == null);
			}
		
		Pedido pedido = new Pedido(cliente);
		boolean finalizado = false;
		int codigo;
		int quant;
		
		while (finalizado == false){
			listarPedido(pedido);
			System.out.println("Movimentação de pedidos");
			System.out.println("Digite (1) Para adicionar um item");
			System.out.println("Digite (2) Para editar uma linha do pedido");
			System.out.println("Digite (3) Para remover uma linha do pedido");
			System.out.println("Digite (4) Para listar os itens do estoque");
			System.out.println("Digite (5) Para finalizar o pedido");
			int opt = Console.readInteger();
			switch(opt){
			case 1:
				System.out.println("Digite o codigo item que deseja adicionar:");
				codigo = Console.readInteger();
				while (codigo <= 0){
					System.out.println("codigo nao pode ser zero!");
					System.out.println("Digite o codigo item que deseja adicionar:");
					quant = Console.readInteger();
				}
				System.out.println("Digite a quantidade de itens :");
				quant = Console.readInteger();
				while (quant <= 0){
					System.out.println("quantidade nao pode ser menor ou igual a zero!");
					System.out.println("Digite a quantidade de itens :");
					quant = Console.readInteger();
				}
				if(pedido.addItem(codigo, quant) == false ){
					System.out.println("houve um erro! Verifique o codigo do item ou a quantidade e repita a operacao");
				}
				break;
			
			case 2:
				System.out.println("Digite a linha que deseja editar:");
				int linha = Console.readInteger();
				System.out.println("Digite a nova quantidade do produto:");
				quant = Console.readInteger();
				if(pedido.setQuantidade(linha, quant)== false){
					System.out.println("Quantidade informada nao esta disponivel!");
				}
				break;
			case 3:	
				System.out.println("Digite a linha que deseja remover:");
				linha = Console.readInteger();
				if(pedido.delItem(linha) == false ){
					System.out.println("nao foi possivel remover a linha "+linha+"!");
				}
			case 4:
				System.out.println("Situacao atual do estoque:\n");
				listaItem();
				break;
			case 5:
				pestoque.finalizarPedido(pedido);
				finalizado= true;
				break;
			default:
				listarPedido(pedido);
			} 	
		}
		principal();
	}
	
	private static void listarPedido(Pedido pedido){
		float subtotal,precoTotal=0;
		ArrayList<ItemPedido> pedidos = pedido.overview();
		System.out.println("Situacao atual do pedido:\n");			
    	System.out.println("Pedido referente ao cliente "+pedido.getNomeCliente()+"\n");
		if (pedidos != null){
	    	System.out.println("Linha\tCódigo\tNome\tPreco Unitario\tQuant\tSubtotais\n");
			for (int i = 0; i < pedidos.size(); i++) {
		    	subtotal=0;
		    	subtotal = pedidos.get(i).getPrecoPedido() * pedidos.get(i).getQuant();
		    	System.out.println(i+"\t"+pedidos.get(i).getCodigoItem()+"\t"+pedidos.get(i).getNomeItem()+"\t"+pedidos.get(i).getPrecoPedido()+"\t"+pedidos.get(i).getQuant()+"\t"+subtotal+"\n");
		    	precoTotal+=subtotal;
			}
		    System.out.println("\n\t\t\ttotal geral: "+precoTotal+"\n");
		}
	}	
	
}	
