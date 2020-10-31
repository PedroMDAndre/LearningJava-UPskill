package Trabalho11.Exercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Exercício 1
Utilizando como base o programa abaixo, compare o tempo de execução relativo à
inserção de um elemento no início, no final e no meio de uma ArrayList<String> e
de uma LinkedList<String> . A que se deve a diferença de desempenho?
*/

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Test time Array List: " +
                testTime(arrayList));
        System.out.println("Test time Linked List: "
                + testTime(linkedList));
    }

    private static long testTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        // Inserção de elementos no início da lista
        list.add(0);
        for (int i = 0; i != 100000; i++)
            list.add(0, i);
        return System.currentTimeMillis() - startTime;
    }
}
