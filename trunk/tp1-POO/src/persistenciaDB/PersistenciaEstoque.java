package persistenciaDB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


import estoque.*;

public class PersistenciaEstoque {
	
	private static PersistenciaEstoque EstoqueInstance;
	private Connection conn;

	private PersistenciaEstoque () {
		Conecta c = Conecta.getConnection();
		this.conn = c.conn;
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
	public boolean save (){
		return true;
	}
	
	/**
	 * 
	 */
	public boolean saveCompra (Compra compra){
		return true;
	}
	
	/**
	 * 
	 */
	public boolean savePedido (Pedido pedido){
		return true;
	}
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private void getEstoque (){	
	}
	
	/**
	 * 
	 */
	public Item searchItem (int codigo) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item where codigo="+codigo);
			Item item = new Item(rs.getString("nome"),rs.getInt("codigo"),rs.getFloat("precoCusto"),rs.getFloat("margemLucro"),rs.getInt("quant"));
			return item;
		} catch (SQLException e) {
			return null;
		}
	}
	
	/**
	 * 
	 */
	public Item searchItem (String nome) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item where nome="+nome);
			Item item = new Item(rs.getString("nome"),rs.getInt("codigo"),rs.getFloat("precoCusto"),rs.getFloat("margemLucro"),rs.getInt("quant"));
			return item;
		} catch (SQLException e) {
			return null;
		}
	}
	
	public boolean delItem(int codigo){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Item where codigo="+codigo);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean delItem(String nome){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Item where nome="+nome);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	/**
	 * 
	 */
	public boolean cadastro (Item item) {
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item where codigo="+item.getCodigo());
			if ( ! rs.wasNull()){
				return false;
			}
			
			stat.executeUpdate("insert into Item (nome,codigo,precoCusto,margemLucro,quant) " +
					"values('"+item.getNome()+"','"+item.getCodigo()+"','"+item.getPrecoCusto()+"','"+item.getMargemLucro()+"','"+item.getQuant()+"')");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void purge(){
		Statement stat;
		try {
			stat = conn.createStatement();
			stat.executeUpdate("delete from Item");
		} catch (SQLException e) {
		}
	}
	
	
	/**
	 * 
	 */
	public ArrayList<Item> overview () {
		ArrayList<Item> itens = new ArrayList<Item>();
		Statement stat;
		ResultSet rs;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from Item");
			if (rs.wasNull()){
				return null;
			}
			while (rs.next()){
				Item item = new Item(rs.getString("nome"),rs.getInt("codigo"),rs.getFloat("precoCusto"),rs.getFloat("margemLucro"),rs.getInt("quant"));
				itens.add(item);	
			}
			return itens;
		} catch (SQLException e) {
			return null;
		}
	}

	public void finalizarPedido(Pedido pedido) throws IOException {
		ArrayList<ItemPedido> listaPedido = pedido.overview();
		if (listaPedido.size() == 0){
			return;
		}
	    for (ItemPedido item : listaPedido) {
	    	Item itemReferencia = this.searchItem(item.getCodigoItem());
	    	itemReferencia.setQuant(itemReferencia.getQuant()-item.getQuant());
	    }
		this.save();
		this.savePedido(pedido);
	}
	
	public void finalizarCompra(Compra compra) throws IOException {
		ArrayList<ItemCompra> listaCompra = compra.overview();
		if (listaCompra.size() == 0){
			return;
		}
	    for (ItemCompra item : listaCompra) {
	    	Item itemReferencia = this.searchItem(item.getCodigoItem());
	    	itemReferencia.setQuant(itemReferencia.getQuant() + item.getQuant());
	    	itemReferencia.setPrecoCusto(Estoque.calculaPrecoMedioPonderado(item));
	    }
		this.save();
		this.saveCompra(compra);
	}
}

