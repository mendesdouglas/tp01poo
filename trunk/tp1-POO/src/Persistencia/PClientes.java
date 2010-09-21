package Persistencia;
import java.util.*;
import Pessoas.Cliente;

public class PClientes {
	
	private ArrayList<Cliente> compradores;
	
	
	public PClientes ( ) { }
	/**
	 * 
	 */
	public boolean save() {
		return true;
	}
	/**
	 * 
	 */
	public void getCliente() {
		
	}
	/**
	 * 
	 */
	public Cliente searchCliente (int codigo) {
		return null;
	}
	/**
	 * 
	 */
	public Cliente searchCliente (String nome) {
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Cliente cliente) {
		return true;
	}
	/**
	 * 
	 */
	public void overview () {
    	System.out.println("codigo\tnome\ttelefone\n");
	    for (Cliente cliente : compradores) {
	    	System.out.println(cliente.getCodigo()+"\t"+cliente.getNome()+"\t"+cliente.getTelefone()+"\n");
		}
	}
}

