package estoque;

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
	 * Retorno o nome do fornecedor relacionado à compra em questão.
	 * 
	 * @return Nome do fornecedor.
	 */
	public String getNomeFornecedor(){
		return this.fornecedor.getNome();
	}
	
	/**
	 * Retorno o CNPJ do fornecedor relacionado à compra em questão.
	 * 
	 * @return CNPJ do fornecedor.
	 */
	public String getCnpjFornecedor(){
		return this.fornecedor.getCnpj();
	}
	
	/**
	 * Retorna a data em que a compra se deu.
	 * 
	 * @return Data da compra.
	 */
	public Date getDataCompra() {
		return this.dataCompra;
	}
	
	/**
	 * ???
	 * @param formato
	 * @return
	 */
	public String getDataCompra(String formato){
		  if (formato == null || formato.length() == 0){
			  formato = "dd/MM/yyyy";
		  }
		  SimpleDateFormat sdf1= new SimpleDateFormat(formato);
		  return sdf1.format(this.dataCompra);
	}
	
	/**
	 * Altera a quantidade de um item numa determinada compra em aberto.
	 * 
	 * @return Verdadeiro ou Falso em caso de sucesso ou fracasso.
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
	 * Altera o preço de custo de um item numa determinada compra em aberto.
	 * 
	 * @return Verdadeiro ou Falso em caso de sucesso ou fracasso.
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
	 * Remove uma linha da compra em aberto.
	 * 
	 * @return Verdadeiro ou Falso em caso de sucesso ou fracasso.
	 */
	public boolean removeLinha(int index){
		if (index < compras.size()){
			return this.compras.remove(index) != null;
		}
		else return false;
	}
	

	
	/**
	 * Verifica se um determinado item já consta na lista de compra em aberto.
	 * 
	 * @return Verdadeiro em caso de existência e Falso em outro caso. 
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
	 * ???
	 * @param codigo
	 * @return
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
	 * Adiciona um item à lista de compra.
	 * 
	 * @return Verdadeiro se adicionar com sucesso ou Falso do contrário.
	 * 
	 */	
	public boolean addItem(Item item,float precoCompra,int quant){
		if (searchItemCompra(item.getCodigo()) || item == null){
			return false;
		}
		ItemCompra itemCompra = new ItemCompra(item,precoCompra,quant);
		return this.compras.add(itemCompra);
	}
	
	/**
	 * Retorna uma lista dos items da compra em aberto.
	 * 
	 * @return Um objeto do tipo ArrayList de ItemCompra.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<ItemCompra> overview () {
		if (this.compras.size() > 0){	
				return (ArrayList<ItemCompra>) this.compras.clone();
		}
		else return null;
	}
}

