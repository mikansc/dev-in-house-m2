package semana2.exercicio8;

public class Gerente extends Funcionario {

    public String senha;
    public int numSubordinados;

    public Gerente(String nome, String sobrenome, String cpf, double salario, String senha, int numSubordinados) {
        super(nome, sobrenome, cpf, salario);
        this.senha = senha;
        this.numSubordinados = numSubordinados;
    }

}
