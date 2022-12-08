package prova;

public class Imovel {
	protected int id;
	protected String endereco;
	protected double valor;
	
	public Imovel(int id, String endereco, double valor) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
