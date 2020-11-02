package Exercício3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria {
    // Attributes
    private File fileIO;                            // ficheiro onde guardar e ler informação
    private ArrayList<Movimento> listMovimentos;    // lista que guarda os movimentos em memória

    // Constructor
    public ContaBancaria(File fileIO) {
        this.listMovimentos = new ArrayList<>();
        this.fileIO = fileIO;

        // Se o ficheiro existir os movimentos são colocados na variável listMovimentos
        // Caso contrário o ficheiro é criado
        try {
            Scanner scanner = new Scanner(fileIO);
            while (scanner.hasNext()) {
                String[] movimento = scanner.next().split(";");
                listMovimentos.add(new Movimento(Integer.parseInt(movimento[0]), movimento[1], Double.parseDouble(movimento[2])));
            }
            scanner.close();  // Fechar sempre os ficheiros
        } catch (FileNotFoundException e) {
            System.out.println("O ficheiro não foi encontrado.");
            createFile(fileIO);
        }
    }

    // Method
    // Método para adicionar a uma Lista de movimentos com a assinatura (String descrição, double valor)
    public void add(String descricao, double valor) {
        listMovimentos.add(new Movimento(listMovimentos.size() + 1, descricao, valor));
    }

    // Guardar as informações relativas aos movimentos feitos na conta.
    // Os movimentos devem ser guardados num ficheiro .txt com a seguinte formatação
    // (id, descrição, valor):
    //  1;almoço;12
    //  2;lanche;5
    public void save() {
        try {
            PrintWriter printWriter = new PrintWriter(fileIO);

            for (Movimento movimento : listMovimentos) {
                printWriter.println(movimento);
            }
            printWriter.close();

        } catch (IOException e) {
            System.out.println("Não foi possível guardar os movimentos.");
        }
    }

    public ArrayList<Movimento> getListMovimentos() {
        return listMovimentos;
    }

    private void createFile(File fileIO) {
        try {
            fileIO.createNewFile();
            System.out.println("Ficheiro de movimentos criado!");
        } catch (IOException e) {
            System.out.println("Não foi possível criar o ficheiro de movimentos!");
        }
    }
}
