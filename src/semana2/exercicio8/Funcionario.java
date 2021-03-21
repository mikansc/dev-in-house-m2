package semana2.exercicio8;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String cpf;
    protected double salario;

    public Funcionario(String nome, String sobrenome, String cpf, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf.length() == 11 ? cpf : "00000000000";
        this.salario = salario > 0 ? salario : 0.00;
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

    public String getCpf() {
        return cpf;
    }
    // validação de CPF simples (número de dígitos);
    public void setCpf(String cpf) {
        if(cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            this.cpf = "00000000000";
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0) {
            this.salario = salario;
        }
    }

    public double calculaBonificacao () {
        return this.salario * (10.00 / 100);
    }
}
