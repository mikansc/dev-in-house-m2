package semana4.exercicio3;

public abstract class Conta {

    private static int totalDeContas;
    protected double saldo;
    String nomeDoTitular;
    int numero;
    int agencia;
    double limite;
    String abertaEm;
    private int identificador;

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

    boolean depositar(double valor) {
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
        return String.format("Dados da %s: Titular - %s | Ag.: %d | Conta: %d | Saldo: R$ %.2f | Aberta em %s.",
                this.getTipo(), this.nomeDoTitular,
                this.agencia, this.numero,
                this.saldo, this.abertaEm);
    }

    // Exercício 15
    public int getIdentificador() {
        return identificador;
    }


    // ex 14 semana 2
    public abstract String getTipo();

    @Override
    public String toString() {
        return this.recuperaDadosParaImpressao();
    }
}
