package heranca;

public class Gerente extends Funcionario {
    private int senha;
    private int nDeFuncionariosGerenciados;

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }
}
