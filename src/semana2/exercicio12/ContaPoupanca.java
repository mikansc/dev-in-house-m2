package semana2.exercicio12;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        super(nomeDoTitular, numero, agencia, abertaEm);
    }

    public void renderJurosDePoupanca() {
        this.saldo *= 1.001;
    }
}
