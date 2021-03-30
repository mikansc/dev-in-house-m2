package semana3.exercicio9;

import java.util.Objects;

public class FormaBidimensional extends Forma {

    private int base;
    private int altura;

    public FormaBidimensional(String cor, String material, int base, int altura) {
        super(cor, material);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return this.altura * this.base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaBidimensional that = (FormaBidimensional) o;
        return base == that.base && altura == that.altura;
    }
}
