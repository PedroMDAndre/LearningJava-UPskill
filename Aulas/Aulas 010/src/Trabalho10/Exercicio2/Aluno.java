package Trabalho10.Exercicio2;

/*
Exercício 2 - Ordenação de números racionais (Interface Comparator)

Crie uma classe Aluno e implemente dois comparadores diferentes para essa classe: um que compara
por número de aluno; outro que compara por nome do aluno. Experimente ordenar uma lista de
alunos usando primeiro um comparador.
*/

import java.util.Arrays;

public class Aluno {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[4];
        alunos[0] = new Aluno(123, "Jane");
        alunos[1] = new Aluno(423, "Albert");
        alunos[2] = new Aluno(200, "Ross");
        alunos[3] = new Aluno(159, "Jean");

        // Ordenar por nome
        System.out.println("Ordenar por nome");
        NomeCompare nomeCompare = new NomeCompare();
        Arrays.sort(alunos, nomeCompare);
        toLista(alunos);
        System.out.println();

        // Ordenar por número
        System.out.println("Ordenar por número");
        NumeroCompare numeroCompare = new NumeroCompare();
        Arrays.sort(alunos, numeroCompare);
        toLista(alunos);
    }

    // Attributes
    private int numero;
    private String nome;


    // Constructors
    public Aluno(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }


    // Methods
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static void toLista(Aluno[] alunos) {
        System.out.println("Lista de Alunos");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
