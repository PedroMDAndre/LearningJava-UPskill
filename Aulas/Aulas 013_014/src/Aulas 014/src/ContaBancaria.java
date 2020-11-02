import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria {
    // Attributes
    private ArrayList<Movimento> listaMovimentos;
    private String pessoa;
    private int nrConta;


    // Constructors
    public ContaBancaria(String pessoa, int nrConta) {
        this.pessoa = pessoa;
        this.nrConta = nrConta;
        this.listaMovimentos = new ArrayList<>();
    }

    public ContaBancaria(File file){
        this.listaMovimentos = new ArrayList<>();
        lerFicheiro(file);
    }


    // Methods
    public String getPessoa() {
        return pessoa;
    }

    public int getNrConta() {
        return nrConta;
    }

    public ArrayList<Movimento> getListaMovimentos() {
        return listaMovimentos;
    }

    public void addMov(String descricao, double valor) {
        listaMovimentos.add(new Movimento(listaMovimentos.size() + 1,
                descricao,
                valor));
    }

    public void saveMov() {
        try {
            File fileSave = new File("ContasBancarias/conta" + this.pessoa + ".txt");
            PrintWriter printWriter = new PrintWriter(fileSave);

            printWriter.println(pessoa + ":" + nrConta);

            for (Movimento mov : listaMovimentos) {
                printWriter.println(mov);
            }

            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void lerFicheiro(File file) {
        listaMovimentos.clear();
        try {
            Scanner scanner = new Scanner(file);

            String firstLine = scanner.nextLine();
            String[] firstTokens = firstLine.split(":");
            this.pessoa = firstTokens[0];
            this.nrConta = Integer.parseInt(firstTokens[1]);


            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] linhaDes = linha.split(";");


                int id = Integer.parseInt(linhaDes[0]);
                String descricao = linhaDes[1];
                double valor = Double.parseDouble(linhaDes[2]);
                listaMovimentos.add(new Movimento(id, descricao, valor));
            }
            scanner.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Fichero não existe!");
        } catch (
                NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o ficheiro.");
        }
    }


}
