package poo;

public class main {
    public static void main(String[] args) {
        Conta minhaConta, fulano;
        minhaConta = new Conta();
        fulano = new Conta();

        minhaConta.numero_conta = 123123;
        minhaConta.titular = "Pedro Victor";
        minhaConta.saldo = 200;
        minhaConta.transferePara(fulano, 50);
        minhaConta.depositar(500);
        minhaConta.sacar(50);

        fulano.titular = "Fulano da Silva";

        fulano.infoConta();

    }
}
