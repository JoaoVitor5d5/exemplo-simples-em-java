package prova;

public class Produto {
	private String Id;
    private String descricao;
    private int quantidade;
    private double valor;

    public Produto(String Id, String descricao, int quantidade, double valor) {
        this.Id = Id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int qantidade) {
        this.quantidade = qantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "Id=" + Id + ", descricao=" + descricao + ", qantidade=" + quantidade + ", valor=" + valor + '}';
    }
    public void darBaixa(int numero){
        if(this.quantidade >= numero){
            this.quantidade = quantidade - numero;
            System.out.println("Você deu baixa no produto!");
        }
        else {
        	System.out.println("Quantidade de produtos insuficientes, você só tem " + this.quantidade + " de itens");
        }
    }
    public void repor(int numero){
        this.quantidade = quantidade + numero;
    }
    public double ValorTotal(){
        return this.quantidade * this.valor;
    }

}
