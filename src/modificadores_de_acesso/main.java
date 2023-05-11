package modificadores_de_acesso;

public class main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.numero = 0;
        c1.titular = "Pedro";
        c1.setSaldo(9000);
        c1.getSaldo();
        c1.saca(12);
        c1.getSaldo();
    }
}
