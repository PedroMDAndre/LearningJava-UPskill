package Trabalho12;

import java.util.*;

/*
    Exercício 4
    Defina um enumerado Suit para representar os quatro naipes das cartas de jogar (espadas, paus, copas, e ouros).

    a. Defina um enumerado Rank para representar os treze valores possíveis para
    uma carta de jogar (Às, 7 (Manilha), Rei, Valete, Dama, 10, 9, 8, 6, 5, 4, 3, 2),
    assumindo que estas vão ser utilizadas para o jogo da Sueca (embora as cartas
    10, 9, e 8 não sejam utilizadas). Desta forma, as cartas têm uma ordem de
    valor, pelo que a ordem pela qual as constantes do enumerado são definidas
    poderá ser relevante (para determinar qual o valor mais alto entre duas cartas).
    Inclua informação relativa aos pontos que cada carta vale no jogo da Sueca
    (Ás=11, Manilha=10, Rei=4, Valete=3, Dama=2, outras=0).

    b.  Defina uma função de teste que dado uma lista de Rank devolve o somatório de pontos.

    c. Utilizando as exceções que conhece, complete o exercício anterior.

 */
public class Exercicio4 {
    public enum Rank {
        AS(11), MANILHA(10), REI(4), VALETE(3), DAMA(2), DEZ(0), NOVE(0),
        OITO(0), SEIS(0), CINCO(0), QUATRO(0), TRES(0), DOIS(0);

        // Attributes
        private int valor;

        // Constructors
        private Rank(int valor) {
            this.valor = valor;
        }

        // Methods
        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        System.out.println("Calcula o resultado das cartas num jogo de Sueca\n");
        Scanner scanner = new Scanner(System.in);

        List<Rank> cartasPossiveis = new ArrayList<Rank>(EnumSet.allOf(Rank.class));

        ArrayList<Rank> cartasIntroduzidas = new ArrayList<>();
        String input;

        // Mostra as opções
        System.out.println(cartasPossiveis);
        System.out.println("EXIT para terminar.");

        // Ciclo de introdução de cartas
        while (true) {
            System.out.print("Introduza a carta: ");
            input = scanner.nextLine().toUpperCase();

            // Executa até ser introduzido "EXIT"
            if (!input.equals("EXIT")) {
                try {
                    cartasIntroduzidas.add(Rank.valueOf(input));
                } catch (IllegalArgumentException e) {
                    System.out.println("O valor introduzido não é uma opção.");
                }
            } else {
                // Introduzindo a opção EXIT devolve o resultado
                System.out.println("Cartas introduzidas: " + cartasIntroduzidas);
                System.out.println("Valor total: " + somaRank(cartasIntroduzidas));
                break;
            }

        }
    }

    public static void teste() {
        // função de teste
        ArrayList<Rank> listaTeste = new ArrayList<>();
        listaTeste.add(Rank.AS);
        listaTeste.add(Rank.REI);

        Rank[] lista = {Rank.AS, Rank.AS, Rank.DOIS, Rank.REI, Rank.REI};

        System.out.println(somaRank(listaTeste));
    }

    // Recebe uma lista de resultados e soma os resultados
    private static int somaRank(Rank[] listaRank) {
        int soma = 0;
        for (Rank rank : listaRank) {
            soma += rank.getValor();
        }
        return soma;
    }

    private static int somaRank(ArrayList<Rank> listaRank) {
        int soma = 0;
        for (Rank rank : listaRank) {
            soma += rank.getValor();
        }
        return soma;
    }
}
