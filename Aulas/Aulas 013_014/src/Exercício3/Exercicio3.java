package Exercício3;

/*
Exercício 3
Implemente uma classe ContaBancaria que contém um método para adicionar a uma Lista
de movimentos com a assinatura (String descrição, double valor) e outro para
guardar as informações relativas aos movimentos feitos na conta.
Os movimentos devem ser guardados num ficheiro .txt com a seguinte formatação
(id, descrição, valor):
 1;  almoço;    12
 2;  lanche;    5

Por fim, criar um construtor que receba apenas o nome do ficheiro e construa o objecto
ContaBancaria com base nos valores do ficheiro.
*/

import java.io.File;

public class Exercicio3 {
    public static void main(String[] args) {
        File file = new File("ficheiros/movimentos.txt");
        ContaBancaria conta = new ContaBancaria(file);
        conta.add("Almoço", 12);
        conta.add("Lanche", 5);
        conta.add("Jantar", 20);
        System.out.println(conta.getListMovimentos());
        conta.save();
    }
}
