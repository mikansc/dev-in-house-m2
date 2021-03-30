package semana3.exercicio8;

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

    }

}
