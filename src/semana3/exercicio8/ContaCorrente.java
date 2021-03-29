package semana3.exercicio8;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        super(nomeDoTitular, numero, agencia, abertaEm);
    }

    @Override
    boolean sacar(double valor) {
        return super.sacar(valor - 0.10);
    }

    public String getTipo () {
        return "Conta Corrente";
    }
}
