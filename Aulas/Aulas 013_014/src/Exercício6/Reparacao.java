package Exercício6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Reparacao {
    // Attributes
    private String carro;       // Matrícula
    private String cliente;     // Nome do cliente
    private String reparacao;   // Tipo de reparação
    private double valor;       // Custo da reparação

    // Constructor
    public Reparacao(String carro, String cliente, String reparacao, double valor) {
        this.carro = carro;
        this.cliente = cliente;
        this.reparacao = reparacao;
        this.valor = valor;
    }

    // Methods

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return carro + ";" + cliente + ";" + reparacao + ";" + valor;
    }

    public static ArrayList<Reparacao> loadFile(File inFile, ArrayList<Reparacao> listaReparacao) {

        try {
            Scanner inScanner = new Scanner(inFile);

            while (inScanner.hasNextLine()) {
                String line = inScanner.nextLine();
                String[] lineList = line.split(";");

                String carro = lineList[0];
                String cliente = lineList[1];
                String reparacao = lineList[2];
                double valor = Double.parseDouble(lineList[3]);

                listaReparacao.add(new Reparacao(carro, cliente, reparacao, valor));
            }
            inScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não foi encontrado!");
        }

        return listaReparacao;
    }

    public static void saveToFile(File outFile, ArrayList<Reparacao> listaReparacao) {
        try {
            PrintWriter printWriter = new PrintWriter(outFile);

            for (Reparacao reparacao : listaReparacao) {
                printWriter.println(reparacao);
            }

            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível guardar os resultados.");
        }
    }
}
