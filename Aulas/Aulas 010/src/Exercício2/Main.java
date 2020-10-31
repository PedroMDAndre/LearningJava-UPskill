package Exercício2;

import java.util.Arrays;

/*
Criar a classe Filme que vai ter os seguintes atributos: pontuação, nome e ano. A classe Filme vai
implementar a interface Comparable:
    1. Ordene os seguintes filmes por ordem crescente do seu ano e depois
    2. Ordene os filmes por ordem decrescente em relação à sua pontuação
 */

public class Main {
    public static void main(String[] args) {

        Filme[] filmes = new Filme[3];

        filmes[0] = new Filme("Return of the Jedi", 9.2, 1983);

        filmes[1] = new Filme("Star Wars: Empire Strikes Back", 7, 1980);

        filmes[2] = new Filme("Senhor dos Anéis", 9.5, 2001);

        Arrays.sort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

    }
}
