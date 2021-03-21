package semana2.exercicio7;

public class FormaBidimensional extends Forma{

    private int base;
    private int altura;

    public FormaBidimensional(String cor, String material, int base, int altura) {
        super(cor, material);
        this.base = base;
        this.altura = altura;
    }
}
