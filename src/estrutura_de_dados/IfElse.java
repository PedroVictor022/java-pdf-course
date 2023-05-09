package estrutura_de_dados;

public class IfElse {
    static public void main(String[] args) {
//        < > <= => && || ==
        int idade = 15;
        boolean amigoDoDono = true;
        if(idade < 18 && !amigoDoDono) {
            System.out.println("Nao entra");
        }  else {
            System.out.println("Pode entrar");
        }
    }
}
