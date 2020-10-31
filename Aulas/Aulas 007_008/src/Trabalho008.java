import Banco.ContaCorrente;
import Banco.ContaPoupanca;
import Calculator.ScientificCalculator;
import Chess.*;
import Forma.*;


public class Trabalho008 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    public static void exercise1() {
        System.out.println("------------------------");
        System.out.println("Exercise 1 - Chess Moves");
        System.out.println("------------------------");
        Pawn pawn1 = new Pawn(1, 2, true);
        System.out.println(pawn1);
        printChessMoves(pawn1.possibleMoves());

        Pawn pawn2 = new Pawn(1, 6, false);
        System.out.println("\n" + pawn2);
        printChessMoves(pawn2.possibleMoves());

        Knight knight1 = new Knight(3, 7, true);
        System.out.println("\n" + knight1);
        printChessMoves(knight1.possibleMoves());

        // Using positions in chess notation
        Knight knight2 = new Knight(4, 3, false);
        System.out.println("\n" + knight1.toStringChessNotation());
        printChessMovesNotation(knight2.possibleMoves());
        System.out.println("------------------------");
    }

    public static void exercise2() {
        System.out.println("-----------------------------");
        System.out.println("Exercise 2 - Contas Bancárias");
        System.out.println("-----------------------------");

        // Criar contas
        ContaCorrente contaCorrente = new ContaCorrente("asdv01", 125412, 2000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("rtyu12", 124589, 5000, 0.015);
        System.out.println("-----------------------------");

        // Operações conta corrente
        System.out.println("########################");
        System.out.println("Operações conta corrente");
        System.out.println("########################");
        contaCorrente.levanta(3000);
        contaCorrente.levanta(150);
        contaCorrente.deposita(100);
        contaCorrente.alteraSenha("bb");
        System.out.println();
        // Operações conta poupança
        System.out.println("########################");
        System.out.println("Operações conta poupança");
        System.out.println("########################");
        contaPoupanca.levanta(2000);
        contaPoupanca.levanta(140);
        contaPoupanca.deposita(1000);
        contaPoupanca.alteraSenha("bb");
        System.out.println();

        // Extractos
        System.out.println("########################");
        System.out.println("       Extractos        ");
        System.out.println("########################");
        contaCorrente.tiraExtrato();
        System.out.println("-----------------------------");
        contaPoupanca.tiraExtrato();

        System.out.println("-----------------------------");
    }

    public static void exercise3() {
        System.out.println("------------------------");
        System.out.println("Exercise 3 - Calculadora");
        System.out.println("------------------------");

        // Criar calculadora científica
        ScientificCalculator calc = new ScientificCalculator();
        double a = 3;
        double b = 9;

        double soma = calc.sum(a, b);
        double subtracao = calc.subtract(a, b);
        double divisao1 = calc.divide(a, b);
        double multiplicacao = calc.multiply(a, b);
        double raizQuadrada = calc.raizQuadrada(b);
        double potencia = calc.potencia(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + soma);
        System.out.println("a - b = " + subtracao);
        System.out.println("a / b = " + divisao1);
        double divisao2 = calc.divide(a, 0);
        System.out.println("a / 0 = " + divisao2);
        System.out.println("a x b = " + multiplicacao);
        System.out.println("b^(1/2) = " + raizQuadrada);
        System.out.println("a ^ b = " + potencia);
        System.out.println("------------------------");
    }

    public static void exercise4() {
        System.out.println("-------------------");
        System.out.println("Exercise 4 - Formas");
        System.out.println("-------------------");
        /*f. Elabore um programa de teste onde é declarado um array, de dimensão 5, do
        tipo Forma . Nesse array, devem ser guardadas instâncias de Rectangulo ,
        Circulo e Quadrado .
        g. Depois, implemente um ciclo que percorra o array evocando, relativamente a
        cada um dos objectos guardados, os métodos calcularArea e calcularPerimetro
        e imprima a informação para o ecrâ.*/

        Forma[] formas = new Forma[5];
        formas[0] = new Circulo(2.5F);
        formas[1] = new Rectangulo(2.5F,3.0F);
        formas[2] = new Quadrado(3.0F);
        formas[3] = new Circulo(3.0F);
        formas[4] = new Rectangulo(2.5F,3.5F);;

        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.println();
        }
        System.out.println("-------------------");
    }

    // Chess - auxiliary functions
    public static void printChessMoves(Position[] moves) {
        System.out.println("List of possible moves:\n(x, y)");
        for (Position i : moves) {
            System.out.println(i);
        }
    }

    public static void printChessMovesNotation(Position[] moves) {
        System.out.println("List of possible moves:");
        for (Position i : moves) {
            System.out.println(columnToChessNotation(i.getX()) + " " + i.getY());
        }
    }

    public static char columnToChessNotation(int x) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        return abc[x];

    }
}
