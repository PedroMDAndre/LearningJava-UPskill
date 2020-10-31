package Trabalho11.Exercicio7;

public class Aluno implements Comparable<Aluno> {
    // Attributes
    private String nome;


    // Constructors
    public Aluno(String nome) {
        this.nome = nome;
    }


    // Methods
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
    }
}
