package semana3.exercicio8;

public abstract class Conta {

    private static int totalDeContas;
    private int identificador;

    String nomeDoTitular;
    int numero;
    int agencia;
    double limite;
    String abertaEm;
    protected double saldo;

    public Conta() {
        Conta.totalDeContas++;
    }

    public Conta(String nomeDoTitular, int numero, int agencia, String abertaEm) {
        this();
        this.identificador = totalDeContas;
        this.nomeDoTitular = nomeDoTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.abertaEm = abertaEm;
    }

    boolean sacar(double valor) {
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

        return "Dados da "+ this.getTipo() + " - Titular: " + this.nomeDoTitular + " Ag.: " + this.agencia + " C/C.: " + this.numero + " Aberta em: " + this.abertaEm + ".";
    }

    // Exercício 15
    public int getIdentificador() {
        return identificador;
    }


    // ex 14 semana 2
    public abstract String getTipo ();

}
