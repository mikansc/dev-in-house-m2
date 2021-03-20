package exercicio12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class MaisSaude {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        FrequenciaCardiaca cliente = new FrequenciaCardiaca();

        System.out.println("%nApp Mais Saúde - By Michael Nascimento");
        System.out.println("-------------------------------------------------------");
        System.out.println("Seja bem vindo! Por favor, insira o seu primeiro nome:");
        cliente.setNome(sc.nextLine());
        System.out.println("Agora insira o seu sobrenome:");
        cliente.setSobrenome(sc.nextLine());
        System.out.printf("Olá, %s %s! Qual a sua data de nascimento (dd/mm/aaaa)?%n", cliente.getNome(), cliente.getSobrenome());
        cliente.setDataNascimento(sc.nextLine());

        System.out.printf("%s, estas são suas informações:%n", cliente.getNome());
        System.out.printf("Você tem %d anos. Sua frequência cardíaca máxima é %d e sua frequência ideal é %d%n",
                cliente.getIdade(),
                cliente.getFrequenciaMaxima(),
                cliente.getFrequenciaAlvo());
        System.out.println("-------------------------------------------------------");
    }
}
