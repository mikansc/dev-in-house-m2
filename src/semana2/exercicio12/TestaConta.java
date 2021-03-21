package semana2.exercicio12;

public class TestaConta {

    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Michael",
                10001,
                1980,
                "21/03/2020");

        ContaCorrente conta2 = new ContaCorrente("Michael",
                10002,
                1980,
                "21/03/2020");

        System.out.println(conta1.getTipo());
        System.out.println(conta2.getTipo());

    }

}
