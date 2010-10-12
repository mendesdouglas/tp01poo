package persistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import pessoas.Cliente;


public class PersistenciaClientes {
	

	private static PersistenciaClientes ClienteInstance;
	ArrayList<Cliente> compradores;
	 
	private PersistenciaClientes () {
		this.compradores = new ArrayList<Cliente>(); 
		try {
			getCliente();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	public static PersistenciaClientes getInstance(){
		if(ClienteInstance == null) {
			ClienteInstance = new PersistenciaClientes();
	    }
	    return ClienteInstance;
	 }
	/**
	 * 
	 */
	public boolean save() throws IOException {
		
		FileWriter fw = new FileWriter("Clientes.dat",false);
    	String str = "#cpf\tnome\tendereco\ttelefone\n";
	    for (Cliente cliente : compradores) {
	    	str+=cliente.getCpf()+"\t"+cliente.getNome()+"\t"+cliente.getEndereco()+"\t"+cliente.getTelefone()+"\n";
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

		BufferedReader br = new BufferedReader(new FileReader(file));
		String linha;
		while( (linha = br.readLine()) != null ){
			if(linha.startsWith("#")){ 
				continue;
				}
			String[] dados = linha.split("\t");
			if(dados.length == 2){
				cadastro(new Cliente(dados[0],dados[1]));
			}
			if(dados.length == 4){
			cadastro(new Cliente(dados[0],dados[1],dados[2],dados[3]));
			}
		}
		br.close();	
	}
	
	/**
	 * 
	 */
	public Cliente searchCliente (String query) {
		for (Cliente cliente : compradores) {
			if (cliente.getNome().equals(query)|| cliente.getCpf().equals(query)){
				return cliente;
			}
	    }
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Cliente cliente) {
		if (searchCliente(cliente.getCpf()) != null) {
			return false;
		}
		return this.compradores.add(cliente);
	}
	/**
	 * 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Cliente> overview (){
		if (this.compradores.size() > 0){
			return (ArrayList<Cliente>) this.compradores.clone();
		}
		else{
			return null;
		}
	}
}

