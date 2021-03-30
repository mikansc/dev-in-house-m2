package semana3.exercicio12;

public class FuncionarioAssalariado extends Funcionario {
    private double salario;

    public FuncionarioAssalariado(String nome, String sobrenome, double salario) {
        super(nome, sobrenome);
        this.salario = validaSalario(salario);
    }

    private double validaSalario(double salario) {
        return Math.max(salario, 0.00);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s | " +
                        "Salário: %.2f",
                this.nome, this.sobrenome, this.salario);
    }


    @Override
    public double calcularSalarioMensal() {
        return this.salario;
    }
}
