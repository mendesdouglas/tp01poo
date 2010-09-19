package Persistencia;
import java.util.*;
import Pessoas.Fornecedor;

	public class PFornecedor {

	ArrayList<Fornecedor> fornecedores;
		
	public PFornecedor ( ) { }
	
	/**
	 * 
	 */
	public boolean save () {
		return true;
	}
	/**
	 * 
	 */
	public void getFornecedor () {
		
	}
	/**
	 * 
	 */
	public Fornecedor searchFornecedor(int codigo) {
		return null;
	}
	/**
	 * 
	 */
	public Fornecedor searchFornecedor (String nome) {
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Fornecedor fornecedor) {
		return true;
	}
	/**
	 * 
	 */
	public void overview () {
    	System.out.println("codigo\tnome\ttelefone\n");
	    for (Fornecedor fornecedor : fornecedores) {
	    	System.out.println(fornecedor.getCodigo()+"\t"+fornecedor.getNome()+"\t"+fornecedor.getTelefone()+"\n");
		}
	}
}

