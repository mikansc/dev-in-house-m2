package semana1.exercicio6;

public class Porta {
    String cor = "branca";
    double largura = 0.82;
    double altura = 2.1;
    double profundidade = 0.25;
    private boolean aberta;

    void estaAberta() {
        if (aberta) {
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
    }

    boolean abre() {
        if (!this.aberta) {
            this.aberta = true;
            return true;
        }
        return false;
    }

    boolean fecha() {
        if (this.aberta) {
            this.aberta = false;
            return true;
        }
        return false;
    }

    void pinta(String cor) {
        this.cor = cor;
    }

}
