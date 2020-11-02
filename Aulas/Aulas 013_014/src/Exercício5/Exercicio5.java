package Exercício5;

/*
Exercício 5
Escreva um programa que seja capaz de ler um ficheiro que representa um mapa (em baixo,
à esquerda) e, com base na informação lida, imprima no écran uma versão simplificada (em
baixo, à direita) onde apenas aparecem os ‘#’s substituídos pelo caracter ‘W’.


        ##########              WWWWWWWWWW
        #b  X   X#              W        W
        #        #              W        W
        #   C    #              W        W
        #        #      ==>     W        W
        #      # #              W      W W
        #  C   #C#              W      W W
        #     O# #              W      W W
        #  X   #E#              W      W W
        ##########              WWWWWWWWWW
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        File inFile = new File("ficheiros/exercicio5.txt");
        String linhaFicheiro;

        // Ler ficheiro
        try {
            Scanner scFicheiro = new Scanner(inFile);

            while (scFicheiro.hasNext()) {
                linhaFicheiro = scFicheiro.nextLine();

                // replace "#" with "W"
                linhaFicheiro = linhaFicheiro.replace('#', 'W');
                for (int i = 0; i < linhaFicheiro.length(); i++) {
                    if (linhaFicheiro.charAt(i) != ' ' && linhaFicheiro.charAt(i) != 'W') {
                        linhaFicheiro = linhaFicheiro.substring(0, i) + " " + linhaFicheiro.substring(i + 1);
                    }
                }
                System.out.println(linhaFicheiro);
            }

            scFicheiro.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar o ficheiro.");
            // e.printStackTrace();
        }
    }
}
