package estoque;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
	
	public String getNomeFornecedor(){
		return this.fornecedor.getNome();
	}

	public String getCnpjFornecedor(){
		return this.fornecedor.getCnpj();
	}
	/**
	 * @return the dataCompra
	 */
	public Date getDataCompra() {
		return this.dataCompra;
	}

	public boolean setQuantidade(int index,int quant){
		if (index < this.compras.size()){
			if(quant > 0){
				this.compras.get(index).setQuant(quant);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean setPrecoCompra(int index,float preco){
		if (index < this.compras.size()){
			if(preco > 0){
				this.compras.get(index).setPrecoCompra(preco);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeLinha(int index){
		if (index < compras.size()){
			return this.compras.remove(index) != null;
		}
		else return false;
	}
	
	public String getDataCompra(String formato){
		  if (formato == null || formato.length() == 0){
			  formato = "dd/MM/yyyy";
		  }
		  SimpleDateFormat sdf1= new SimpleDateFormat(formato);
		  return sdf1.format(this.dataCompra);
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
			item = Menu.cadastroItem();
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
	@SuppressWarnings("unchecked")
	public ArrayList<ItemCompra> overview () {
		if (this.compras.size() > 0){	
				return (ArrayList<ItemCompra>) this.compras.clone();
		}
		else return null;
	}
}

