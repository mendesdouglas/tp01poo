package Persistencia;
import java.util.*;
import Estoque.*;

public class PEstoque {
	
	ArrayList<Item> itens;
	 
	public PEstoque () {}
	
	/**
	 * 
	 */
	public boolean save () {
		return true;
	}
	
	/**
	 * 
	 */
	public boolean save (Compra listaCompra) {
		return true;
	}
	/**
	 * 
	 */
	public boolean save (Pedido listaPedido) {
		return true;
	}
	/**
	 * 
	 */
	public void getEstoque () {
		
	}
	/**
	 * 
	 */
	public Item searchItem (int codigo) {
		return null;
	}
	/**
	 * 
	 */
	public Item searchItem (String nome) {
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Item item) {
		return true;
	}
	/**
	 * 
	 */
	public boolean cadastro (Pedido pedido) {
		return true;
	}
	/**
	 * 
	 */
	public boolean cadastro (Compra compra) {
		return true;
	}
	/**
	 * 
	 */
	public void overview () {
    	System.out.println("codigo\tnome\tpreco custo\tmargem lucro\tquantidade\n");
	    for (Item item : itens) {
	    	System.out.println(item.getCodigo()+"\t"+item.getNome()+"\t"+item.getPrecoCusto()+"\t"+item.getMargemLucro()+"\t"+item.getQuant()+"\n");
		}
	}
}

