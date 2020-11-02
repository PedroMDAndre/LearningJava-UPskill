package Exercício2;

/*
Exercicio 2
Pedir ao utilizador para inserir o seu nome e idade e de seguida escrever essa informação
para um ficheiro.
De seguida, ler o ficheiro e imprimir para a consola o resultado.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Introduza a sua idade :");
        Integer idade = null;
        while (idade == null) {
            try {
                idade = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Idade inválida. Tente novamente");
                scanner.next();
            }
        }

        System.out.println("O utilizador inseriu: " + nome + " e " + idade);

        escreverDados2(nome, idade);
    }

    public static void escreverDados1(String nome, int idade){
        // Como escrever no ficheiro e adicionar uma nova linha diretamente sem ter que ler:
        try {
            FileWriter file = new FileWriter("ficheiros/pessoas2.txt", true);

            PrintWriter printWriter = new PrintWriter(new BufferedWriter(file));
            String novaLinha = nome + ":" + idade + "\n";
            printWriter.append(novaLinha);
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escreverDados2(String nome, int idade){
        // Se quisermos ler o ficheiro, modificar  e de seguida gravar tudo no mesmo ficheiro
        try {
            File file = new File("ficheiros/pessoas2.txt");

            ArrayList<String> linhasFicheiro = new ArrayList<>();

            linhasFicheiro.add(nome + ":" + idade); //no topo do ficheiro

            if(file.exists()) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    linhasFicheiro.add(fileScanner.nextLine());
                }
            }

            //linhasFicheiro.add(nome + ":" + idade); //no final do ficheiro

            PrintWriter printWriter = new PrintWriter(file);
            for(String linha : linhasFicheiro) {
                printWriter.write(linha);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

