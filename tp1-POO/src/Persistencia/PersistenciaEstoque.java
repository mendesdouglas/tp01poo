package Persistencia;
import java.util.*;
import Estoque.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaEstoque {
	
	private static PersistenciaEstoque EstoqueInstance;
	ArrayList<Item> itens;
	 
	private PersistenciaEstoque () {
		this.itens = new ArrayList<Item>(); 
		try {
			getEstoque();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	public static PersistenciaEstoque getInstance(){
		if(EstoqueInstance == null) {
			EstoqueInstance = new PersistenciaEstoque();
	    }
	    return EstoqueInstance;
	 }
	
	/**
	 * 
	 */
	public boolean save () throws IOException {

		FileWriter fw = new FileWriter("Estoque.dat",false);
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
	public boolean saveCompra (ArrayList<ItemCompra> listaCompra) throws IOException {
		FileWriter fw = new FileWriter("Compras.dat",true);
    	String str = "#codigo\tpreco compra\tquantidade\n";
	    for (ItemCompra item : listaCompra) {
	    	str+=item.getCodigoItem()+"\t"+item.getPrecoCompra()+"\t"+item.getQuant()+"\n";
		}
		fw.write(str);
		fw.close();
		return true;
	}
	
	/**
	 * 
	 */
	public boolean savePedido (ArrayList<ItemPedido> listaPedido) throws IOException {
		FileWriter fw = new FileWriter("Pedidos.dat",true);
    	String str = "#codigo\tpreco compra\tquantidade\n";
	    for (ItemPedido item : listaPedido) {
	    	str+=item.getCodigoItem()+"\t"+item.getQuant()+item.getPrecoPedido()+"\n";
		}
		fw.write(str);
		fw.close();
		return true;
	}
	
	/**
	 * 
	 */
	private void getEstoque () throws FileNotFoundException, IOException {

		File file = new File("Estoque.dat");

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
			cadastro(new Item(dados[1],Integer.parseInt(dados[0]),Float.parseFloat(dados[2]),Float.parseFloat(dados[3]),Integer.parseInt(dados[4])));
		}
		br.close();		
	}
	
	/**
	 * 
	 */
	public Item searchItem (int codigo) {
		for (Item item : itens) {
			if (item.getCodigo() == codigo){
				return item;
			}
	    }
		return null;
	}
	
	/**
	 * 
	 */
	public Item searchItem (String nome) {
		for (Item item : itens) {
			if (item.getNome().equals(nome)){
				return item;
			}
	    }
		return null;
	}
	
	/**
	 * 
	 */
	public boolean cadastro (Item item) {
		if (searchItem(item.getCodigo())!=null){
			System.out.println("Item ja existe");
			return false;
		}
		return this.itens.add(item);
	}
	
	/**
	 * 
	 */
	public Object overview () {
		if (this.itens.size() > 0){
			return this.itens.clone();
		}
		else{
			return null;
		}
	}
}

