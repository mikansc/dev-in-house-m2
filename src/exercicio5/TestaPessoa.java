package exercicio5;

public class TestaPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Fulano";
        p1.idade = 5;

        System.out.printf("Idade atual do(a) %s: %d%n", p1.nome, p1.idade);

        p1.fazAniversario();
        System.out.printf("Idade da pessoa após aniversário: %d%n", p1.idade);

    }
}
