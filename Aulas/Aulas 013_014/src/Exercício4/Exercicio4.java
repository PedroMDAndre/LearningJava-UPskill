package Exercício4;

/*
Exercício 4
Pretende-se escrever um pequeno programa que pede a um utilizador para inserir dados
sobre lâmpadas e depois escrever esses dados num ficheiro de texto.
    * Crie uma classe de objetos Lampada para representar lâmpadas. A classe tem um
    atributo, a potência da lâmpada(em Watts), um inspetor para esse atributo e uma
    sobreposição do método toString.

    * Use a classe Scanner para ler do teclado o número de lâmpadas a criar e a potência de
    cada uma delas.

    * Use um ArrayList<Lampada> para guardar as várias lâmpadas inseridas pelo
    utilizador e para posteriormente mostrar na consola a potência de cada uma das
    lâmpadas inseridas.

    * Escreva a informação da lista de lâmpadas para um ficheiro de texto.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Lampada> listaLampadas = new ArrayList<>();           // Lista de lâmpadas
        Scanner scTeclado = new Scanner(System.in);                     // Objecto para obter input do teclado
        File fileOut = new File("ficheiros/lampadas.txt");     // Ficheiro para guardar resultados

        System.out.print("Introduza o número de lâmpadas a criar: ");
        Integer nrLampadas = null;

        while (nrLampadas == null) {
            try {
                nrLampadas = scTeclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tem de introduzir um número.");
                System.out.print("Introduza o número de lâmpadas: ");
                scTeclado.next();
            }
        }

        for (int i = 0; i < nrLampadas; i++) {
            System.out.print("Introduza a potência da lâmpada (W): ");
            Integer potencia = null;

            while (potencia == null) {
                try {
                    potencia = scTeclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Tem de introduzir um número.");
                    System.out.print("Introduza a potência das lâmpadas (W): ");
                    scTeclado.next();
                }
            }

            // Introduzir lâmpada na lista
            listaLampadas.add(new Lampada(potencia));
        }

        // Mostrar lista de lâmpadas criadas
        System.out.println(listaLampadas);

        // Escrever resultados para um ficheiro
        try {
            PrintWriter printWriter = new PrintWriter(fileOut);

            for (Lampada lampada : listaLampadas) {
                printWriter.println(lampada);
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar o ficheiro!");
        }
    }

    private static void createFile(File file) {
        try {
            file.createNewFile();
            System.out.println("Novo ficheiro criado!");
        } catch (IOException e) {
            System.out.println("Não foi possível criar o ficheiro.");
        }
    }


}
