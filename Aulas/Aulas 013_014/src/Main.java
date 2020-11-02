import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter fileWriter = new PrintWriter(new File("novo_ficheiro.txt"));
            fileWriter.println("Primeira linha");
            fileWriter.println("Segunda linha!");
            fileWriter.println(12345);
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar o ficheiro!");
        }
    }
}
