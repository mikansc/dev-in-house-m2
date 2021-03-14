package exercicio9;

public class TestaData {
    public static void main(String[] args) {

        Data data = new Data(03, 14, 2021);

        // Mostrar dia
        System.out.printf("Dia cadastrado: %d%n", data.getDia());
        // Mostrar mês
        System.out.printf("Mês cadastrado: %d%n", data.getMes());
        // Mostrar ano
        System.out.printf("Ano cadastrado: %d%n", data.getAno());
        // Método de mostrar data
        System.out.println(data.exibirData());

        // Mudar data
        data.setDia(01);
        data.setMes(07);
        data.setAno(2021);

        // Exibir nova data
        System.out.printf("Vou procurar emprego até %s. ", data.exibirData());
        System.out.println("Depois disso, vou trabalhar como freela.");

    }
}
