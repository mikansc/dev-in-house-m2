package semana2.exercicio16;

public class FuncionarioComissionado extends Funcionario{
    private double vendasBrutas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String sobrenome, String CPF, double vendasBrutas, double taxaComissao) {
        super(nome, sobrenome, CPF);
        this.vendasBrutas = validaVendasBrutas(vendasBrutas);
        this.taxaComissao = validarTaxaComissao(taxaComissao);
    }

    public double validaVendasBrutas(double valor) {
        return Math.max(valor, 0.00);
    }

    public double validarTaxaComissao(double taxa) {
        if ( taxa >= 0.00 && taxa < 1) {
            return taxa;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s | CPF: %s | " +
                "Vendas (bruto): R$%.2f | Taxa comissão (%%): %.2f.",
                this.nome, this.sobrenome, this.CPF, this.vendasBrutas, this.taxaComissao * 100);
    }

    public double ganhos() {
        return this.taxaComissao * this.vendasBrutas;
    }
}
