package poo;

class Conta {
    int numero_conta;
    String titular;
    double saldo;

//    void informa que nenhuma informacao sera enviada a quem chamou este metodo;
    void sacar(double quantidade) {
        double novoSaldo = this.saldo -= quantidade;
        if(quantidade > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            System.out.println("Transacao realizada com sucesso!");
            System.out.println("NOVO SALDO: R$" + novoSaldo);
            System.out.println("---------------------------");
        }
    }

    void depositar(double quantidade) {
        double novoSaldo = this.saldo += quantidade;
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("NOVO SALDO DE : R$" + novoSaldo);
    }

}
