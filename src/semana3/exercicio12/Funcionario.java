package semana3.exercicio12;

public abstract class Funcionario {
    protected String nome;
    protected String sobrenome;

    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %", this.nome, this.sobrenome);
    }

    public abstract double calcularSalarioMensal();
}
