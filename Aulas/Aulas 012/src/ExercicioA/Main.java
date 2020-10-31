package ExercicioA;

import java.util.Scanner;
/*
Exercício A
Como ficaria o exemplo anterior (opções do menu) se fosse utilizada a estrutura de seleção
SWITCH?
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza uma comando:");
        String line = scanner.nextLine();
        Command command = Command.valueOf(line.toUpperCase());
        switch (command){
            case SAVE:
                // save
                System.out.println("Save");
                break;
            case LOAD:
                // load
                System.out.println("Load");
                break;
            case EXIT:
                // exit
                System.out.println("Exit");
                break;
        }
    }

    public enum Command {
        SAVE, LOAD, EXIT;
    }
}
