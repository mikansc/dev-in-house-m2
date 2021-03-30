package semana3.exercicio12;

public class FolhaPagamento {
    public static void main(String[] args) {

        FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Michael", "Nascimento", 2800.00);
        FuncionarioHorista horista = new FuncionarioHorista("Fulano", "Silva", 168, 36);
        FuncionarioComissionado comissionado = new FuncionarioComissionado("Beltrano", "Souza", 200000, 0.05);

        System.out.printf("Assalariado: %s | Salário: R$ %.2f.%n", assalariado, assalariado.calcularSalarioMensal());
        System.out.printf("Horista: %s | Salário: R$ %.2f.%n", horista, horista.calcularSalarioMensal());
        System.out.printf("Comissionado: %s | Salário: R$ %.2f.%n ", comissionado, comissionado.calcularSalarioMensal());

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = assalariado;
        funcionarios[1] = horista;
        funcionarios[2] = comissionado;

        double folhaTotal = 0;
        for (Funcionario funcionario: funcionarios)
            folhaTotal += funcionario.calcularSalarioMensal();

        System.out.printf("Folha total: R$ %.2f", folhaTotal);
    }
}
