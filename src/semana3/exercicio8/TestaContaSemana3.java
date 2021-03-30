package semana3.exercicio8;

import semana3.exercicio8.interfaces.Tributavel;

public class TestaContaSemana3 {

    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Michael",
                10001,
                1980,
                "21/03/2020");

        ContaCorrente conta2 = new ContaCorrente("Michael",
                10002,
                1980,
                "21/03/2020");

        SeguroDeVida seguro = new SeguroDeVida(1000.00,"Michael Nascimento",1000482);

        System.out.println(conta1.getTipo());

        System.out.println(conta2.getTipo());

        System.out.println(seguro);

        conta1.depositar(2500.00);
        conta2.depositar(10000.00);

        System.out.println(conta1.recuperaDadosParaImpressao());
        System.out.println(conta2.recuperaDadosParaImpressao());
        System.out.println("Imposto conta corrente: " + conta2.getValorImposto());
        System.out.println("Imposto Seguro: " + seguro.getValorImposto());


        //////////

        ContaCorrente conta21 = new ContaCorrente("Titular 01",201,1234,"30/01/2021");
        ContaCorrente conta22 = new ContaCorrente("Titular 02",202,1234,"27/01/2021");
        SeguroDeVida seguro11 = new SeguroDeVida(15000.00,"Titular 01",30001);
        SeguroDeVida seguro12 = new SeguroDeVida(50000.00,"Titular 02",30002);

        Tributavel[] produtos = new Tributavel[4];
        produtos[0] = conta21;
        produtos[1] = conta22;
        produtos[2] = seguro11;
        produtos[3] = seguro12;

        ManipuladorDeTributaveis manipulador = new ManipuladorDeTributaveis();
        manipulador.calculaImpostos(produtos);

        System.out.printf("Total de tributos: R$ %.2f", manipulador.getTotal());

    }

}
