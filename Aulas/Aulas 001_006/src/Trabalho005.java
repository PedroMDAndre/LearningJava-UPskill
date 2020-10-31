public class Trabalho005 {
    /*Exercícios sobre vetores
*************
***Slide 5***
*************
1. Construir um vetor de números naturais até um dado número n.
Exemplo: naturals(5)->{1,2,3,4,5}

2. Construir  um  vetor  de  dígitos  aleatórios  (números  de  0  a  9),  dado  o  comprimento.  Exemplo:
randomDigits(5)->{8,2,9,1,2}

3. Construir   um   vetor   capaz   de   armazenar   50   números   inteiros.   Em   seguida   faça   o   seu
preenchimento automático com os números 101 a 150, ou seja na posição número 0 fica 101, na
posição número 1 fica 102 e por aí adiante.

4. Copiar  (replicar)  um  vetor  de  inteiros,  tendo  o  novo  vetor  o  mesmo  tamanho  do  argumento.
Exemplo: copy({1,2,3},6)->{1,2,3,0,0,0} copy({1,2,3,4,5,6},3)->{1,2,3}

5. Verificar  se  existe  um  determinado  número  num  vetor.  Exemplo:  exists(5,{1,3,4,5})->true exists(1,{2,3})->false

6. Contar o número de ocorrências de um determinado caractere. Exemplo: count(a,{a,b,c,a})->2

7. Construir um sub-vetor de outro vetor, dados os índices do primeiro elemento e último a incluir.
Exemplo subarry(2,4,{a,d,r,a,c,r,w})}->{r,a,c}

*************
***Slide 6***
*************
1. Obter a primeira metade um vetor  v, incluindo um parâmetro booleano para permitir se o
elemento do meio é para incluir (caso o comprimento do vetor seja ímpar). Se o comprimento for par, este
parâmetro não terá efeito. Exemplo firstHalf({b,a,s,w,q}, true)->{b,a,s}

2. Construir  um  vetor  juntando  outros  dois  vetores  (parte  esquerda  e  parte  direita).  Exemplo:
merge({1,2},{9,10})

3. Construir  um  vetor  invertido  com  base  noutro.  Ou  seja,  o  novo  vetor  será  composto  pelos
elementos do vetor dado pela ordem inversa. Exemplo: invert({t,q,a)}->{a,q,t}

4. Construir  um  vetor  com  base  noutro,  de  modo  o  dobro  do  tamanha  e  cada  elemento  duplicado.
Exemplo: duplicateEveryElement({a,s,d})->{a,a,s,s,d,d}

5. Construir um vetor com base noutro, sendo a primeira metade uma cópia e a segunda metade os
mesmos elementos para ordem inversa. Exemplo: duplicateInverted({3,2,1})->(3,2,1,1,2,3)

6. Construir  um  vetor  com  base  noutro,  representado  um  cópia  sem  o  elemento  do  meio  (caso  o
tamanho seja ímpar) Exemplo: copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}

7. Construir  um  vetor  com  n  números  da  sequência  Fibonacci.  Exemplo:  fibonacciSequence(7)->
{0,1,1,2,3,5,8}
*/
    public static void main(String[] args) {
        char[] a = {'a', 'b'};
        char[] b = {'b'};
        System.out.println(merge(a, b));
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println(copyWithoutMiddleElement(c));


        // Slide 5
        //slide5();

        // Slide 6
        // slide6();

        /*exercicio3();*/


        /*
        int[] a = {1, 2, 3, 4, 5};
        int[] b = copy(a, 3);
        char[] vector3 = {'a','d','r','a','c','r','w'};
        char[] vector2 = subarry(2,4, vector3);
        for (char x : vector2) {
            System.out.println(x);
        }
        System.out.println(existsQ(10, a));

        char[] vector1 = {'a','b','c','a'};
        System.out.println(count_char('a', vector1));
        */
    }

    // Slide 5
    public static void slide5() {
        // Slide 5
        // exer 1
        System.out.println("Aleatórios: ");
        int[] aleatorios = randomDigits(5);
        printVector(aleatorios);

        if (existsQ(5, aleatorios)) {
            System.out.println("O número 5 existe no vector.");
        } else {
            System.out.println("O número 5 não existe no vector.");
        }
        System.out.println();

        // exer 6
        char[] vetChar = {'a', 'b', 'a', 'c'};
        printVector(vetChar);
        System.out.println("Número de caracteres 'a' existentes: " + count_char('a', vetChar));
        System.out.println();

        // exer 7
        char[] vetChar2 = {'a', 'b', 'a', 'c', 'd', 'e', 'f'};
        System.out.println("Vector de caracteres:");
        printVector(vetChar2);
        System.out.println("Entre 2 e 4:");
        printVector(subarry(2, 4, vetChar2));
        System.out.println();
    }

    // Slide 6
    public static void slide6() {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
    }

    /************
     ***Slide5***
     ************/
    // Exercício1
    public static int[] vect_naturais(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = i + 1;
        }
        return vector;
    }

    // Exercício2
    static int[] randomDigits(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }

    // Exercício3
    static int[] vector50() {
        int n = 50;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = 101 + i;
        }
        return vector;
    }

    static int[] vector50_simple() {
        int[] vector = new int[50];
        for (int i = 0; i < 50; i++) {
            vector[i] = 101 + i;
        }
        return vector;
    }

    // Exercício4
    static int[] copy(int[] vector, int size) {
        int[] copy = new int[size];

        int min_size;
        if (size < vector.length) {
            min_size = size;
        } else {
            min_size = vector.length;
        }

        for (int i = 0; i < min_size; i++) {
            copy[i] = vector[i];
        }
        return copy;
    }

    // Exercício5
    static boolean existsQ(int n, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (n == vector[i]) {
                return true;
            }
        }
        return false;
    }

    // Exercício6
    static int count_char(char a, char[] vector) {
        int count = 0;
        for (char i : vector) {
            if (i == a) {
                count++;
            }
        }
        return count;
    }

    // Exercício7
    static char[] subarry(int inicio, int fim, char[] vector) {
        char[] result = new char[fim - inicio + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = vector[inicio + i];
        }
        return result;
    }

    static int[] subarry(int inicio, int fim, int[] vector) {
        int[] result = new int[fim - inicio + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = vector[inicio + i];
        }
        return result;
    }


    /************
     ***Slide6***
     ************/
    // Exercício1
    static void exercicio1() {
        //firstHalf({b,a,s,w,q}, true)->{b,a,s}
        System.out.println("Exercício 1");
        char[] vector = {'b', 'a', 's', 'w', 'q'};
        char[] result1 = firstHalf(vector, true);
        printVector(result1);
        char[] result2 = firstHalf(vector, false);
        printVector(result2);
        System.out.println();
    }

    static char[] firstHalf(char[] vector, boolean halfQ) {
        // Check for half position
        int half;
        if (vector.length % 2 == 0) {
            half = vector.length / 2;
        } else if (halfQ) {
            half = vector.length / 2 + 1;
        } else {
            half = vector.length / 2;
        }

        char[] result = new char[half];
        for (int i = 0; i < half; i++) {
            result[i] = vector[i];
        }
        return result;
    }

    static char[] firstHalf1(char[] vector, boolean halfQ) {
        // Check for half position
        int half = 0;
        if (halfQ) {
            half = (int) Math.ceil(vector.length / 2.0);
        } else {
            half = (int) Math.floor(vector.length / 2.0);
        }

        char[] result = new char[half];
        for (int i = 0; i < half; i++) {
            result[i] = vector[i];
        }
        return result;
    }

    // Exercício2
    static void exercicio2() {
        //merge({1,2},{9,10})
        System.out.println("Exercício 2");
        int[] vector1 = {1, 2};
        int[] vector2 = {9, 10};
        int[] result = merge(vector1, vector2);
        printVector(result);
        System.out.println();
    }

    static int[] merge(int[] vector1, int[] vector2) {
        int result[] = new int[vector1.length + vector2.length];

        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i];
        }
        for (int j = vector1.length; j < vector1.length + vector2.length; j++) {
            result[j] = vector2[j - vector1.length];
        }
        return result;
    }

    static char[] merge(char[] vector1, char[] vector2) {
        char result[] = new char[vector1.length + vector2.length];

        int x = 0;
        for (int i = 0; i < vector1.length; i++) {
            result[x] = vector1[i];
            x++;
        }
        for (int j = 0; j < vector2.length; j++) {
            result[x] = vector2[j];
            x++;
        }
        return result;
    }

    // Exercício3
    static void exercicio3() {
        //invert({t,q,a)}->{a,q,t}
        System.out.println("Exercício 3");
        char[] vector1 = {'t', 'q', 'a'};
        char[] result = invert(vector1);
        printVector(result);
        System.out.println();
    }

    static char[] invert(char[] vector) {
        char[] result = new char[vector.length];
        int i = 0;                  // position on result
        int j = vector.length - 1;  // position on input vector
        while (i < vector.length) {
            result[i] = vector[j];
            i++;
            j--;
        }
        return result;
    }

    static int[] invert(int[] vector) {
        int[] result = new int[vector.length];
        int i = 0;                  // position on result
        int j = vector.length - 1;  // position on input vector
        while (i < vector.length) {
            result[i] = vector[j];
            i++;
            j--;
        }
        return result;
    }


    // Exercício4
    static void exercicio4() {
        //duplicateEveryElement({a,s,d})->{a,a,s,s,d,d}
        System.out.println("Exercício 4");
        char[] vector1 = {'a', 's', 'd'};
        char[] result = duplicateEveryElement(vector1);
        for (char x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static char[] duplicateEveryElement(char[] vector) {
        char[] result = new char[vector.length * 2];
        for (int i = 0; i < vector.length; i++) {
            result[i * 2] = vector[i];
            result[i * 2 + 1] = vector[i];
        }
        return result;
    }


    // Exercício5
    static void exercicio5() {
        //duplicateInverted({3,2,1})->(3,2,1,1,2,3)
        System.out.println("Exercício 5");
        int[] vector1 = {3, 2, 1};
        int[] result = duplicateInverted(vector1);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    static int[] duplicateInverted(int[] vector) {
        int[] result = merge(vector, invert(vector));
        return result;
    }

    // Exercício6
    static void exercicio6() {
        //copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}
        System.out.println("Exercício 6");
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] result = copyWithoutMiddleElement(vector1);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int[] copyWithoutMiddleElement(int[] vector) {
        if (vector.length % 2 != 0) {
            int before_middle = vector.length / 2 - 1; // position before middle
            int after_middle = before_middle + 2;      // position after middle
            return merge(subarry(0, before_middle, vector), subarry(after_middle, vector.length - 1, vector));
        } else {
            return vector;
        }
    }

    static char[] copyWithoutMiddleElement(char[] vector) {
        if (vector.length % 2 != 0) {
            int before_middle = vector.length / 2 - 1; // position before middle
            int after_middle = before_middle + 2;      // position after middle
            return merge(subarry(0, before_middle, vector), subarry(after_middle, vector.length - 1, vector));
        } else {
            return vector;
        }
    }

    // Exercício7
    static void exercicio7() {
        /*fibonacciSequence(7)->{0,1,1,2,3,5,8}
         * https://en.wikipedia.org/wiki/Fibonacci_number
         * F(0) = 0;  F(1) = 1; F(n) = F(n-1) + F(n+2)
         * */
        System.out.println("Exercício 7");
        int[] result = fibonacciSequence(7);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int[] fibonacciSequence(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[0] = 0;
            } else if (i == 1) {
                result[1] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result;
    }

    public static void printVector(int[] vect) {
        System.out.print("{ " + vect[0]);
        for (int i = 1; i < vect.length; i++) {
            System.out.print(", " + vect[i]);
        }
        System.out.print(" }");
        System.out.println();
    }

    public static void printVector(char[] vect) {
        System.out.print("{ " + vect[0]);
        for (int i = 1; i < vect.length; i++) {
            System.out.print(", " + vect[i]);
        }
        System.out.print(" }");
        System.out.println();
    }

}
