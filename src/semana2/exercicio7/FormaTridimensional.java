package semana2.exercicio7;

public class FormaTridimensional extends Forma {
    private int altura;
    private int largura;
    private int comprimento;

    public FormaTridimensional(String cor, String material, int altura, int largura, int comprimento) {
        super(cor, material);
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }
}
