package Trabalho10.Exercicio1;

import java.util.Arrays;
import java.util.Comparator;

/*
Exercício 1 - Ordenação de números racionais (Interface Comparable)

Implemente a interface Comparable (completando adequadamente o método compareTo) para a
classe Rational (que representa números racionais), tal como definida abaixo. Não se esqueça que
só pode comparar o numerador de duas frações depois de terem o mesmo denominador. A
igualdade deve estar definida de modo coerente com a comparação. Defina também a igualdade
(método equals) para números racionais. Depois de completar este exercício altere o main para criar
um vector de racionais e use o método Arrays.sort() para ordenar essa vector.
*/

public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        Rational[] rationals = new Rational[3];
        rationals[0] = new Rational(1, 2);
        rationals[1] = new Rational(1, 3);
        rationals[2] = new Rational(2, 3);

        System.out.println("Ordem crescente");
        Arrays.sort(rationals);
        printLista(rationals);

        System.out.println("\nOrdem decrescente");
        Arrays.sort(rationals, Comparator.reverseOrder()); // Para ordem contrária à definida no compareTo
        printLista(rationals);

        long time = System.currentTimeMillis();
        Rational[] rationalsRan = new Rational[1000000];
        for (int i = 0; i < rationalsRan.length; i++) {
            int num = ((int) (Math.random() * 10000));
            Math.random();
            int den = ((int) (Math.random() * 100000 + 1));
            rationalsRan[i] = new Rational(num, den);
        }
        Arrays.sort(rationalsRan);
        printLista(rationalsRan);
        System.out.println("Tempo de execução " + (System.currentTimeMillis() - time));
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    @Override
    public int compareTo(Rational o) {
        // trazer o denominador para a mesma base e comparar o denominador resultado
        // A/B e C/D --> (A*D)/(B*D) e (C*B)/(D*B), então comparar A*D com C*B
        if (this.numerator * o.denominator > o.numerator * this.denominator) {
            return 1;
        } else if (this.numerator * o.denominator < o.numerator * this.denominator) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void printLista(Rational[] rationals) {
        for (Rational rational : rationals) {
            System.out.println(rational);
        }
    }
}
