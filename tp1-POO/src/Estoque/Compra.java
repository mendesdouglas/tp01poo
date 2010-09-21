package Estoque;
import Pessoas.Fornecedor;
import Persistencia.*;
import Cui.*;
import java.util.*;

public class Compra {
	
	private ArrayList<ItemCompra> compras;
	private Fornecedor fornecedor;

	public Compra (Fornecedor fornecedor) {
		this.compras = new ArrayList<ItemCompra>();
		this.fornecedor = fornecedor; 
		this.compras = new ArrayList<ItemCompra>();
	}
	
	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}
	/**
	 * 
	 */
	public boolean searchItemCompra (int codigo) {
		for (ItemCompra item : compras) {
			if (item.getCodigoItem() == codigo){
				return true; 
			}
	    }
		return false;
	}
	/**
	 * 
	 */	
	public boolean addItem(int codigo,float precoCompra,int quant){
		if (searchItemCompra(codigo)){
			System.out.println("Produto já está na sua lista favor usar a opção de alterar!!");
			return false;
		}
		PEstoque estoque = PEstoque.getInstance();
		Item item = estoque.searchItem (codigo);
		if (item == null) {
			System.out.println("Produto nao encontrado insira as informacoes de cadastro:");
			System.out.println("Entre com um nome: ");
			String nome = Console.readString();
			int code;
			do{
				System.out.println("entre com um codigo valido: ");
				code = Console.readInteger();
			}while(estoque.searchItem(codigo)!= null);	
			System.out.println("entre com o preço de custo: ");
			float precoCusto = Console.readFloat();
			System.out.println("entre com a margem de lucro: ");
			float margemLucro = Console.readFloat();
			System.out.println("entre com a quantidade: ");
			int quantidade = Console.readInteger();
			item = new Item(nome,code,precoCusto,margemLucro,quantidade);
		}
 		ItemCompra itemCompra = new ItemCompra(item,precoCompra,quant);
 		this.compras.add(itemCompra);
		return true;
	}
	/**
	 * 
	 */
	public void overview () {
		float subtotal,precoTotal=0;
	    for (ItemCompra compra : compras) {
	    	subtotal=0;
	    	System.out.println("codigo\tPreco unitario\tquant\tsubtotais");
	    	subtotal = compra.getPrecoCompra()*compra.getQuant();
	    	System.out.println(compra.getCodigoItem()+"\t"+compra.getPrecoCompra()+"\t"+compra.getQuant()+"\t"+subtotal);
	    	precoTotal+=subtotal;
		}
	    System.out.println("\n\t\t\ttotal geral: "+precoTotal);
	}
}

