package semana1.exercicio7;

public class ContaBancaria {

    private static int totalDeContas;
    private int identificador;

    String nomeDoTitular;
    int numero;
    int agencia;
    double limite;
    String abertaEm;
    private double saldo;

    public ContaBancaria() {
        ContaBancaria.totalDeContas++;
    }

    public ContaBancaria(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        this();
        this.identificador = totalDeContas;
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

    // Exercício 15
    public int getIdentificador() {
        return identificador;
    }
}
