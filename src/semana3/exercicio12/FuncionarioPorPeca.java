package semana3.exercicio12;

public class FuncionarioPorPeca extends Funcionario {
    private int qtdPecas;
    private double salarioPorPeca;

    public FuncionarioPorPeca(String nome, String sobrenome, String dataNascimento, int qtdPecas, double salarioPorPeca) {
        super(nome, sobrenome, dataNascimento);
        this.qtdPecas = qtdPecas;
        this.salarioPorPeca = salarioPorPeca;
    }

    @Override
    public double calcularSalarioMensal() {
        return this.qtdPecas * this.salarioPorPeca;
    }

    @Override
    public String toString() {
        return String.format("%s | Peças produzidas: %d | Salário/peça: %.2f.%n", super.toString(), this.qtdPecas, this.salarioPorPeca);
    }
}
