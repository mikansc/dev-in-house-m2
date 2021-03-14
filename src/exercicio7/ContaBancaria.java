package exercicio7;

public class ContaBancaria {
    String nomeDoTitular;
    int numero;
    int agencia;
    double limite;
    String abertaEm;
    private double saldo;

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

    // Exercício 8
    String recuperaDadosParaImpressao() {
        return "Dados da conta - Titular: " + this.nomeDoTitular + " Ag.: " + this.agencia + " C/C.: " + this.numero + " Aberta em: " + this.abertaEm + ".";
    }

}
