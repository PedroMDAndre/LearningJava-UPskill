import CartaoPresente.*;
import Escritorio.*;

public class Aula008 {
    public static void main(String[] args) {
        /*escritorio();
        cartoes();*/
        escritorio();
        stringExercise1();
    }

    public static void escritorio() {
        // Exercise 1
        Vendedor vendedor = new Vendedor("João", "A23", 500, 100);
        Gerente gerente = new Gerente("Paulo", "B22", 600);
        Assistente assistente = new Assistente("André", "A35", 500);
        System.out.println();
        System.out.println(vendedor);
        System.out.println();
        System.out.println(gerente);
        System.out.println();
        System.out.println(assistente);
    }

    public static void cartoes() {
        DiaDosNamorados card1 = new DiaDosNamorados("Beatriz");
        Natal card2 = new Natal("Carlos");
        Aniversario card3 = new Aniversario("John");
        card1.showMessage();
        card2.showMessage();
        card3.showMessage();
    }

    public static void stringExercise1() {
        System.out.println((int) 'b');
        System.out.println(encode("ola isto e um teste"));

        System.out.println(decode(encode("ola isto e um teste")));

    }
    // Objectivo: criar uma função que, dada uma String
    // retorna a mesma convertida no seu valor numérico
    // ex: ABC DEF -> 1-2-3 4-5-6

    //agora descodificar
    private final static char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    //objetivo: criar uma função que, dado uma String
    //retorna a mesma convertida no seu valor numérico
    //ex: ABC DEF -> 1-2-3 4-5-6
    public static String encode(String frase) {
        char[] caracteres = frase.toLowerCase().toCharArray();
        //ABC -> 'A', 'B', 'C'
        String retorno = "";
        for (char c : caracteres) {
            if (c == ' ') {
                retorno += " -";
            } else {
                retorno += (((int) c) - 96) + "-";
            }
        }
        // Remover o último "-"
        retorno = retorno.substring(0, retorno.length() - 1);
        return retorno;
    }


    public static String decode(String x) {
        String[] charNumbers = x.split("-");
        String result = "";

        int stringToInt;
        char intToChar;
        for (String number : charNumbers) {
            if (number.equals(" ")) {
                result += " ";
            } else {
                stringToInt = Integer.parseInt(number.trim());
                intToChar = (char) (stringToInt + 96);
                result += intToChar;
            }
        }
        return result;
    }
}
