package estrutura_de_dados.exercicios;

public class ex4 {
    static public void main(String[] args) {
        long n = 20;
        int fatorial = 1;
        for(long i = n; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
