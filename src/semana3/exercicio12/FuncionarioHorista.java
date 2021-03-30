package semana3.exercicio12;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double salarioHora;

    public FuncionarioHorista(String nome, String sobrenome, double horasTrabalhadas, double salarioHora) {
        super(nome, sobrenome);
        this.horasTrabalhadas = validaHoras(horasTrabalhadas);
        this.salarioHora = validaSalario(salarioHora);
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = validaSalario(salarioHora);
    }

    private double validaSalario(double salario) {
        return Math.max(salario, 0.00);
    }

    private double validaHoras(double horas) {
        if(horas >=0 && horas <= 168) {
            return horas;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s | " +
                        "Horas trabalhadas: %.2f | Salário/hora: R$ %.2f.",
                this.nome, this.sobrenome, this.horasTrabalhadas, this.salarioHora);
    }

    @Override
    public double calcularSalarioMensal() {
        return horasTrabalhadas * salarioHora;
    }
}
