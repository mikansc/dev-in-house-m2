package semana3.exercicio17;

public class ImprimirDados {
    public static void main(String[] args) {

        Predio casa1 = new Predio("Ed. José Geraldo",60, 120, TipoEnergia.ELETRICA);
        Carro carro1 = new Carro("Palio", 14, TipoEnergia.GASOLINA);
        Carro carro2 = new Carro("Sandero", 16, TipoEnergia.ALCOOL);
        Moto moto1 = new Moto("Ninja",600,30,TipoEnergia.GASOLINA);

        PegadaCarbono[] emissores = new PegadaCarbono[4];
        emissores[0] = casa1;
        emissores[1] = carro1;
        emissores[2] = carro2;
        emissores[3] = moto1;

        for (PegadaCarbono emissor :
                emissores) {
            System.out.printf("%s -> pegada de carbono: %.2f.%n", emissor, emissor.getPegadaCarbono());
        }
    }
}
