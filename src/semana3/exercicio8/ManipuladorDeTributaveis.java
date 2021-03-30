package semana3.exercicio8;

import semana3.exercicio8.interfaces.Tributavel;

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
