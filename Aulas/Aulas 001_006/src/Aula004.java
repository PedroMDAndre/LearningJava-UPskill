import java.util.Scanner;

public class Aula004 {
    public static void main(String[] args) {
        // Sum of integers from 1 to N
        /*Scanner in = new Scanner(System.in);
        System.out.println("-- Sum of integers from 1 to N --");
        System.out.println("Input a integer (N): ");
        int val = in.nextInt();
        in.nextLine(); // to remove "Enter" from new input read*/
        int val = 20;

        sumNatutaisWhile(val);
        sumNatutaisDoWhile(val);
        sumNatutaisFor(val);

        System.out.println();
        System.out.print("Even 1 to N [while]:    ");
        evensWhile(val);
        System.out.print("Even 1 to N [do-while]: ");
        evensDoWhile(val);
        System.out.print("Even 1 to N [for]:      ");
        evensFor(val);

        // Fibonacci Sequence
        int n = 10;
        System.out.println();
        System.out.println("fibonacci para " + n);
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // VECTORS
        // Check if a number exists in vector
        System.out.println();
        int[] v = {12, 1, 2, 3};
        printVector(v);
        System.out.println("Is 2 in vector? " + isInVector(2, v));
        System.out.println("Is 10 in vector? " + isInVector(10, v));
        // Give maximum
        System.out.println("The maximum of the vector is:  " + maximum(v));
        System.out.println("The minimum of the vector is:  " + minimum(v));
        System.out.println();

        desenhaQuadrado();

    }

    /*****************
     *** RECURSION ***
     *****************/
    // Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**************
     *** CYCLES ***
     **************/
    /* Sum of natural numbers until n
     *  WHILE
     *  DO-WHILE
     *  FOR*/

    // WHILE
    static void sumNatutaisWhile(int n) {
        int i = 1;
        int soma = 0;
        while (i <= n) {
            soma += i;
            i++;
        }
        System.out.println("Sum of integer numbers from 1 to 10 using [while]: " + soma);
    }

    // DO-WHILE
    static void sumNatutaisDoWhile(int n) {
        int i = 1;
        int soma = 0;
        do {
            soma += i;
            i++;
        } while (i <= n);
        System.out.println("Sum of integer numbers from 1 to 10 using [do-while]: " + soma);
    }

    // FOR
    static void sumNatutaisFor(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("Sum of integer numbers from 1 to 10 using [for]: " + soma);
    }

    // Print even numbers from 1 to N
    static void evensWhile(int n) {
        int i = 1;
        while (i <= n) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    static void evensDoWhile(int n) {
        int i = 1;
        do {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= n);
        System.out.println();
    }

    static void evensFor(int n) {
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /***************
     *** VECTORS ***
     ***************/
    // check if number 'a' is in vector
    static boolean isInVector(int a, int[] vector) {
        int i = 0;
        while (i != vector.length) {
            if (vector[i] == a) {
                return true;
            }
            i++;
        }
        return false;
    }

    static int maximum(int[] vector) {
        int max = vector[0];
        int i = 1;
        while (i < vector.length) {
            if (vector[i] > max) {
                max = vector[i];
            }
            i++;
        }
        return max;
    }

    static int minimum(int[] vector) {
        int min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }

    static void printVector(int[] vector) {
        System.out.print("{  ");
        for (int x : vector) {
            System.out.print(x + "  ");
        }
        System.out.println("}");
    }

    public static void desenhaQuadrado() {
        int[][] matriz = new int[5][5];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

