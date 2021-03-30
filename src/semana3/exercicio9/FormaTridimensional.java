package semana3.exercicio9;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaTridimensional that = (FormaTridimensional) o;
        return altura == that.altura && largura == that.largura && comprimento == that.comprimento;
    }

}
