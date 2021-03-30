package semana3.exercicio17;

public class Predio implements PegadaCarbono {

    private String nome;
    private double tamanho;
    private double consumoEnergia;
    private TipoEnergia tipoEnergia;

    public Predio(String nome, double tamanho, double consumoEnergia, TipoEnergia tipoEnergia) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.consumoEnergia = consumoEnergia;
        this.tipoEnergia = tipoEnergia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public TipoEnergia getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(TipoEnergia tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    @Override
    public double getPegadaCarbono() {
        // retorna valores arbitrários - não achei fórmula de cálculo de pegada de carbono
        if (tipoEnergia == TipoEnergia.ELETRICA) {
            return 12.5;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Prédio: %s | Tamanho: %.2fm2 | Consumo de energia: %.2fkWh", this.nome, this.tamanho, this.consumoEnergia);
    }
}
