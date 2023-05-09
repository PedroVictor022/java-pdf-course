package estrutura_de_dados.exercicios;

public class ex5 {
    static public void main(String[] args) {
        int x = 6;
        for(int i = 1;i <= x;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
