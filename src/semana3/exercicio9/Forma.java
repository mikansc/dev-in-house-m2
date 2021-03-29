package semana3.exercicio9;

public abstract class Forma {
    String cor;
    String material;

    public Forma(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    public abstract int getArea();
}
