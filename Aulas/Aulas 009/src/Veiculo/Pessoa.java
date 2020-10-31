package Veiculo;

import java.time.Period;

public class Pessoa {
    // Attributes
    private String nome;
    private boolean carta;      // por defeito "false"
    private boolean forcaAerea; // por defeito "false"


    // Constructors
    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println(this.toString());
    }

    public Pessoa(String nome, boolean carta, boolean forcaAerea) {
        this.nome = nome;
        this.carta = carta;
        this.forcaAerea = forcaAerea;
        System.out.println(this.toString());
    }


    // Methods
    public String getNome() {
        return nome;
    }

    public void setCarta(boolean carta) {
        this.carta = carta;
    }

    public void setForcaAerea(boolean forcaAerea) {
        this.forcaAerea = forcaAerea;
    }

    public boolean hasCarta() {                         // Verifica se tem carta
        return carta;
    }

    public boolean isForcaAerea() {                     // Verifica se pertence à força aérea
        return forcaAerea;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", \tcarta=" + carta +
                ", \tforcaAerea=" + forcaAerea +
                '}';
    }

    // Static methods
    public static int nrForcaAerea(Pessoa[] pessoas) {
        int count = 0;
        for (Pessoa x : pessoas) {
            if (x != null) {
                if (x.isForcaAerea()) {
                    count++;
                }
            }
        }
        return count;
    }

    public static Pessoa[] listaPessoasForcaAerea(Pessoa[] pessoas) {
        Pessoa[] forcaAerea = new Pessoa[nrForcaAerea(pessoas)];

        int j = 0; // posição no vector resultado "forcaAerea"
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                if (pessoas[i].isForcaAerea()) {
                    forcaAerea[j] = pessoas[i];
                    j++;
                }
            }
        }
        return forcaAerea;
    }

    public static int nrPessoasCarta(Pessoa[] pessoas) {
        int count = 0;
        for (Pessoa x : pessoas) {
            if (x != null) {
                if (x.hasCarta()) {
                    count++;
                }
            }
        }
        return count;
    }

    public static Pessoa[] listaPessoasCarta(Pessoa[] pessoas) {
        Pessoa[] pessoasCarta = new Pessoa[nrPessoasCarta(pessoas)];

        int j = 0; // posição no vector resultado "pessoasCarta"
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                if (pessoas[i].hasCarta()) {
                    pessoasCarta[j] = pessoas[i];
                    j++;
                }
            }
        }
        return pessoasCarta;
    }

    public static void printListaPessoas(Pessoa[] pessoas) {
        for (Pessoa x : pessoas) {
            System.out.println(x);
        }
    }

}
