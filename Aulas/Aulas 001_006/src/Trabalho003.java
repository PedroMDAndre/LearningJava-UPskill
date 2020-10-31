import java.time.LocalDate;
import java.util.Scanner;

public class Trabalho003 {
    public static void main(String[] args) {
        System.out.println(idade(1984));
        System.out.println(divide(1, 2));
        System.out.println(isEven(4));
        System.out.println(isPositive(-30));
        exer5();
        System.out.println();

        // Exercícios com dados introduzidos pelo utilizador
        Scanner in = new Scanner(System.in);
        System.out.println("Exercícios com dados introduzidos pelo utilizador:\n");

        //Exercício 5
        //Exercício 6
        System.out.println("Introduza o tipo de veículo");
        System.out.println("Opções: automóvel, moto, bicicleta, triciclo, camião, monociclo");
        String veiculo = in.nextLine();
        System.out.println("O veículo tem " + getWheels(veiculo) + " roda(s)");

        //Exercício 7
        System.out.print("Introduza a nota do aluno de 0-100: ");
        int grade = in.nextInt();
        getGrade(grade);

        //Exercício 8
        System.out.print("Introduza o número correspondente ao mês 1-12: ");
        int month = in.nextInt();
        System.out.println(getMonth(month));

        //Exercício 9
        System.out.println();
        System.out.print("Introduza o número correspondente ao mês 1-12 do seu nascimento: ");
        int month1 = in.nextInt();
        System.out.print("Introduza o número correspondente ao dia 1-31 do seu nascimento: ");
        int day = in.nextInt();
        System.out.println(getSign(day, month1));

        //Exercício 10
        System.out.println("Introduza 3 números:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        decrescente(a, b, c);
        crescente(a, b, c);

    }

    //Exercício 1
    static int idade(int ano_nasc) {
        LocalDate d = LocalDate.now();
        int current_year = d.getYear();
        return current_year - ano_nasc;
    }

    //Exercício 2
    static double divide(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    //Exercício 3
    static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Exercício 4
    static boolean isPositive(double a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Exercício 5
    static void exer5() {
        Scanner in = new Scanner(System.in);
        String texto = in.nextLine();
        System.out.println("O texto introduzido foi:");
        System.out.println(texto);
    }

    //Exercício 6
    static int getWheels(String veiculo) {
        switch (veiculo) {
            case "automóvel":
                return 4;
            case "moto":
            case "bicicleta":
                return 2;
            case "triciclo":
                return 3;
            case "camião":
                return 6;
            case "monociclo":
                return 1;
            default:
                return 0;
        }
    }

    //Exercício 7
    static void getGrade(int grade) {
        String texto = "";
        if (grade >= 0 && grade <= 30) {
            texto = "Muito Insuficiente";
        } else if (grade > 30 && grade <= 50) {
            texto = "Suficiente";
        } else if (grade > 50 && grade <= 70) {
            texto = "Suficiente";
        } else if (grade > 70 && grade <= 80) {
            texto = "Bom";
        } else if (grade > 80 && grade <= 90) {
            texto = "Muito Bom";
        } else if (grade > 90 && grade <= 100) {
            texto = "Excelente";
        } else {
            texto = "Nota inválida";
        }
        System.out.println(texto);
    }

    //Exercício 8
    static String getMonth(int month) {
        switch (month) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";
        }
    }

    //Exercício 9
    static String getSign(int day, int month) {
        if ((month == 3 && day > 20) || (month == 4 && day < 21)) {
            return "Aries";

        } else if ((month == 4 && day > 20) || (month == 5 && day < 21)) {
            return "Taurus";

        } else if ((month == 5 && day > 20) || (month == 6 && day < 21)) {
            return "Gemini";

        } else if ((month == 6 && day > 20) || (month == 7 && day < 22)) {
            return "Cancer";

        } else if ((month == 7 && day > 21) || (month == 8 && day < 23)) {
            return "Leo";

        } else if ((month == 8 && day > 22) || (month == 9 && day < 23)) {
            return "Virgo";

        } else if ((month == 9 && day > 22) || (month == 10 && day < 23)) {
            return "Libra";

        } else if ((month == 10 && day > 22) || (month == 11 && day < 22)) {
            return "Scorpio";

        } else if ((month == 11 && day > 21) || (month == 12 && day < 21)) {
            return "Sagittarius";

        } else if ((month == 12 && day > 21) || (month == 1 && day < 21)) {
            return "Capricorn";

        } else if ((month == 1 && day > 20) || (month == 2 && day < 20)) {
            return "Aquarius";

        } else if ((month == 2 && day > 19) || (month == 3 && day < 21)) {
            return "Pisces";

        } else {
            return "";
        }
    }

    //Exercício 10
    static void decrescente(double a, double b, double c) {
        if (a >= b && a >= c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b >= c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }

    static void crescente(double a, double b, double c) {
        if (a <= b && a <= c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b <= c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }

}

