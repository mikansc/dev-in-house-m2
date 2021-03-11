package exercicio7;

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
        System.out.printf("%nSaldo atual após sacar R$150: %f", conta.verificaSaldo());

    }
}
