package estoque;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import pessoas.Fornecedor;

public class Compra {
	
	private ArrayList<ItemCompra> compras;
	private Fornecedor fornecedor;
	private Date dataCompra;

	public Compra (Fornecedor fornecedor) {
		this.compras = new ArrayList<ItemCompra>();
		this.dataCompra = new Date();
		this.fornecedor = fornecedor;
	}
	
	/**
	 * 
	 */
	public String getNomeFornecedor(){
		return this.fornecedor.getNome();
	}
	
	/**
	 * 
	 */
	public String getCnpjFornecedor(){
		return this.fornecedor.getCnpj();
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
	public boolean setQuantidade(int index,int quant){
		if (index < this.compras.size()){
			if(quant > 0){
				this.compras.get(index).setQuant(quant);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 */
	public boolean setPrecoCompra(int index,float preco){
		if (index < this.compras.size()){
			if(preco > 0){
				this.compras.get(index).setPrecoCompra(preco);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 */
	public boolean removeLinha(int index){
		if (index < compras.size()){
			return this.compras.remove(index) != null;
		}
		else return false;
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
	@SuppressWarnings("unused")
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
	public boolean addItem(Item item,float precoCompra,int quant) throws IOException{
		if (searchItemCompra(item.getCodigo()) || item == null){
			return false;
		}
 		ItemCompra itemCompra = new ItemCompra(item,precoCompra,quant);
 		return this.compras.add(itemCompra);
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

