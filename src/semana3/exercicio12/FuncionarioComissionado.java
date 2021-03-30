package semana3.exercicio12;

public class FuncionarioComissionado extends Funcionario {
    private double vendasBrutas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String sobrenome, double vendasBrutas, double taxaComissao) {
        super(nome, sobrenome);
        this.vendasBrutas = validaVendasBrutas(vendasBrutas);
        this.taxaComissao = validarTaxaComissao(taxaComissao);
    }

    public double validaVendasBrutas(double valor) {
        return Math.max(valor, 0.00);
    }

    public double validarTaxaComissao(double taxa) {
        if (taxa >= 0.00 && taxa < 1) {
            return taxa;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s | " +
                        "Vendas (bruto): R$%.2f | Taxa comissão (%%): %.2f.",
                this.nome, this.sobrenome, this.vendasBrutas, this.taxaComissao * 100);
    }

    @Override
    public double calcularSalarioMensal() {
        return this.taxaComissao * this.vendasBrutas;
    }

}
