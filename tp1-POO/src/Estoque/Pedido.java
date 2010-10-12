package Estoque;

import java.text.SimpleDateFormat;
import java.util.*;

import Persistencia.PersistenciaEstoque;
import Pessoas.Cliente;

public class Pedido {

	private ArrayList<ItemPedido> pedidos;
	private Cliente cliente;
	private Date dataPedido;
		
		
	public Pedido (Cliente cliente) {
		this.pedidos = new ArrayList<ItemPedido>();
		this.dataPedido = new Date();
		this.cliente = cliente;
		}
	
	public String getNomeCliente(){
		return this.cliente.getNome();
	}
	
	public String getCpfCliente(){
		return this.cliente.getCpf();
	}
	
	public Date getDataPedido(){
		return this.dataPedido;
	}
	
	public String getDataPedido(String formato){
		  if (formato == null || formato.length() == 0){
			  formato = "dd/MM/yyyy";
		  }
		  SimpleDateFormat sdf1= new SimpleDateFormat(formato);
		  return sdf1.format(this.dataPedido);
	}
	
	public boolean setQuantidade(int index,int quant){
		if (index < pedidos.size()){
			if(this.pedidos.get(index).getQuantItem() >= quant){
				this.pedidos.get(index).setQuant(quant);
				return true;
			}
		}
		return false;
	}
	
	public int getCodigoItem(int index){
		if (index < pedidos.size()){
			return this.pedidos.get(index).getCodigoItem();
		}
		else return -1;
	}
	
	public boolean delItem(int index){
		if (index < pedidos.size()){
			return this.pedidos.remove(index) != null;
		}
		else return false;
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
		if (item.getQuant() < quant){
			return false;
		}
 		ItemPedido itemPedido = new ItemPedido(item,quant);
 		this.pedidos.add(itemPedido);
		return true;
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<ItemPedido> overview () {
		if (this.pedidos.size() > 0){
			return (ArrayList<ItemPedido>) this.pedidos.clone();
		}
		else return null;
		
	}

}

