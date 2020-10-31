package Exercicio1;

/*
Exercício 1
* Crie um tipo de objecto Contacto que guarda as seguintes informações:
    - Nome
    - Número de telefone
    - Email

* Crie uma classe de teste e na função main() crie uma lista (ArrayList) de Contactos. Exprimente a
inserção, remoção e obtenção de um contacto.


* Percorra toda a lista de contactos e imprima para o ecrã as seguintes informações:
    João Silva      - 9100000000 - joao.silva@gmail.com
    Pedro Fernantes - 9100000001 - pedro.fernandes@gmail.com
    Maria Rita      - 9100000002 - maria.ritinha@gmail.com
*/

import java.util.ArrayList;

public class Contacto {
    public static void main(String[] args) {

        // Criar lista de contactos
        System.out.println("Criar lista de contactos");
        ArrayList<Contacto> lista = new ArrayList<>();

        lista.add(new Contacto("João Silva",
                9100000000L,
                "joao.silva@gmail.com"));

        Contacto pedro = new Contacto("Pedro Fernantes",
                9100000001L,
                "pedro.fernandes@gmail.com");
        lista.add(pedro);

        lista.add(new Contacto("Maria Rita",
                9100000002L,
                "maria.ritinha@gmail.com"));

        Contacto joana = new Contacto("Joana",
                12345,
                "joana@naoexiste.pt");
        lista.add(joana);

        lista.add(pedro);
        lista.add(joana);
        lista.add(joana);
        lista.remove(joana);

        // Escrever a lista
        for (Contacto contacto : lista) {
            System.out.println(contacto);
        }

        // Remover Joana
        System.out.println("\nRemover as Joanas");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals("Joana")) {
                lista.remove(i);
                i--;
            }

        }

        // Escrever a lista
        for (Contacto contacto : lista) {
            System.out.println(contacto);
        }

    }


    // Attributes
    private String nome;
    private long numeroTelefone;
    private String email;


    // Constructors
    public Contacto(String nome, long numeroTelefone, String email) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }


    // Methods
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\t" +
                "Telefone: " + numeroTelefone +
                "\temail: " + email;
    }
}
