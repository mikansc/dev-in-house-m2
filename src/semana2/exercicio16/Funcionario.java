package semana2.exercicio16;

public class Funcionario {
    protected String nome;
    protected String sobrenome;
    protected String CPF;

    public Funcionario(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s | CPF: %s", this.nome, this.sobrenome, this.CPF);
    }
}
