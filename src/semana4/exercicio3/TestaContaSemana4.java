package semana4.exercicio3;

import semana4.exercicio3.interfaces.Tributavel;

public class TestaContaSemana4 {

    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Michael",10001,1980, "21/03/2020");
        ContaPoupanca conta2 = new ContaPoupanca("Aline",10002,1980, "21/03/2020");
        ContaCorrente conta3 = new ContaCorrente("Michael",10002,1234, "21/03/2020");
        ContaCorrente conta4 = new ContaCorrente("Titular 01",201,1234,"30/01/2021");
        ContaCorrente conta5 = new ContaCorrente("Titular 02",202,1234,"27/01/2021");

        //////////

        Agencia agencia1 = new Agencia();

        agencia1.adiciona(conta1);
        agencia1.adiciona(conta2);
        agencia1.adiciona(conta3);
        agencia1.adiciona(conta4);
        agencia1.adiciona(conta5);

        System.out.println(agencia1.getQuantidadeDeContas());
        System.out.println(agencia1.buscaPorTitular("Aline"));



    }

}
