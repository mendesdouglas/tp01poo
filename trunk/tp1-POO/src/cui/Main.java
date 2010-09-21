package cui;
import java.io.IOException;
import Estoque.*;
import Persistencia.*;
import cui.*;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		PEstoque estoque = new PEstoque();
		String teste;
		estoque.cadastro(new Item("camisa",21,(float)5.00,(float)0.25,5));
		estoque.cadastro(new Item("short",21,(float)5.00,(float)0.25,5));
		estoque.cadastro(new Item("tenis",21,(float)5.00,(float)0.25,5));
		estoque.cadastro(new Item("calça",21,(float)5.00,(float)0.25,5));
		estoque.cadastro(new Item("regata",21,(float)5.00,(float)0.25,5));
		estoque.cadastro(new Item("saia",21,(float)5.00,(float)0.25,5));
		estoque.overview();
		estoque.save();
	}

}
