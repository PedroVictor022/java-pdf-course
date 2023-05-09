package estrutura_de_dados;
public class main {
     static public void main(String[] args) {
        int quatro = 2 + 2; // SOMA
        int tres = 5 - 2; // SUBTRACAO
        int oito = 4 * 2; // MULTIPLICACAO
        int doze = 24 / 2; // DIVISAO
        int resto = 10 % 3; // Pega o resto de uma divisão
        double pi = 3.14; // PI
        double x = 5 * 10; // FLOAT

//        TIPOS PRIMITIVOS E VALORES
        int i = 5;
        int j = i;
        int k = i + 1;
        System.out.println("TIPOS PRIMITIVOS E VALORES");
        System.out.println(j);
        System.out.println(k);

        System.out.print("-----------");
        System.out.println("Exercicio 1");
        int jan = 15000;
        int fev = 23000;
        int mar = 17000;
        int total = jan + fev + mar;
        System.out.println("Foi gasto um total de: " + total);
//        CASTING
        System.out.println("CASTING E PROMOCAO");
        double d1 = 3.12;
        int s = (int) d1;
        long gg = 2000;
        int b = (int) gg;
        System.out.println(s);
        System.out.println(b);
    }
}
