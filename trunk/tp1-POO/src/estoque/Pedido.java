package estoque;

import java.text.SimpleDateFormat;
import java.util.*;
import pessoas.Cliente;


public class Pedido {

	private ArrayList<ItemPedido> pedidos;
	private Cliente cliente;
	private Date dataPedido;

	public Pedido (Cliente cliente) {
		this.pedidos = new ArrayList<ItemPedido>();
		this.dataPedido = new Date();
		this.cliente = cliente;
		}

	/**
	 * 
	 * Retorna o nome cliente
	 */
	public String getNomeCliente(){
		return this.cliente.getNome();
	}
	
	/**
	 * 
	 * Retorna o cpf do cliente
	 */
	public String getCpfCliente(){
		return this.cliente.getCpf();
	}
	
	/**
	 * 
	 * Retorna a data do pedido
	 */
	public Date getDataPedido(){
		return this.dataPedido;
	}
	
	/**
	 * 
	 * @param formato
	 * @return data do pedido 
	 */
	public String getDataPedido(String formato){
		  if (formato == null || formato.length() == 0){
			  formato = "dd/MM/yyyy";
		  }
		  SimpleDateFormat sdf1= new SimpleDateFormat(formato);
		  return sdf1.format(this.dataPedido);
	}
	
	/**
	 * 
	 * Retorna a possibilidade de um pedido dependendo da quantidade disponível
	 * @param index 
	 * @param quant 
	 * @return true/false 
	 */
	
	public boolean setQuantidade(int index,int quant){
		if (index < pedidos.size()){
			if(this.pedidos.get(index).getQuantItem() >= quant){
				this.pedidos.get(index).setQuant(quant);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * Retorna o código do item
	 * @param index
	 */
	public int getCodigoItem(int index){
		if (index < pedidos.size()){
			return this.pedidos.get(index).getCodigoItem();
		}
		else return -1;
	}
	
	/**
	 * 
	 * Remove um item do pedido
	 * @param index
	 */
	public boolean delItem(int index){
		if (index < pedidos.size()){
			return this.pedidos.remove(index) != null;
		}
		else return false;
	}
	
	/**
	 * Pesquisa por um item através de um codigo
	 * 
	 * @param codigo
	 * 
	 */
	public boolean searchItemPedido (int codigo) {
		for (ItemPedido item : pedidos) {
			if (item.getCodigoItem() == codigo){
				return true; 
			}
	    }
		return false;
	}
	/**
	 * Adiciona item a pedido
	 * 
	 * @param item
	 * @param quant
	 * 
	 */
	
	public boolean addItem(Item item,int quant){
		if (searchItemPedido(item.getCodigo()) || item == null){
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
	 * Retorna copia da lista de pedidos
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

