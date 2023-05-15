package heranca;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected int senha;
    public double getBonificacao() {
        return this.salario * 0.10;
    }
}

