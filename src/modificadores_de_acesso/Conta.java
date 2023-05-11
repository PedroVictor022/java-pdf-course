package modificadores_de_acesso;

public class Conta {
    String titular;
    int numero;
    private double saldo;
    void saca(double valor) {
        if(valor > this.saldo) {
            System.out.println("Nao posso sacar um valor maior que o saldo");
        } else {
            this.saldo = this.saldo - valor;
        }
    }
    void getSaldo() {
        System.out.println(this.saldo);
    }
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
