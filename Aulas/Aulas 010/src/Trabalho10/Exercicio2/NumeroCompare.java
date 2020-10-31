package Trabalho10.Exercicio2;

import java.util.Comparator;

public class NumeroCompare implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getNumero() > aluno2.getNumero()) {
            return 1;
        } else if (aluno1.getNumero() < aluno2.getNumero()) {
            return -1;
        } else {
            return 0;
        }
    }
}
