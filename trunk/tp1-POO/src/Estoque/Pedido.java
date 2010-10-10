package Estoque;

import java.util.*;

import Persistencia.PersistenciaEstoque;
import Pessoas.Cliente;

public class Pedido {

	ArrayList<ItemPedido> pedidos;
	Cliente cliente;
		
		
	public Pedido (Cliente cliente) {
		this.pedidos = new ArrayList<ItemPedido>();
		this.cliente = cliente;
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
			return false;
		}
		PersistenciaEstoque estoque = PersistenciaEstoque.getInstance();
		Item item = estoque.searchItem (codigo);
		if (item == null) {
			return false;
		}
 		ItemPedido itemPedido = new ItemPedido(item,quant);
 		this.pedidos.add(itemPedido);
		return true;
	}

	/**
	 * 
	 */
	public String overview () {
		float subtotal,precoTotal=0;
		if (this.pedidos.size() > 0){
			String str = null;
		    for (ItemPedido pedido : pedidos) {
		    	subtotal=0;
		    	str+="codigo\tPreco unitario\tquant\tsubtotais\n";
		    	subtotal = pedido.getPrecoPedido() *pedido.getQuant();
		    	str+=pedido.getCodigoItem()+"\t"+pedido.getPrecoPedido()+"\t"+pedido.getQuant()+"\t"+subtotal+"\n";
		    	precoTotal+=subtotal;
			}
		    str+="\n\t\t\ttotal geral: "+precoTotal+"\n";
		    return str;
		}
		else return null;
		
	}
}

