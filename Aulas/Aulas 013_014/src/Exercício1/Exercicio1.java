package Exercício1;

/*
Exercício 1
Crie uma lista de Pessoas com a informação recolhida no ficheiro pessoas.txt. O ficheiro pessoas.txt
apresenta a seguinte estrutura:

João:23:Lisboa
Maria:10:Porto
Rita:21:Gaia
José:39:Aveiro
Manel:25:Portalegre
Ana:33:Alenquer
Alex:19:Sintra
Jacinto:30:Guarda
Vanderlei:45:Portimão
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try{
            Scanner fileScanner = new Scanner(new File("ficheiros/pessoas.txt"));

            while (fileScanner.hasNextLine()){
                String pessoaString = fileScanner.nextLine();
                Pessoa pessoa = new Pessoa(pessoaString);
                pessoas.add(pessoa);
            }

        }catch(FileNotFoundException e){
            System.out.println("O Ficheiro não foi encontrado!");
            e.printStackTrace();
        }

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
        }
    }

}
