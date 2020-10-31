package Exercício2;

public class Filme implements Comparable<Filme> {
    String nome;
    double score;
    int ano;

    public Filme(String nome, double score, int ano) {
        this.nome = nome;
        this.score = score;
        this.ano = ano;
    }

    @Override
    public int compareTo(Filme outro) {
        return this.nome.compareTo(outro.nome);
    }
    /*    public int compareTo(Filme outro) {
        if (outro.score > this.score) {
            return 1;
        } else if (outro.score < this.score) {
            return -1;
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return this.nome + "\t - Score IMDB: " + score + " - Ano: " + ano;
    }
}
