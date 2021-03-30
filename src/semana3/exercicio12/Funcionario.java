package semana3.exercicio12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Funcionario {
    protected String nome;
    protected String sobrenome;
    private LocalDate dataNascimento;

    public Funcionario(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = parseDataNascimento(dataNascimento);
    }

    public LocalDate parseDataNascimento(String data) {
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s", this.nome, this.sobrenome);
    }

    public abstract double calcularSalarioMensal();
}
