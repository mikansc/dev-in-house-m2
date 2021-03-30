package semana4.exercicio3;

import semana4.exercicio3.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

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

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
