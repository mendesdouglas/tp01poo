package Persistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import Pessoas.Cliente;

public class PClientes {
	

	private static PClientes ClienteInstance;
	ArrayList<Cliente> compradores;
	 
	private PClientes () {
		this.compradores = new ArrayList<Cliente>(); 
		try {
			getCliente();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	public static PClientes getInstance(){
		if(ClienteInstance == null) {
			ClienteInstance = new PClientes();
	    }
	    return ClienteInstance;
	 }
	/**
	 * 
	 */
	public boolean save() throws IOException {
		
		FileWriter fw = new FileWriter("Clientes.dat",false);
    	String str = "#cpf\tnome\tcodigo\tendereco\ttelefone\n";
	    for (Cliente cliente : compradores) {
	    	str+=cliente.getCpf()+"\t"+cliente.getNome()+"\t"+cliente.getCodigo()+"\t"+cliente.getEndereco()+"\t"+cliente.getTelefone()+"\n";
		}
		fw.write(str);
		fw.close();
		return true;
	}
	/**
	 *  
	 * 
	 */
	private void getCliente() throws FileNotFoundException, IOException {
		File file = new File("Clientes.dat");

		if (! file.exists()) {
			file.createNewFile();
		}

		BufferedReader br = new BufferedReader(new FileReader("Clientes.dat"));
		String linha;
		while( (linha = br.readLine()) != null ){
			if(linha.startsWith("#")){ 
				continue;
				}
			String[] dados = linha.split("\t");
			cadastro(new Cliente(dados[0],dados[1],Integer.parseInt(dados[2]),dados[3],dados[4]));
		}
		br.close();	
	}
	/**
	 * 
	 */
	public Cliente searchCliente (int codigo) {
		for (Cliente cliente : compradores) {
			if (cliente.getCodigo() == codigo){
				return cliente;
			}
	    }
		return null;
	}
	/**
	 * 
	 */
	public Cliente searchCliente (String nome) {
		for (Cliente cliente : compradores) {
			if (cliente.getNome() == nome){
				return cliente;
			}
	    }
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Cliente cliente) {
		if (searchCliente(cliente.getCodigo()) != null) {
			System.out.println("Cliente ja cadastrado.");
			return false;
		}
		return this.compradores.add(cliente);
	}
	/**
	 * 
	 * 
	 */
	public void overview () throws FileNotFoundException, IOException {
    	System.out.println("codigo\tnome\ttelefone\n");
    	for (Cliente cliente : compradores) {
    		System.out.println(cliente.getCodigo()+"\t"+cliente.getNome()+"\t"+cliente.getTelefone());
		}
	
	}
}

