package semana3.exercicio9;

public abstract class FormaTridimensional extends Forma {
    protected int altura;
    protected int largura;
    protected int comprimento;

    public FormaTridimensional(String cor, String material, int altura, int largura, int comprimento) {
        super(cor, material);
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public abstract int getVolume();
}
