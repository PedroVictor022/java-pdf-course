package poo;

public class main {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.numero_conta = 123123;
        minhaConta.titular = "Pedro Victor";
        minhaConta.saldo = 200;

        minhaConta.depositar(500);

        minhaConta.sacar(50);
    }
}
