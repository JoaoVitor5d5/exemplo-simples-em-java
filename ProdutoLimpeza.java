package prova;

public class ProdutoLimpeza extends Produto{
	private String marca;

    public ProdutoLimpeza(String marca, String Id, String descricao, int quantidade, double valor) {
        super(Id, descricao, quantidade, valor);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getId() {
        return super.getId();
    }

    public void setId(String Id) {
        super.setId(Id);
    }

    public String getDescricao() {
        return super.getDescricao();
    }

    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public int getQantidade() {
        return super.getQuantidade();
    }

    public void setQantidade(int quantidade) {
        super.setQuantidade(quantidade);
    }

    public double getValor() {
        return super.getValor();
    }

    public void setValor(double valor) {
        super.setValor(valor);
    }

    @Override
    public String toString() {
        return "ProdutoLimpeza{" + "marca=" + marca + ", Id=" + super.getId() + ", Descrição=" + super.getDescricao() + ", Quantidade=" + super.getQuantidade() + ", Valor=" + super.getValor() + '}';
    }

}
