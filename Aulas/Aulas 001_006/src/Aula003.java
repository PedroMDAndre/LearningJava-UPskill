import java.util.Scanner;

public class Aula003 {
    public static void main(String[] args) {

        getTemperature(7);
        getTemperature(28);
        getTemperature(51);
        getTemperature(90);
        getTemperature(-17);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Como te chamas?");
        String name = keyboard.nextLine();
        System.out.println("Prazer em conhecer-te " + name + "!");

        System.out.println("Que idade tens?");
        int idade = keyboard.nextInt();
        System.out.println("Tens " + idade + " anos!");

        System.out.println("Que temperatura está na sala?");
        int temp = keyboard.nextInt();
        getTemperature(temp);

        pnz();
        exercicioE();

    }

    public static void getTemperature(int temp) {
        if (temp < 0) {
            System.out.println("Está gelado");
        } else if (temp < 15) {
            System.out.println("Está frio");
        } else if (temp > 80) {
            System.out.println("Está a ferver");
        } else if (temp > 50) {
            System.out.println("Está quente");
        } else {
            System.out.println("Está normal");
        }
    }

    public static void pnz() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um número inteiro: ");
        int a = in.nextInt();
        if (a > 0) {
            System.out.println("O número é positivo.");
        } else if (a < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }

    public static void exercicioE() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza 3 números inteiros: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= c && a >= b) {
            System.out.println("O maior valor é: " + a);
        } else if (b >= c) {
            System.out.println("O maior valor é: " + b);
        } else {
            System.out.println("O maior valor é: " + c);
        }

    }
}
