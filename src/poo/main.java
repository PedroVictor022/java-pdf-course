package poo;

public class main {
    public static void main(String[] args) {
        Conta minhaConta, fulano;

        minhaConta = new Conta();
        fulano = new Conta();

        minhaConta.titular.nome = "Pedro Victor";
        minhaConta.titular.sobrenome = "Borges";
        minhaConta.titular.cpf = "000-000-000-00";

//        minhaConta.numero_conta = 123123;
//        minhaConta.saldo = 200;
//        minhaConta.transferePara(fulano, 50);
//        minhaConta.depositar(500);
//        minhaConta.sacar(50);
//        fulano.infoConta();

        minhaConta.sacar(-900000);

    }
}
