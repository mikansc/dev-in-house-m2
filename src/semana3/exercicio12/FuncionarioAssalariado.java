package semana3.exercicio12;

import java.time.LocalDate;

public class FuncionarioAssalariado extends Funcionario {
    private double salario;

    public FuncionarioAssalariado(String nome, String sobrenome, String dataNascimento, double salario) {
        super(nome, sobrenome, dataNascimento);
        this.salario = salario;
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
