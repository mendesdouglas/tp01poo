package estoque;

import java.io.IOException;
import java.util.*;

import persistencia.*;
import pessoas.Fornecedor;

import cui.*;

public class Compra {
	
	private ArrayList<ItemCompra> compras;
	private Fornecedor fornecedor;
	private Date dataCompra;

	public Compra (Fornecedor fornecedor) {
		this.compras = new ArrayList<ItemCompra>();
		this.dataCompra = new Date();
		this.fornecedor = fornecedor;
	}
	
	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}
	
	/**
	 * @return the dataCompra
	 */
	public Date getDataCompra() {
		return this.dataCompra;
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
	private ItemCompra search(int codigo){
		for (ItemCompra item : compras) {
			if (item.getCodigoItem() == codigo){
				return item; 
			}
	    }
		return null;
	}
	
	/**
	 * @throws IOException 
	 * 
	 */	
	public boolean addItem(int codigo,float precoCompra,int quant) throws IOException{
		if (searchItemCompra(codigo)){
			return false;
		}
		PersistenciaEstoque estoque = PersistenciaEstoque.getInstance();
		Item item = estoque.searchItem (codigo);
		if (item == null) {
			Menu.cadastroItem();
		}
 		ItemCompra itemCompra = new ItemCompra(item,precoCompra,quant);
 		this.compras.add(itemCompra);
		return true;
	}
	
	/**
	 * 
	 */
	public boolean delItem(int codigo){
		ItemCompra item = search(codigo);
		if (item !=null){
			return (this.compras.remove(item));
		}
		return false;
	}
	
	/**
	 * 
	 */
	public boolean alterar(int codigo,float precoCompra){
		ItemCompra item;
		if ((item = search(codigo)) == null ){
			return false;
		}
		item.setPrecoCompra(precoCompra);
		return true;
	}
	
	/**
	 * 
	 */
	public boolean alterar(int codigo,int quant){
		ItemCompra item;
		if ((item = search(codigo)) == null ){
			return false;
		}
		item.setQuant(quant);
		return true;
	}
	
	/**
	 * 
	 */
	public String overview () {
		float subtotal,precoTotal=0;
		if (this.compras.size() > 0){
				String str = null;	
		    for (ItemCompra compra : compras) {
		    	subtotal=0;
		    	str+="codigo\tPreco unitario\tquant\tsubtotais";
		    	subtotal = compra.getPrecoCompra()*compra.getQuant();
		    	str+=compra.getCodigoItem()+"\t"+compra.getPrecoCompra()+"\t"+compra.getQuant()+"\t"+subtotal;
		    	precoTotal+=subtotal;
			}
		    str+="\n\t\t\ttotal geral: "+precoTotal;
		    return str;
		}
		else return null;
	}
}

