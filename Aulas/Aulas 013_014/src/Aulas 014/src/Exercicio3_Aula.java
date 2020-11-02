import java.io.File;
import java.util.ArrayList;

public class Exercicio3_Aula {
    public static void main(String[] args) {
        File file = new File("ContasBancarias/contaPedro.txt");

        ContaBancaria conta = new ContaBancaria(file);

        conta.addMov("jantar", 15);
        conta.addMov("presente", 20);

        conta.saveMov();
        System.out.println("nr.: " + conta.getNrConta() + "\t\tNome: " + conta.getPessoa());
        System.out.println("---------------------------");
        printList(conta.getListaMovimentos());


        ContaBancaria joao = new ContaBancaria("Joao", 213);
        joao.addMov("Computador", 1000);
        joao.addMov("Maçã", 0.8);
        joao.addMov("Presente", 23);

        joao.saveMov();
        System.out.println("\nnr.: " + joao.getNrConta() + "\t\tNome: " + joao.getPessoa());
        System.out.println("---------------------------");
        printList(joao.getListaMovimentos());
    }

    public static void printList(ArrayList<Movimento> list) {
        System.out.println("id\tMovimento\t\t Valor");
        for (Movimento mov : list) {
            System.out.print(String.format("%2d\t",mov.getId()));
            System.out.print(String.format("%-9s",mov.getDescricao()));
            System.out.println(String.format("%12.2f", mov.getValor()));

        }
    }
}
