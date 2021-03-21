package semana1.exercicio10;

public class TestaFatura {
    public static void main(String[] args) {

        //Instancia a fatura
        Fatura fatura = new Fatura("FT0001",
                "Fatura de Michael Nascimento",
                20,
                22.90);


        // Testando propriedades
        System.out.printf("Get numero: %s. %n", fatura.getNumero());
        System.out.printf("Get descrição: %s. %n", fatura.getDescricao());
        System.out.printf("Get quantidade de itens: %d. %n", fatura.getItemQuantidade());
        System.out.printf("Get valor por item: %.2f. %n", fatura.getItemPreco());

        // Testando método getValorFatura inválido
        fatura.setItemPreco(0.00);
        System.out.printf("(Preço: R$ 0,00) Valor da fatura: R$ %.2f. %n", fatura.getValorFatura());
        fatura.setItemPreco(-1);
        System.out.printf("(Preço: R$ -1,00) Valor da fatura: R$ %.2f. %n", fatura.getValorFatura());

        fatura.setItemPreco(22.90);

        fatura.setItemQuantidade(0);
        System.out.printf("(Qtd: 0) Valor da fatura: R$ %.2f. %n", fatura.getValorFatura());
        System.out.printf("(Qtd: -1) Valor da fatura: R$ %.2f. %n", fatura.getValorFatura());

        fatura.setItemQuantidade(20);

        // Testando método getValorFatura de forma válida;
        System.out.printf("(Válida) Valor da fatura: R$ %.2f. %n", fatura.getValorFatura());

    }
}
