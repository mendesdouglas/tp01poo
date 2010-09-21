package Persistencia;
import java.util.*;
import Estoque.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PEstoque {
	
	ArrayList<Item> itens;
	 
	public PEstoque () {
		this.itens = new ArrayList<Item>(); 
	}
	
	/**
	 * 
	 */
	public boolean save () throws IOException {

		FileWriter fw = new FileWriter("estoque.dat",false);
    	String str = "#codigo\tnome\tpreco custo\tmargem lucro\tquantidade\n";
	    for (Item item : itens) {
	    	str+=item.getCodigo()+"\t"+item.getNome()+"\t"+item.getPrecoCusto()+"\t"+item.getMargemLucro()+"\t"+item.getQuant()+"\n";
		}
		fw.write(str);
		fw.close();
		return true;
	}
	
	/**
	 * 
	 */
	public boolean save (Compra listaCompra) {
		return true;
	}
	/**
	 * 
	 */
	public boolean save (Pedido listaPedido) {
		return true;
	}
	/**
	 * 
	 */
	public void getEstoque () throws FileNotFoundException, IOException {

		File file = new File("estoque.dat");

		if (! file.exists()) {
		System.out.println("ERRO arquivo Nao Encontrado!!");
		}

		BufferedReader br = new BufferedReader(new FileReader("estoque.dat"));
		String linha;
		while( (linha = br.readLine()) != null ){
			if(linha.startsWith("#")){ 
				continue;
				}
			String[] dados = linha.split("\t");
			cadastro(new Item(dados[1],Integer.parseInt(dados[0]),Float.parseFloat(dados[2]),Float.parseFloat(dados[3]),Integer.parseInt(dados[4])));
		}
		br.close();		
	}
	/**
	 * 
	 */
	public Item searchItem (int codigo) {
		return null;
	}
	/**
	 * 
	 */
	public Item searchItem (String nome) {
		return null;
	}
	/**
	 * 
	 */
	public boolean cadastro (Item item) {
		if (this.itens.contains(item)){
			System.out.println("Item ja existe");
			return false;
		}
		return this.itens.add(item);
	}
	/**
	 * 
	 */
	public boolean cadastro (Pedido pedido) {
		return true;
	}
	/**
	 * 
	 */
	public boolean cadastro (Compra compra) {
		return true;
	}
	/**
	 * 
	 */
	public void overview () {
    	System.out.println("codigo\tnome\tpreco custo\tmargem lucro\tquantidade");
	    for (Item item : itens) {
	    	System.out.println(item.getCodigo()+"\t"+item.getNome()+"\t"+item.getPrecoCusto()+"\t"+item.getMargemLucro()+"\t"+item.getQuant());
		}
	}
}

