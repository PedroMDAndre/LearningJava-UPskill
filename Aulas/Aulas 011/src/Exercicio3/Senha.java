package Exercicio3;
/*
Exercício 3
* Pretende-se representar um gestor de senhas numa repartição de Finanças.
* Crie um objecto do tipo Senha que guarda as seguintes informações:
    - Nº de Senha
    - Nome de utilizador
    - NIF

* Crie uma classe de teste e na função main() crie uma fila prioritária (PriorityQueue), adicione várias
senhas. Implemente o comparador na classe senha, de modo às senhas serem ordenadas pelo
número de senha. Confirme que a fila prioritária devolve as senhas pela ordem correcta
( Dica: utilize os métodos peek() e pool() )
* */

import java.util.PriorityQueue;

public class Senha implements Comparable<Senha> {
    public static void main(String[] args) {
        // Cria senhas
        PriorityQueue<Senha> senhas = new PriorityQueue<>();
        senhas.add(new Senha(1, "José", 123897213));
        senhas.add(new Senha(3, "Manuel", 343897212));
        senhas.add(new Senha(2, "Maria", 123897211));
        senhas.add(new Senha(4, "Joana", 123897210));
        senhas.add(new Senha(0, "Albertina", 3));

        // Peek
        System.out.println("Peek:\n" + senhas.peek());

        // Poll de todas as senhas
        System.out.println("\nChamada de senhas:");
        while (senhas.size() != 0) {
            Senha senha = senhas.poll();
            System.out.println(senha);
        }
        // Ver lista após operações
        System.out.println("\nApós operações pool: ");
        System.out.println(senhas);

    }


    // Attributes
    private int nrSenha;
    private String nome;
    private int NIF;


    // Constructors
    public Senha(int nrSenha, String nome, int NIF) {
        this.nrSenha = nrSenha;
        this.nome = nome;
        this.NIF = NIF;
    }


    // Methods
    public int getNrSenha() {
        return nrSenha;
    }

    public void setNrSenha(int nrSenha) {
        this.nrSenha = nrSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNif(int NIF) {
        this.NIF = NIF;
    }

    @Override
    public int compareTo(Senha o) {
        return nrSenha - o.getNrSenha();
    }

    @Override
    public String toString() {
        String resultado = String.format("Senha: %d\tNome: %-10s\tNIF: %d", nrSenha, nome, NIF);
        return resultado;
    }
}
