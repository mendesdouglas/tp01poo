package Estoque;

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
	 * Get the value of nome
	 * @return the value of nome
	 */
	public String getNome () {
		return this.nome;
	}
	/**
	 * Set the value of nome
	 */
	public void setNome (String nome) {
		this.nome = nome;
	}
	/**
	 * Get the value of codigo
	 * @return the value of codigo
	 */
	public int getCodigo () {
		return this.codigo;
	}
	/**
	 * Set the value of codigo
	 */
	public void setCodigo (int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Get the value of precoCusto
	 * 
	 * @return the value of precoCusto
	 */
	public float getPrecoCusto (  ) {
		return this.precoCusto;
	}
	/**
	 * Set the value of precoCusto
	 */
	public void setPrecoCusto (float precoCusto) {
		this.precoCusto = precoCusto;
	}
	/**
	 * Get the value of margemLucro
	 * @return the value of margemLucro
	 */
	public float getMargemLucro () {
		return this.margemLucro;
	}
	/**
	 * Set the value of margemLucro
	 */
	public void setMargemLucro (float margemLucro) {
		this.margemLucro = margemLucro;
	}
	/**
	 * Get the value of quant
	 * @return the value of quant 
	 */
	public int getQuant () {
		return this.quant;
	}
	/**
	 * Set the value of quant
	 */
	public void setQuant (int quant) {
		this.quant = quant;
	}
}