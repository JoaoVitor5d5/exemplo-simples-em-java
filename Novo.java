package prova;

public class Novo extends Imovel {
	public double adicional;

	public Novo(int id, String endereco, double valor) {
		super(id, endereco, valor);
		this.adicional = 15;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return "Novo [adicional=" + adicional + ", id=" + id + ", endereco=" + endereco + ", valor=" + valor + "]";
	}
	
	public double getValorVenda() {
		return super.valor + ((super.valor / 100) * this.adicional); 
	}
}
