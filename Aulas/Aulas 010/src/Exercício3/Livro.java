package Exercício3;

import java.util.Arrays;
import java.util.Comparator;

/*
Criar a classe Livro que tem os seguintes atributos: Nome, Ano, Editora e Autor. Implementar as
interfaces relativas a comparadores de modo a ordenar o nome e o autor por ordem alfabética, a
editora por ordem contrária à ordem alfabética e o ano por ordem decrescente.

Livros:
    * The Shinning,1990, Leya, Stephen King
    * Harry Potter e a Pedra Filosofal, 2001, ASA, Joanne Rowling
    * O Inferno de Dante, 1472, Bertrand, Dante
    * Conde de Monte Cristo, 1844, Texto, Alexandre Dumas
    * Desenhar Bases de Dados, 2016, Silabo, Pedro Nogueira
 */
public class Livro {
    String nome;
    int ano;
    String editora;
    String autor;

    public static void main(String[] args) {
        Livro[] livros = new Livro[5];
        livros[0] = new Livro("The Shinning", 1990, "Leya", "Stephen King");
        livros[1] = new Livro("Harry Potter e a Pedra Filosofal", 2001, "ASA", "Joanne Rowling");
        livros[2] = new Livro("O Inferno de Dante", 1472, "Bertrand", "Dante");
        livros[3] = new Livro("Conde de Monte Cristo", 1844, "Texto", "Alexandre Dumas");
        livros[4] = new Livro("Desenhar Bases de Dados", 2016, "Silabo", "Pedro Nogueira");

        printLivros(livros);
        System.out.println();

        Arrays.sort(livros, new ComparadorNome());
        printLivros(livros);
        System.out.println();

        Arrays.sort(livros, new ComparadorAutor());
        printLivros(livros);

        //é possível utilizar o Comparator.comparing
        //que vai buscar a propriedade directamente
        //ao objecto (Livro::getAutor)
        //e invoca dinamicamente
        Arrays.sort(livros, Comparator.comparing(Livro::getAutor));
    }

    public static void printLivros(Livro[] livros) {
        System.out.println("Livros:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public Livro(String nome, int ano, String editora, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

class ComparadorNome implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class ComparadorAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
