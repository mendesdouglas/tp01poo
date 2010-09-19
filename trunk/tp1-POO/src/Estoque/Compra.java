package Estoque;
import Pessoas.Fornecedor;

import java.util.*;

public class Compra {
	
	private ArrayList<ItemCompra> compras;
	private Fornecedor fornecedor;

	public Compra (Fornecedor fornecedor) {
		this.fornecedor = fornecedor; 
	}
	
	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}
	/**
	 * 
	 */
	public void overview () {
		float subtotal,precoTotal=0;
	    for (ItemCompra compra : compras) {
	    	subtotal=0;
	    	System.out.println("codigo\tPreco unitario\tquant\tsubtotais\n");
	    	subtotal = compra.getPrecoCompra()*compra.getQuant();
	    	System.out.println(compra.getItem().getCodigo()+"\t"+compra.getPrecoCompra()+"\t"+compra.getQuant()+"\t"+subtotal+"\n");
	    	precoTotal+=subtotal;
		}
	    System.out.println("\n\t\t\ttotal geral: "+precoTotal+"\n");
	}
}

