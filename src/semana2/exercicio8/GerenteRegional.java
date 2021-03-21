package semana2.exercicio8;

public class GerenteRegional extends Gerente  {

    public GerenteRegional(String nome, String sobrenome, String cpf, double salario, String senha) {
        super(nome, sobrenome, cpf, salario, senha);
    }

    public double calculaBonificacao () {
        return (this.salario * (15.00 / 100)) + 1000.00;
    }

}
