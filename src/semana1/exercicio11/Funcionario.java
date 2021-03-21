package semana1.exercicio11;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMes;

    public Funcionario(String nome, String sobrenome, double salarioMes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMes = salarioMes > 0 ? salarioMes : 0.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes > 0 ? salarioMes : 0.00;
    }
}
