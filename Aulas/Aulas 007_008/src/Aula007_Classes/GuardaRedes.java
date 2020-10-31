package Aula007_Classes;

public class GuardaRedes extends Jogador {
    // Attributes
    private int golosSofridos;

    // Constructor
    public GuardaRedes(String nome, int numero) {
        super(nome, numero);
        golosSofridos = 0;
    }

    // Methods


    public int getGolosSofridos() {
        return golosSofridos;
    }

    public void sofrerGolo() {
        golosSofridos += 1;
    }

    public void sofrerGolo(int n) {
        golosSofridos += n;
    }

    @Override
    public String toString() {
        String descricao = "Guarda-Redes\n Nome: " + getNome() + " | Número: " + getNumero()
                + "\n Golos Marcados: " + getNumeroGolos() + " | Golos Sofridos: " + getGolosSofridos();

        return descricao;
    }
}
