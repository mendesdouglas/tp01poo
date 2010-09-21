package Estoque;

import java.util.*;

import Persistencia.PEstoque;
import Pessoas.Cliente;

public class Pedido {

	ArrayList<ItemPedido> pedidos;
	Cliente cliente;
		
		
	public Pedido (Cliente cliente) {
		this.pedidos = new ArrayList<ItemPedido>();
		this.cliente = cliente;
		this.pedidos = new ArrayList<ItemPedido>();
	}
	
	public boolean searchItemPedido (int codigo) {
		for (ItemPedido item : pedidos) {
			if (item.getCodigoItem() == codigo){
				return true; 
			}
	    }
		return false;
	}
	/**
	 * 
	 */	
	public boolean addItem(int codigo,int quant){
		if (searchItemPedido(codigo)){
			System.out.println("Produto já está na sua lista favor usar a opção de alterar!!");
			return false;
		}
		PEstoque estoque = PEstoque.getInstance();
		Item item = estoque.searchItem (codigo);
		if (item == null) {
			System.out.println("O codigo digitado é invalido,por favor insira um codigo válido");
			return false;
		}
 		ItemPedido itemPedido = new ItemPedido(item,quant);
 		this.pedidos.add(itemPedido);
		return true;
	}

	/**
	 * 
	 */
	public void overview () {
		float subtotal,precoTotal=0;
	    for (ItemPedido pedido : pedidos) {
	    	subtotal=0;
	    	System.out.println("codigo\tPreco unitario\tquant\tsubtotais\n");
	    	subtotal = pedido.getPrecoPedido() *pedido.getQuant();
	    	System.out.println(pedido.getCodigoItem()+"\t"+pedido.getPrecoPedido()+"\t"+pedido.getQuant()+"\t"+subtotal+"\n");
	    	precoTotal+=subtotal;
		}
	    System.out.println("\n\t\t\ttotal geral: "+precoTotal+"\n");
		
	}
}

