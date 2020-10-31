package Trabalho12;

/*
Exercício 3
Crie um enumerado com os dias da semana (DOMINGO, SEGUNDA, ... , SÁBADO).
Este enumerado deve ter dois métodos instanciados:
    * boolean isWeekDAY()
    * boolean isWeekend() - este último método retorna o oposto do primeiro método.

Escreva um programa que demonstra como este enum poderia ser usado, sabendo que tem
um método que toma como argumento um dia da semana e imprime uma mensagem
dependendo se o dia da semana é ou não fim-de-semana.

    a. Sugestão - O método main percorre todos os valores do enumerado e envia os
    seus valores com argumento para o método.

    b. Utilizando as exceções que conhece, complete o exercício anterior.
*/

public class Exercicio3 {
    public enum DiaSemana {
        DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

        private int dia;

        DiaSemana(int dia) {
            this.dia = dia;
        }

        boolean isWeekday() {
            // Se não for fim de semana é dia de semana
            return !isWeekend();
        }

        boolean isWeekend() {
            // se for Domingo ou Sábado
            return dia == 1 || dia == 7;
        }

        private int get_dia() {
            return dia;
        }

        public static DiaSemana getDia(int i) {
            for (DiaSemana diaSemana : DiaSemana.values()) {
                if (diaSemana.get_dia() == i) {
                    return diaSemana;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            String result = "";
            if (isWeekend()) {
                result = this.name();
            } else {
                result = this.name() + "-FEIRA";
            }
            return result;
        }
    }

    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            if (dia.isWeekend()) {
                System.out.println(dia + "\tFesta!!!");
            } else {
                System.out.println(dia + "\tVamos ter de aturar o Zé :D");
            }
        }

        DiaSemana dom = DiaSemana.DOMINGO;
        DiaSemana terca = DiaSemana.getDia(3);
        System.out.println(terca.name());

        // erro
        //DiaSemana sab = DiaSemana.valueOf("SETIMO"); // erro!
    }

}
