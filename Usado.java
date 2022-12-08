package prova;

public class Usado extends Imovel {
	public double desconto;

	public Usado(int id, String endereco, double valor) {
		super(id, endereco, valor);
		this.desconto = 5;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Usado [desconto=" + desconto + ", id=" + id + ", endereco=" + endereco + ", valor=" + valor + "]";
	}
	
	public double getValorVenda() {
		return super.valor - ((super.valor / 100) * this.desconto); 
	}
}
