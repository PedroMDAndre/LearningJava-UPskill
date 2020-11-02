import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2_Aula {
    public static void main(String[] args) {
        String name = null;
        Integer age = null;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Diga o seu nome: ");
            name = scanner.nextLine();
            System.out.println("Diga a sua idade: ");
            age = scanner.nextInt();

            System.out.println("Informação lida: " + name + ", " + age);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter(new File("ola.txt"));
            printWriter.println(name + ":" + age);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

      lerFicheiro2();


    }

    // Alternativas para ler o ficheiro
    public static void lerFicheiro1(){
        try(Scanner scanner = new Scanner(new File("ola.txt"))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(":");
                System.out.println("Nova pessoa!!");
                System.out.println("Nome: " + tokens[0]);
                System.out.println("Idade: " + tokens[1]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void lerFicheiro2(){
        try {
            Scanner scanner = new Scanner(new File("ola.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(":");
                System.out.println("Nova pessoa!!");
                System.out.println("Nome: " + tokens[0]);
                System.out.println("Idade: " + tokens[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
