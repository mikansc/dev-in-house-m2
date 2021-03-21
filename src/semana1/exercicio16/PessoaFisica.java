package semana1.exercicio16;

public class PessoaFisica {
    String nome;
    String sobrenome;
    String CPF;
    String dataNascimento;

    // Colocar CPF no construtor da PessoaFisica obriga toda instância a ter o CPF.
    public PessoaFisica(String nome, String sobrenome, String CPF, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        // A princípio, para validar o CPF, optei por apenas verificar seu tamanho (11 dígitos)
        this.CPF = CPF.length() == 11 ? CPF : "00000000000";
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    // garantindo que o CPF tenha 11 dígitos
    public void setCPF(String CPF) {
        if(CPF.length() < 11) {
            this.CPF = "00000000000";
        }
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
