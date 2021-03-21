package semana1.exercicio13;

import java.util.Scanner;

public class MaisSaudePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Resolvi fazer esse programa sem instanciar um PerfilDeSaude previamente para fins didáticos

        System.out.println("App Mais Saúde Plus - By Michael Nascimento");
        System.out.println("-------------------------------------------------------");

        System.out.println("Seja bem vindo(a)! Por favor, insira o seu primeiro nome:");
        String nome = sc.nextLine();

        System.out.println("Agora insira o seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.printf("Olá, %s %s! Qual a sua data de nascimento (dd/mm/aaaa)?%n", nome, sobrenome);
        String dataNascimento = sc.nextLine();

        System.out.println("Informe o seu sexo (masculino|feminino):");
        String sexo = sc.nextLine();

        System.out.printf("Qual é seu peso (kg), %s?%n", nome);
        double peso = sc.nextDouble();

        System.out.printf("E qual é sua altura (m), %s?%n", nome);
        double altura = sc.nextDouble();


        PerfilDeSaude cliente = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

        System.out.println("-------------------------------------------------------");
        System.out.println("Ficha de Saúde:");
        System.out.printf("Nome completo: %s %s.%n", cliente.getNome(), cliente.getSobrenome());
        System.out.printf("Data de nascimento: %s.%n", cliente.getDataNascimento());
        System.out.printf("Idade: %d anos.%n", cliente.getIdade());
        System.out.printf("Sexo: %s.%n", cliente.getSexo());
        System.out.printf("Peso: %.2f.%n", cliente.getPeso());
        System.out.printf("Altura: %.2f.%n", cliente.getAltura());
        System.out.printf("IMC: %.1f.%n", cliente.getIMC());
        System.out.printf("Frequência cardíaca máxima: %d.%n", cliente.getFrequenciaMaxima());
        System.out.printf("Faixa de frequência cardíaca ideal: %s.%n", cliente.getFaixaFrequenciaAlvo());
        System.out.println("-------------------------------------------------------");
        sc.close();

    }
}

