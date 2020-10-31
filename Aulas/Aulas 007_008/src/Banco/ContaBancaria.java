package Banco;

import java.util.Scanner;

public abstract class ContaBancaria {
    // Attributes
    private String senha;
    private  String[] movimentos;


    // Constructor
    public ContaBancaria(String senha) {
        this.senha = senha;
        this.movimentos = new String[0];
    }


    // Methods
    public void alteraSenha(String novaSenha) {
        Scanner in = new Scanner(System.in);

        System.out.println("Confirme a nova senha: ");
        String senhaConfimacao = in.nextLine();

        if (novaSenha.equals(senhaConfimacao)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada!");
            adicionaMovimento("\t\t\t\t\tAlteração de senha.");
        } else {
            System.out.println("Não foi possível alterar a senha.\n" +
                    "Senha introduzida não corresponde à senha pretendida.");
            adicionaMovimento("\t\t\t\t\tNão foi possível alterar a senha.");
        }
    }

    public String[] getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(String[] movimentos) {
        this.movimentos = movimentos;
    }

    public abstract void levanta(double valor);

    public abstract void deposita(double valor);

    public abstract void tiraExtrato();

    public abstract void adicionaMovimento(String movimento);

}
