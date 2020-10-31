package ExercicioB;

/*
Exercício B
* Escreva um enumerado que represente as quatro operações matemáticas: somar, subtrair,
multiplicar e dividir.
* Desenvolva um método que realize todas as operações do enumerado.
    - Realize todas as exceções que considerar necessárias.
 */
public class Main {
    enum Operacao {
        SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR
    }

    public static void main(String[] args) {
        calcular(12, 6, Operacao.SOMAR);
        calcular(12, 6, Operacao.DIVIDIR);

        try {
            calcular(12, 0, Operacao.DIVIDIR);
            calcular(34, 12.0, Operacao.MULTIPLICAR);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        calcular(65, 12.0, Operacao.MULTIPLICAR);
    }

    public static void calcular(double x, double y, Operacao operacao) throws IllegalArgumentException {
        switch (operacao) {
            case SOMAR:
                System.out.println(x + y);
                break;
            case SUBTRAIR:
                System.out.println(x - y);
                break;
            case MULTIPLICAR:
                System.out.println(x * y);
                break;
            case DIVIDIR:
                if (y == 0) {
                    throw new IllegalArgumentException("Black Hole! Can't divide by 0!");
                }
                System.out.println(x / y);
                break;
            default:
                System.out.println("Operação não existente!");
        }
    }
}


