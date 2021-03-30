package semana3.exercicio17;

public class Moto implements PegadaCarbono {
    private String modelo;
    private int cilindrada;
    private double consumoCombustivel;
    private TipoEnergia tipoEnergia;

    public Moto(String modelo, int cilindrada, double consumoCombustivel, TipoEnergia tipoEnergia) {
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.consumoCombustivel = consumoCombustivel;
        this.tipoEnergia = tipoEnergia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
        if (tipoEnergia == TipoEnergia.ALCOOL) {
            return 12.75;
        } else if (tipoEnergia == TipoEnergia.GASOLINA) {
            return 18.00;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return String.format("Moto: %s %dcc | Consumo: %.2fkm/L | Combustível: %s", this.modelo, this.cilindrada, this.consumoCombustivel, this.tipoEnergia);
    }
}
