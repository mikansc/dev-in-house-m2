package semana3.exercicio12;

import java.time.LocalDate;

public class FolhaPagamento {
    public static void main(String[] args) {

        FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Michael", "Nascimento", "29/01/1991", 2500.00);
        FuncionarioHorista horista = new FuncionarioHorista("Fulano", "Silva", "13/07/2000", 150, 30);
        FuncionarioComissionado comissionado = new FuncionarioComissionado("Beltrano", "Souza", "30/03/1998", 200000, 0.05);

        System.out.printf("Assalariado: %s | Salário: R$ %.2f.%n", assalariado, assalariado.calcularSalarioMensal());
        System.out.printf("Horista: %s | Salário: R$ %.2f.%n", horista, horista.calcularSalarioMensal());
        System.out.printf("Comissionado: %s | Salário: R$ %.2f.%n ", comissionado, comissionado.calcularSalarioMensal());

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = assalariado;
        funcionarios[1] = horista;
        funcionarios[2] = comissionado;

        double folhaTotal = 0;
        for (Funcionario funcionario : funcionarios) {
            if (isAniversario(funcionario)) {
                System.out.println("Funcionario" + funcionario);
                folhaTotal += funcionario.calcularSalarioMensal() + 100.00;
            } else {
                folhaTotal += funcionario.calcularSalarioMensal();
            }
        }

        System.out.printf("Folha total: R$ %.2f", folhaTotal);
    }

    public static boolean isAniversario(Funcionario funcionario) {
        return funcionario.getDataNascimento().getDayOfMonth() == LocalDate.now().getDayOfMonth();
    }
}
