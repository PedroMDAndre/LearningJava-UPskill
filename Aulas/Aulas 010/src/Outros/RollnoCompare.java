package Outros;

import java.util.Comparator;

public class RollnoCompare implements Comparator<Estudante> {
    public int compare(Estudante s1, Estudante s2) {
        if (s1.rollno < s2.rollno)
            return -1;
        else if (s1.rollno > s2.rollno)
            return 1;
        else return 0;
    }
}
