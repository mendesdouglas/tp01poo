package persistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import pessoas.Fornecedor;


	public class PersistenciaFornecedor {

		private static PersistenciaFornecedor FornecedorInstance;
		ArrayList<Fornecedor> fornecedores;
		 
		private PersistenciaFornecedor () {
			this.fornecedores = new ArrayList<Fornecedor>();
			try {
				getFornecedor();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 
		public static PersistenciaFornecedor getInstance(){
			if(FornecedorInstance == null) {
				FornecedorInstance = new PersistenciaFornecedor();
		    }
		    return FornecedorInstance;
		 }
	/**
	 * 
	 */
	public boolean save () throws IOException {
		FileWriter fw = new FileWriter("Fornecedores.dat",false);
    	String str = "#cnpj\tnome\tcodigo\tendereco\ttelefone\n";
	    for (Fornecedor fornecedor : fornecedores) {
	    	str+=fornecedor.getCnpj()+"\t"+fornecedor.getNome()+"\t"+fornecedor.getEndereco()+"\t"+fornecedor.getTelefone()+"\n";
		}
		fw.write(str);
		fw.close();
		return true;
	}
	/**
	 * 
	 */
	private void getFornecedor () throws FileNotFoundException, IOException {
		File file = new File("Fornecedores.dat");

		if (! file.exists()) {
			file.createNewFile();
		}

		BufferedReader br = new BufferedReader(new FileReader("Fornecedores.dat"));
		String linha;
		while( (linha = br.readLine()) != null ){
			if(linha.startsWith("#")){ 
				continue;
				}
			String[] dados = linha.split("\t");
			if (dados.length == 2){
				cadastro(new Fornecedor(dados[0],dados[1]));
			}
			if (dados.length == 4){
				cadastro(new Fornecedor(dados[0],dados[1],dados[2],dados[3]));
			}
		}
		br.close();
	}
	/**
	 * 
	 */
	public Fornecedor searchFornecedor (String query) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getNome().equals(query) || fornecedor.getCnpj().equals(query)){
				return fornecedor;
			}
	    }
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Fornecedor fornecedor) {
		if (searchFornecedor(fornecedor.getCnpj()) != null){
			return false;
		}
		return this.fornecedores.add(fornecedor);
	}
	
	public boolean removerFornecedor(String query) throws IOException{
		Fornecedor fornecedor = this.searchFornecedor(query);
		if (fornecedor ==null){
			return false;
		}
		else {
			this.fornecedores.remove(fornecedor);
			this.save();
			return true;
		}
	}
	
	public void purge(){
		this.fornecedores.clear();
	}
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Fornecedor> overview () {
		if (this.fornecedores.size() > 0){
			return (ArrayList<Fornecedor>) this.fornecedores.clone();
		}
		else{
			return null;
		}
	}
}
