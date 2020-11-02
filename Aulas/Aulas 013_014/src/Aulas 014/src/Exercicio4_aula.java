import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercicio4_aula {
    public static void main(String[] args) {
        ArrayList<Lampada> listaLampadas = new ArrayList<>();

        Scanner inScanner = new Scanner(System.in);


        // Introdução número de lâmpadas
        Integer nrLampadas = null;

        while (nrLampadas == null) {
            try {
                System.out.print("Introduza o número de lâmpadas a criar: ");

                nrLampadas = inScanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Introduza um número!");
                inScanner.nextLine();
            }
        }

        // Introdução da potência das lâmpadas
        for (int i = 0; i < nrLampadas; i++) {
            Integer potencia = null;
            while (potencia == null) {
                try {
                    System.out.print("Introduza a potência (W) da lâmpada a criar: ");
                    potencia = inScanner.nextInt();
                    listaLampadas.add(new Lampada(potencia));

                } catch (InputMismatchException e) {
                    System.out.println("Introduza um número!");
                    inScanner.nextLine();
                }
            }
        }

        // Mostra lista de lâmpadas
        for (Lampada lampada : listaLampadas) {
            System.out.println(lampada);
        }

        // Escreve para ficheiro
        File file = new File("lampadas.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Lampada lampada : listaLampadas) {
                printWriter.println(lampada);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
