package poo;

class Conta {
    int numero_conta;
    String titular;
    double saldo;

//    void informa que nenhuma informacao sera enviada a quem chamou este metodo;

    void infoConta() {
        System.out.println("Nome: " +this.titular + "\n" + "Saldo: " + this.saldo);
    }
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

    boolean depositar(double quantidade) {
        if(quantidade < 0){
            System.out.println("Este valor nao e aceito");
            return false;
        } else {
            double novoSaldo = this.saldo += quantidade;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("NOVO SALDO DE : R$" + novoSaldo);
            return true;
        }
    }

    boolean transferePara(Conta destino, double quantidade) {
        if(quantidade > this.saldo) {
            System.out.println("Nao foi possivel transferir, saldo insuficiente!");
            return false;
        } else {
            double valor = this.saldo - quantidade;
            destino.saldo = destino.saldo + quantidade;
            System.out.println("Transacao realizada com sucesso!");
            return true;
        }

    }

}

