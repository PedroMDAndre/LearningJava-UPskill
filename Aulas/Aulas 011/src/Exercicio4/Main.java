package Exercicio4;

import java.util.HashMap;

/*
Exercício 4
Pretende-se recriar a função String getMes(int mes) que devolve o nome do mês com base no seu número,
mas desta vez aplicando os conhecimentos de HashMap que obtiveram nesta aula.
*/

public class Main {

    public static void main(String[] args) {

        preencherMeses2();
        System.out.println(getMes(3));
    }

    private static HashMap<Integer, String> meses = new HashMap<>();

    public static void preencherMeses1() {
        meses.put(1, "Janeiro");
        meses.put(2, "Fevereiro");
        meses.put(3, "Março");
        meses.put(4, "Abril");
        meses.put(5, "Maio");
        meses.put(6, "Junho");
        meses.put(7, "Julho");
        meses.put(8, "Agosto");
        meses.put(9, "Setembro");
        meses.put(10, "Outubro");
        meses.put(11, "Novembro");
        meses.put(12, "Dezembro");
    }

    public static void preencherMeses2() {
        String[] mesesString = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        for (int i = 0; i < mesesString.length; i++) {
            meses.put(i + 1, mesesString[i]);
        }
    }

    public static String getMes(int mes) {
        return meses.get(mes);
    }
}
