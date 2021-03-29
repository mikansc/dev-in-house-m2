package semana3.exercicio9;

public class Prisma extends FormaTridimensional {
    public Prisma(String cor, String material, int altura, int largura, int comprimento) {
        super(cor, material, altura, largura, comprimento);
    }

    @Override
    public int getArea() {
        return 2 * (this.largura * this.comprimento / 2) + 3 * (this.largura * this.altura);
    }

    @Override
    public int getVolume() {
        return (this.largura * this.comprimento) * this.altura;
    }
}
