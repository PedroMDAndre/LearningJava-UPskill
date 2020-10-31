package Trabalho11.Exercicio7;

import java.util.PriorityQueue;

/*
Exercício 7
Crie duas filas prioritárias ( PriorityQueue ): uma com números racionais (comparação
intrínseca, implementação de Comparable ) e outra com Alunos (comparação
extrínseca, implementação de Comparator ). Note que a fila prioritária apenas é
ordenada ao esvaziar. Esvazie ambas e verifique que os elementos saem por ordem
crescente.
*/
public class Main {
    public static void main(String args[]) {
        // Criar duas filas prioritárias
        // Cria a lista de racionais
        PriorityQueue<Racional> queueNumRacionais = new PriorityQueue<>();

        // Cria Racionais
        Racional r1 = new Racional(1, 0);
        Racional r2 = new Racional(1, 1);
        Racional r3 = new Racional(0, 0);
        Racional r4 = new Racional(4, 2);
        Racional r5 = new Racional(5, 3);

        // Adiciona racionais à lista
        queueNumRacionais.add(r1);
        queueNumRacionais.add(r2);
        queueNumRacionais.add(r3);
        queueNumRacionais.add(r4);
        queueNumRacionais.add(r5);

        // Mostra lista de racionais
        System.out.println(queueNumRacionais);

        // Remove racionais por ordem crescente
        int queueNRSize = queueNumRacionais.size();
        for (int i = 0; i < queueNRSize; i++) {
            System.out.println("remove: " + queueNumRacionais.poll());
        }
        System.out.println();

        // Cria a lista de alunos
        PriorityQueue<Aluno> queueAluno = new PriorityQueue<>();

        // Cria alunos
        Aluno a1 = new Aluno("Joana");
        Aluno a2 = new Aluno("Ana");
        Aluno a3 = new Aluno("Pedro");
        Aluno a4 = new Aluno("Mário");
        Aluno a5 = new Aluno("Joaquim");
        Aluno a6 = new Aluno("Maria");

        // Adiciona alunos à lista
        queueAluno.add(a1);
        queueAluno.add(a2);
        queueAluno.add(a3);
        queueAluno.add(a4);
        queueAluno.add(a5);
        queueAluno.add(a6);

        // Remove alunos por ordem crescente (alfabética)
        System.out.println(queueAluno);
        int queueAlunoSize = queueAluno.size();
        for (int i = 0; i < queueAlunoSize; i++) {
            System.out.println("remove: " + queueAluno.poll());
        }


    }
}
