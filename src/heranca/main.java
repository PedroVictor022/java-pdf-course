package heranca;

public class main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();

        f1.nome = "Gustavo";
        f1.salario = 3000;
        f1.senha = 1234;
        System.out.println(f1.getBonificacao());

        g1.nome = "Pedro";
        g1.salario = 8000;
        System.out.println(g1.getBonificacao());

    }
}
