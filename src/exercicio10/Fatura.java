package exercicio10;

public class Fatura {

    private String numero;
    private String descricao;
    private int itemQuantidade;
    private double itemPreco;

    public Fatura(String numero, String descricao, int itemQuantidade, double itemPreco) {
        this.numero = numero;
        this.descricao = descricao;
        this.itemQuantidade = itemQuantidade;
        this.itemPreco = itemPreco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getItemQuantidade() {
        return itemQuantidade;
    }

    public void setItemQuantidade(int itemQuantidade) {
        this.itemQuantidade = itemQuantidade;
    }

    public double getItemPreco() {
        return itemPreco;
    }

    public void setItemPreco(double itemPreco) {
        this.itemPreco = itemPreco;
    }

    public double getValorFatura () {
        if(this.itemQuantidade < 0) {
            this.itemQuantidade = 0;
        }
        if(this.itemPreco < 0) {
            this.itemPreco = 0.0;
        }
        return this.itemQuantidade * this.itemPreco;
    }
}
