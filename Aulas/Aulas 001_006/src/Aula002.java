public class Aula002 {
    public static void main(String[] args) {

        System.out.println(arredondar(converter_tc_tf(converter_tf_tc(32))));

    }

    // exercicio 1
    static int sumMul(int a, int b, int c) {
        return (a + b) * c;
    }

    static int mulSum(int a, int b, int c) {
        return (a * b) + c;
    }

    // exercicio 2
    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    // exercicio 3
    // T(°C) = (T(°F) - 32) / 1.8
    // T(ºF) = T(ºC) * 1.8 + 32
    static double converter_tc_tf(double tc) {
        return tc * 1.8 + 32;
    }

    static double converter_tf_tc(double tf) {
        return (tf - 32) / 1.8;
    }

    static int arredondar(double d) {
        if (d < 0) {
            return (int) (d - 0.5);
            // -7.2 - 0.5 = -7
            // -7.7 - 0.5 = -8
        } else {
            return (int) (d + 0.5);
            // 2.5 + 0.5 = 3
            // 3.2 + 0.5 = 3
            // 3.8 + 0.5 = 4
        }
    }
}
