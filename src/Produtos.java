
public class Produtos {

	//Dados dos produtos
	private int id;
	private String nome;
	private double valor;
	private int qtd;
	
	//objeto
	public Produtos(int id, String nome, double valor, int qtd) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}

	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
