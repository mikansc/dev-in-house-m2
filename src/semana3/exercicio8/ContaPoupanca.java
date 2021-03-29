package semana3.exercicio8;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        super(nomeDoTitular, numero, agencia, abertaEm);
    }

    public void renderJurosDePoupanca() {
        this.saldo *= 1.001;
    }

    // ao comentar o getTipo, o compilador apresenta erro, pois o método
    // abstrato da classe Conta não foi implementado.
    public String getTipo () {
        return "Conta Poupança";
    }
}
