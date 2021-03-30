package semana3.exercicio8;

import semana3.exercicio8.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

    private double valor;
    private String titular;
    private int numeroApolice;

    public SeguroDeVida(double valor, String titular, int numeroApolice) {
        this.valor = valor;
        this.titular = titular;
        this.numeroApolice = numeroApolice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    @Override
    public double getValorImposto() {
        return (this.valor * 0.02) + 42;
    }

    @Override
    public String toString() {
        return String.format("Apólice: %d | Titular: %s | Valor: R$ %.2f.", this.numeroApolice, this.titular, this.valor);
    }
}
