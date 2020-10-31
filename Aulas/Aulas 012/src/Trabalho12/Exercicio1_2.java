package Trabalho12;

/*
Exercício 1
Dado o seguinte enumerado:

    public enum Options{SAVE, LOAD, EXIT}

Assuma que está corretamente inicializado e
diga o que falta para completar a condição seguinte
de modo a correr o corpo da condição caso a
variável contenha EXIT.

Options op = ...
if (op == ____) {
    ....
}

2. Quais dos seguintes são métodos já disponiveis para os enumerados
em Java (selecione todas as respostas corretas):
    a) name()       ✔
    b) getValue()
    c) read()
    d) value()
*/

import java.util.Scanner;

public class Exercicio1_2 {
    public enum Options {
        SAVE, LOAD, EXIT
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Introduza um comando:");
            String comando = "";
            Options op = null;
            while (comando.equals("")) {
                try {
                    comando = scanner.nextLine();
                    op = Options.valueOf(comando.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Comando inválido. Tente novamente:");
                    comando = "";
                }
            }
            switch (op) {
                case EXIT -> {
                    System.out.println("The end!");
                    System.exit(0);
                    System.out.println("Isto nunca vai correr!");
                }
                case SAVE -> System.out.println("A salvar...");
                case LOAD -> System.out.println("A carregar...");
            }
        }
    }
}
