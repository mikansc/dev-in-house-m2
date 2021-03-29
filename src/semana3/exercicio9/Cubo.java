package semana3.exercicio9;

public class Cubo extends FormaTridimensional {

    public Cubo(String cor, String material, int altura, int largura, int comprimento) {
        super(cor, material, altura, largura, comprimento);
    }

    @Override
    public int getArea() {
        return 6 * (this.altura * this.largura);
    }


    @Override
    public int getVolume() {
        return (int) Math.pow(this.comprimento, 3);
    }
}
