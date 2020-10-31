package Aula007_Classes;

public abstract class Jogador {
    // Attributes
    private String nome;
    private int numero;
    private int numeroGolos;

    // Constructor //Vai ter de ser uma classe abstracta...
    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.numeroGolos = 0;
    }

    // Methods


    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void marcarGolo() {
        numeroGolos += 1;
    }

    public int getNumeroGolos() {
        return numeroGolos;
    }

    public void setNumeroGolos(int numeroGolos) {
        this.numeroGolos = numeroGolos;
    }

    @Override
    public abstract String toString();
}
