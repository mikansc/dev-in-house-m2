package semana4.exercicio3;

import semana4.exercicio3.interfaces.Tributavel;

public class ManipuladorDeTributaveis {
    private double total;

    public ManipuladorDeTributaveis() {
    }

    public double getTotal() {
        return total;
    }

    void calculaImpostos(Tributavel[] tributaveis) {
        for (Tributavel tributavel : tributaveis) {
            total += tributavel.getValorImposto();
        }
    }

}
