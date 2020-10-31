public class Trabalho002 {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int result1 = soma(a, b);
        System.out.printf("1. A soma dos números é:      %d%n", result1);

        int result2 = quadrado(a);
        System.out.println("2. O quadrado do número é:    " + result2);

        int result3 = diferenca(a, b);
        System.out.println("3. A diferença dos números é: " + result3);

        double result4 = media2(a, b);
        System.out.println("4. A média dos números é:     " + result4);

        double base = 10;
        double altura_r = 20;
        double result5 = areaRectangulo(base, altura_r);
        System.out.println("5. A área do rectângulo é:    " + result5);

        double tc = 25;
        double result6 = converter_tc_tf(tc);
        System.out.println("6. A temperatura em ºF:       " + result6);

        double result7 = converter_tc_tk(tc);
        System.out.println("7. A temperatura em K é:      " + result7);

        int cm = 30;
        double result8 = cmTopol(cm);
        System.out.println("8. A conversão em polegadas é: " + arredondar_2c(result8));

        double preco_final = 100;
        double result9 = iva(preco_final);
        System.out.println("9. O IVA é :                   " + arredondar_2c(result9));

        double pi = 3.14;
        int result10 = arredondar(pi);
        System.out.println("10. O inteiro aproximado é:    " + result10);

        double diametro = 3;
        double result11 = circle_perimeter(diametro);
        System.out.println("11. O perímetro é:             " + arredondar_2c(result11));

        double largura = 12;
        double altura = 3;
        double comprimento = 20;
        double result12 = area_prisma(largura, altura, comprimento);
        System.out.println("12. A área do prisma rectangular é: " + result12);
    }

    // Aula 2
    // Exercício 1
    static int soma(int a, int b) {
        return a + b;
    }

    // Exercício 2
    static int quadrado(int a) {
        return a * a;
    }

    // Exercício 3
    static int diferenca(int a, int b) {
        return a - b;
    }

    // Exercício 4
    static double media2(int a, int b) {
        return (a + b) / 2;
    }

    // Exercício 5
    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Exercício 6
    // T(°C) = (T(°F) - 32) / 1.8
    // T(ºF) = T(ºC) * 1.8 + 32
    static double converter_tc_tf(double tc) {
        return tc * 1.8 + 32;
    }

    // Exercício 7
    static double converter_tc_tk(double tc) {
        return tc + 273.15;
    }

    // Exercício 8
    static double cmTopol(double cm) {
        return cm / 2.54;
    }

    // Exercício 9
    static double iva(double preco_total) {
        double iva_f = 0.23;
        return preco_total - preco_total / (1 + iva_f);
    }

    // Exercício 10
    // Dado um número com casas decimais (double), devolve
    // o inteiro aproximado. (Ex: 4.3 -> 4, 5.7 -> 6).
    static int arredondar(double b) {
        return (int) (b + 0.5);
    }
    static double arredondar_2c(double valor) {
        return  ((int) ((valor + 0.005) * 100)) / 100.;
    }

    // Exercício 11
    // Obter o perímetro de um círculo, dado o seu diâmetro
    static double circle_perimeter(double diameter) {
        return Math.PI * diameter;
    }

    // Exercício 12
    // Obter a área de um prisma retangular, dando a sua largura, altura e comprimento.
    static double area_prisma(double largura, double altura, double comprimento) {
        return largura * altura * 2 + comprimento * altura * 2;
    }
}