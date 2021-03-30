package semana3.exercicio17;

public class Carro implements PegadaCarbono {
    private String modelo;
    private double consumoCombustivel;
    private TipoEnergia tipoEnergia;

    public Carro(String modelo, double consumoCombustivel, TipoEnergia tipoEnergia) {
        this.modelo = modelo;
        this.consumoCombustivel = consumoCombustivel;
        this.tipoEnergia = tipoEnergia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public TipoEnergia getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(TipoEnergia tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    @Override
    public double getPegadaCarbono() {
        if (tipoEnergia == TipoEnergia.ELETRICA) {
            return 12.5;
        } else if (tipoEnergia == TipoEnergia.ALCOOL) {
            return 18.25;
        } else if (tipoEnergia == TipoEnergia.GASOLINA) {
            return 25.00;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return String.format("Carro: %s | Consumo: %.2fkm/L | Combustível: %s", this.modelo, this.consumoCombustivel, this.tipoEnergia);
    }

}
