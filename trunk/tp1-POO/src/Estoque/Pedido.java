package Estoque;

import java.util.*;
import Pessoas.Cliente;

public class Pedido {

		ArrayList<ItemPedido> pedidos;
		Cliente cliente;
		
		
	public Pedido (Cliente cliente) {
		this.cliente = cliente;
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
	    	System.out.println(pedido.getItem().getCodigo()+"\t"+pedido.getPrecoPedido()+"\t"+pedido.getQuant()+"\t"+subtotal+"\n");
	    	precoTotal+=subtotal;
		}
	    System.out.println("\n\t\t\ttotal geral: "+precoTotal+"\n");
		
	}
}

