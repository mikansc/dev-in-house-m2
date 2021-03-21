package semana2.exercicio12;

public class ContaCorrente extends Conta{

    public ContaCorrente(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        super(nomeDoTitular, numero, agencia, abertaEm);
    }

    @Override
    boolean sacar(double valor) {
        return super.sacar(valor - 0.10);
    }
}
