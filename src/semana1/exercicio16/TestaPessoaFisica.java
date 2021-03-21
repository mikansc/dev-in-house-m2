package semana1.exercicio16;

public class TestaPessoaFisica {
    public static void main(String[] args) {

        PessoaFisica pessoa1 = new PessoaFisica("Michael", "Nascimento", "38972834840", "29/01/1991");

        System.out.printf("Dados da pessoa 1: %s %s, CPF: %s, data de nascimento %s.%n",
                pessoa1.getNome(),
                pessoa1.getSobrenome(),
                pessoa1.getCPF(),
                pessoa1.getDataNascimento()
                );

    }
}
