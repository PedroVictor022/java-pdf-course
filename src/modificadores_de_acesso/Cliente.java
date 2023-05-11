package modificadores_de_acesso;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    private void validaCPF(String cpf) {
        if(cpf.length() < 2) {
            System.out.println("CPF INVALIDO");
        }
    }

    public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

}
