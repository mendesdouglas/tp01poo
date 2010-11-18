package estoque;

public class Item {
 
	private String nome; 
	private int codigo;
	private float precoCusto;
	private float margemLucro;
	private int quant;

	public Item (String nome,int codigo,float precoCusto,float margemLucro,int quant) {
		this.nome = nome; 
		this.codigo = codigo;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
		this.quant = quant;	
	}
	
	/**
	 * Recupera o nome do Item
	 * @return O nome do Item.
	 */
	public String getNome () {
		return this.nome;
	}
	
	/**
	 * Altera o nome de um Item.
	 */
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	/**
	 * Recupera o código de um Item.
	 * @return O código de um Item.
	 */
	public int getCodigo () {
		return this.codigo;
	}
	
	/**
	 * Altera o código de um item.
	 */
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Recupera o valor do preço de custo de um item.
	 * 
	 * @return O preço de custo de um Item.
	 */
	public float getPrecoCusto (  ) {
		return this.precoCusto;
	}
	
	/**
	 * Altera o preço de custo de um Item.
	 */
	public void setPrecoCusto (float precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	/**
	 * Recupera a margem de lucro de um Item.
	 * 
	 * @return A margem de lucro de um Item.
	 */
	public float getMargemLucro () {
		return this.margemLucro;
	}
	/**
	 * Altera a margem de lucro de um dado Item.
	 */
	public void setMargemLucro (float margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	/**
	 * Retorna a quantidade de um item no estoque.
	 * 
	 * @return A quantidade de um dado item. 
	 */
	public int getQuant () {
		return this.quant;
	}
	
	/**
	 * Altera a quantidade de um item no estoque.
	 */
	public void setQuant (int quant) {
		this.quant = quant;
	}
}