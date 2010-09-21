package cui;
import java.io.IOException;
import Estoque.*;
import Persistencia.*;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		PEstoque estoque = new PEstoque();
		estoque.getEstoque();
		estoque.overview();
		estoque.save();
		
		Menu.principal();
	}
	
	

}
