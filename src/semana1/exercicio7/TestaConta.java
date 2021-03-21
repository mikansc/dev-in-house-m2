package semana1.exercicio7;

public class TestaConta {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Michael Nascimento",
                0001,
                0001,
                "11/03/2021");

        //Testa o nome do titular e dados da conta
        System.out.printf("Olá, %s! Sua conta %d na agencia %d foi aberta em %s.",
                conta.nomeDoTitular,
                conta.numero,
                conta.agencia,
                conta.abertaEm
        );

        // Testa saldo inicial
        System.out.printf("%nSaldo inicial da conta: %f", conta.verificaSaldo());

        // Adiciona fundos
        conta.depositar(200);
        System.out.printf("%nSaldo atual após depositar R$200: %f", conta.verificaSaldo());

        // Remove fundos
        conta.sacar(150);
        System.out.printf("%nSaldo atual após sacar R$150: %f%n", conta.verificaSaldo());

        // Ex.8 - Testa método recuperaDadosParaImpressao();
        System.out.println(conta.recuperaDadosParaImpressao());

        // Ex.15 - Testa se a classe está incrementando o valor de ContaBancaria.identificador
        System.out.println("Identificador conta: " + conta.getIdentificador());

        ContaBancaria conta2 = new ContaBancaria("Fulano Silva", 0002, 0001, "20/03/2021");
        System.out.println("Identificador conta2: " + conta2.getIdentificador());

        ContaBancaria conta3 = new ContaBancaria("Cicrano Souza", 0003, 0001, "20/03/2021");
        System.out.println("Identificador conta3: " + conta3.getIdentificador());

        ContaBancaria conta4 = new ContaBancaria("Beltrano Santos", 0004, 0001, "20/03/2021");
        System.out.println("Identificador conta4: " + conta4.getIdentificador());

    }
}
