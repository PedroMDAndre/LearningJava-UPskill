package Trabalho11.Exercicio7;

import java.util.Comparator;

public class AlunoNomeCompare implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
