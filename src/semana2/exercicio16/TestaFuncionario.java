package semana2.exercicio16;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Michael", "Nascimento", "11122233344");
        System.out.println(func.toString());

        FuncionarioComissionado func2 = new FuncionarioComissionado("Michael", "Nascimento", "33322211100", 200000,0.05);

        System.out.println(func2.toString());
        System.out.printf("Ganhos: R$ %.2f%n", func2.ganhos());

        FuncionarioHorista func3 = new FuncionarioHorista("Michael","Nascimento","00033311123",80, 36.50);

        System.out.println(func3.toString());
        System.out.printf("Ganhos: R$ %.2f%n", func3.ganhos());
    }
}
