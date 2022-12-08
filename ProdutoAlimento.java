package prova;

public class ProdutoAlimento extends Produto {
	private String tipo;

    public ProdutoAlimento(String tipo, String Id, String descricao, int quantidade, double valor) {
        super(Id, descricao, quantidade, valor);
        this.tipo = tipo;
    }

    public String getMarca() {
        return tipo;
    }

    public void setMarca(String tipo) {
        this.tipo = tipo;
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
        return "ProdutoAlimento{" + "tipo=" + tipo + ", Id=" + super.getId() + ", Descrição=" + super.getDescricao() + ", Quantidade=" + super.getQuantidade() + ", Valor=" + super.getValor() + '}';
    }

}
