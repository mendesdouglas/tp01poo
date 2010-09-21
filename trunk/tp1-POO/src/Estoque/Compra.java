package Estoque;
import Pessoas.Fornecedor;
import Persistencia.*;

import java.util.*;

public class Compra {
	
	private ArrayList<ItemCompra> compras;
	private Fornecedor fornecedor;

	public Compra (Fornecedor fornecedor) {
		this.compras = new ArrayList<ItemCompra>();
		this.fornecedor = fornecedor; 
	}
	
	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}
	/**
	 * 
	 */
	public boolean searchItemCompra (int codigo,float precoCompra,int quant) {
		for (ItemCompra item : compras) {
			if (item.getCodigoItem() != codigo){
				return false; 
			}
	    }
		Item item = PEstoque.searchItem (codigo);
 		Item Compra itemCompra = new ItemCompra(Item item,float precoCompra,int quant);
		return true;
	}
	/**
	 * 
	 */	
	public boolean addItem(int codigo){
		if (searchItemCompra(codigo)){
			return false;
		}
		
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

