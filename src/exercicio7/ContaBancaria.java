package exercicio7;

public class ContaBancaria {
    String nomeDoTitular;
    int numero;
    int agencia;
    private double saldo;
    double limite;
    String abertaEm;

    public ContaBancaria(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        this.nomeDoTitular = nomeDoTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.abertaEm = abertaEm;
    }

    boolean sacar(int valor) {
        if (saldo + limite >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean depositar(int valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    double verificaSaldo() {
        return this.saldo;
    }

}
