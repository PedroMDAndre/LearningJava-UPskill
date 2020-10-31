package Trabalho10.Exercicio3;

/*
Exercício 3 - Ordenação de contactos
Desenvolva uma classe que permita representar uma pessoa, de acordo com as seguintes indicações:
    - A classe deve denominar-se Contacto;
    - Deve incluir apenas um construtor, onde são passados o nome e o telefone da pessoa em questão;
    - Deve disponibilizar, através de dois inspectores, a consulta do nome e telefone.
    - Deve disponibilizar dois modificadores:
        * public void modificaTelefone(final int telefone), que muda o telefone da pessoa;
        * public void modificaNome(final String nome), que modifica o nome da pessoa.
    - Deve redefinir o método equals e implementar o interface Comparable, sendo comparação por
    ordem alfabética de nome;
    - Inclua a possibilidade de pessoas com o mesmo nome serem ordenadas pelo número de telefone.
*/

import java.util.Arrays;

public class Contacto implements Comparable<Contacto> {
    public static void main(String[] args) {
        Contacto[] contactos = new Contacto[5];
        contactos[0] = new Contacto("Teresa", 911226873);
        contactos[1] = new Contacto("Alberto", 931546873);
        contactos[2] = new Contacto("Alberta", 931546845);
        contactos[3] = new Contacto("Alberta", 911546845);
        contactos[4] = new Contacto("Alberto", 931546873);

        printList(contactos);

        System.out.println("\nOs contactos 2 e 3 são o mesmo? " + contactos[2].equals(contactos[3]));
        System.out.println("Os contactos 1 e 4 são o mesmo? " + contactos[1].equals(contactos[4]) + "\n");

        // Contactos ordenados por nome e número
        Arrays.sort(contactos);
        System.out.println("Contactos ordenados:");
        printList(contactos);


    }

    // Attributes
    private String nome;
    private int telefone;


    // Constructors
    public Contacto(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }


    // Methods
    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\tTelefone: " + getTelefone();
    }

    public boolean equals(Contacto contacto) {
        if (this.nome.equals(contacto.getNome()) && this.telefone == contacto.getTelefone()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Contacto o) {
        if (this.nome.equals(o.getNome())) {
            if (this.telefone > o.getTelefone()) {
                return 1;
            } else if (this.telefone < o.getTelefone()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return nome.compareTo(o.getNome());
        }

    }

    public static void printList(Contacto[] contactos) {
        System.out.println("Contactos:");
        int i = 0;
        for (Contacto contacto : contactos) {
            System.out.println(i + "\t" + contacto);
            i++;
        }
    }
}
