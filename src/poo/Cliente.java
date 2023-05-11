package poo;

public class Cliente {
     String nome;
     String sobrenome;
     String cpf;
     int idade;

    public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }
    public void validaCPF(String cpf) {
        if(cpf.length() < 2) {
            System.out.println("CPF INVALIDO");
        }
        System.out.println("CPF VALIDO");
    }
}
