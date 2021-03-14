package exercicio11;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Michael", "Nascimento", 4400.00);
        Funcionario funcionario2 = new Funcionario("Fulano", "da Silva", 2000.00);

        Funcionario comSalarioInvalido = new Funcionario("Qualquer", "Sobrenome", -1);

        // Testa construtor com regra de salário
        System.out.printf("Funcionário %s %s instanciado com salário R$ %.2f.%n%n",
                comSalarioInvalido.getNome(),
                comSalarioInvalido.getSobrenome(),
                comSalarioInvalido.getSalarioMes());
        //

        System.out.printf("Salário anual do %s %s: R$ %.2f.%n",
                funcionario1.getNome(),
                funcionario1.getSobrenome(),
                funcionario1.getSalarioMes() * 12);

        System.out.printf("Salário anual do %s %s: R$ %.2f.%n",
                funcionario2.getNome(),
                funcionario2.getSobrenome(),
                funcionario2.getSalarioMes() * 12);

        // aumento de 10% no salário dos funcionários
        funcionario1.setSalarioMes(funcionario1.getSalarioMes() * 1.10);
        funcionario2.setSalarioMes(funcionario2.getSalarioMes() * 1.10);

        System.out.printf("Novo salário anual do %s %s: R$ %.2f.%n",
                funcionario1.getNome(),
                funcionario1.getSobrenome(),
                funcionario1.getSalarioMes() * 12);

        System.out.printf("Novo salário anual do %s %s: R$ %.2f.%n",
                funcionario2.getNome(),
                funcionario2.getSobrenome(),
                funcionario2.getSalarioMes() * 12);

    }
}
