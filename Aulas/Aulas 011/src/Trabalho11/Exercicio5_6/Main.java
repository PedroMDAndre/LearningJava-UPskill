package Trabalho11.Exercicio5_6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
Exercício 5
Crie uma pilha de números inteiros usando a classe Stack e utilize os métodos push
e pop para verificar que os números inseridos na pilha saem pela ordem inversa à sua
inserção.

Exercício 6
Use uma fila de dois topos ( Deque ) e verifique que é possível inserir e retirar
elementos de ambos os topos.
 */

public class Main {
    public static void main(String[] args){
        // Exercício 5
        Stack<String> pilha = new Stack<>();
        System.out.println("Pilha:");
        pilha.push("a");
        pilha.push("b");
        pilha.push("c");
        pilha.push("d");
        System.out.println(pilha);
        pilha.pop();
        System.out.println("Pilha após remoção de elemento:");
        System.out.println(pilha);

        // Exercício 6
        System.out.println("\nPilha 2 topos");
        Deque<String> fila2topos = new ArrayDeque<>();
        fila2topos.offerFirst("a");
        fila2topos.offerFirst("b");
        fila2topos.offerLast("Last");
        System.out.println(fila2topos);
        fila2topos.pollFirst();
        fila2topos.pollLast();

        System.out.println(fila2topos);
    }
}
