package semana4.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private List<Conta> contas = new ArrayList<Conta>();

    public Agencia() {
    }

    void adiciona(Conta conta){
        this.contas.add(conta);
    }

    int getQuantidadeDeContas() {
        return contas.size();
    }

    Conta buscaPorTitular(String titular) {
        return contas.stream().filter(c -> c.nomeDoTitular.equals(titular)).findFirst().orElse(null);
    }
}
