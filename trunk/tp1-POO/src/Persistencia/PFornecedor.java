package Persistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import Pessoas.Fornecedor;

	public class PFornecedor {

	ArrayList<Fornecedor> fornecedores;
		
	public PFornecedor ( ) {
		fornecedores = new ArrayList<Fornecedor>();
	}
	
	/**
	 * 
	 */
	public boolean save () throws IOException {
		FileWriter fw = new FileWriter("Fornecedores.dat",false);
    	String str = "#cnpj\t\tnome\t\tcodigo\tendereco\t\ttelefone";
	    for (Fornecedor fornecedor : fornecedores) {
	    	str+=fornecedor.getCnpj()+"\t"+fornecedor.getNome()+"\t"+fornecedor.getCodigo()+"\t"+fornecedor.getEndereco()+"\t"+fornecedor.getTelefone()+"\n";
		}
		fw.write(str);
		fw.close();
		return true;
	}
	/**
	 * 
	 */
	public void getFornecedor () throws FileNotFoundException, IOException {
		File file = new File("fornecedores.dat");

		if (! file.exists()) {
		System.out.println("ERRO arquivo Nao Encontrado!");
		}

		BufferedReader br = new BufferedReader(new FileReader("fornecedores.dat"));
		String linha;
		while( (linha = br.readLine()) != null ){
			if(linha.startsWith("#")){ 
				continue;
				}
			String[] dados = linha.split("\t");
			cadastro(new Fornecedor(dados[0],dados[1],Integer.parseInt(dados[2]),dados[3],dados[4]));
		}
		br.close();
	}
	/**
	 * 
	 */
	public Fornecedor searchFornecedor(int codigo) {
		for (Fornecedor fornecedor: fornecedores) {
			if (fornecedor.getCodigo() == codigo){
				return fornecedor;
			}
	    }
		return null;
	}
	/**
	 * 
	 */
	public Fornecedor searchFornecedor (String nome) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getNome() == nome){
				return fornecedor;
			}
	    }
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Fornecedor fornecedor) {
		if (searchFornecedor(fornecedor.getCodigo()) != null){
			System.out.println("Fornecedor ja cadastrado.");
			return false;
		}
		return this.fornecedores.add(fornecedor);
	}
	/**
	 * 
	 */
	public void overview () throws FileNotFoundException, IOException {
    	System.out.println("codigo\tnome\ttelefone\n");
	    for (Fornecedor fornecedor : fornecedores) {
	    	System.out.println(fornecedor.getCodigo()+"\t"+fornecedor.getNome()+"\t"+fornecedor.getTelefone()+"\n");
		}
	}
}

