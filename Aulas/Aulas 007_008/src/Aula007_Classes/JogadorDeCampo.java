package Aula007_Classes;

public class JogadorDeCampo extends Jogador {
    // Attributes
    int passesFeitos;
    int passesRecebidos;


    // Constructor
    public JogadorDeCampo(String nome, int numero) {
        super(nome, numero);
        this.passesFeitos = 0;
        this.passesRecebidos = 0;

    }

    // Methods
    public int getPassesFeitos() {
        return passesFeitos;
    }

    public int getPassesRecebidos() {
        return passesRecebidos;
    }

    public void receberPasse(){
        passesRecebidos += 1;
    }

    public void fazerPasse(){
        passesFeitos += 1;
    }

    public void receberPasse(int n){
        passesRecebidos += n;
    }

    public void fazerPasse(int n){
        passesFeitos += n;
    }

    @Override
    public String toString() {
        String descricao = "Jogador de Campo\n Nome: " + getNome() + " | Número: " + getNumero()
                + "\n Golos Marcados: " + getNumeroGolos()
                + " | Passes feitos: " + getPassesFeitos() + " | Passes recebidos: " + getPassesRecebidos();
        return descricao;
    }

}
