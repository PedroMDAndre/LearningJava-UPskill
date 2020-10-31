package Outros;

import java.util.Arrays;

public class Estudante implements Comparable<Estudante> {
    public static void main(String[] args) {
        Estudante[] st = new Estudante[3];
        st[0] = new Estudante(101, "Vijay", 23);
        st[1] = new Estudante(106, "Ajay", 27);
        st[2] = new Estudante(105, "Jay", 21);
        Arrays.sort(st);
        System.out.println("Ordenado por idade");
        for (Estudante stu : st) {
            System.out.println(stu.rollno + " " + stu.nome + " " + stu.idade);
        }
    }


    int rollno;
    String nome;
    int idade;

    public Estudante(int rollno, String nome, int idade) {
        this.rollno = rollno;
        this.nome = nome;
        this.idade = idade;
    }

    public int compareTo(Estudante st) {
        if (idade == st.idade) {
            return 0;
        } else if (idade > st.idade)
            return 1;
        else
            return -1;
    }
}





