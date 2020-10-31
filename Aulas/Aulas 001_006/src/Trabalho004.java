public class Trabalho004 {
    /*
    1. Criar uma função que mostre a soma de todos os números no intervalo de 1 até 100
    utilizando o While.
    2. Criar uma função que mostre a soma de todos os números no intervalo de 1 até 100
    utilizando o For.
    3. Criar uma função que devolva o número de divisores de um número inteiro n . Esta
    função deverá iterar sobre os números naturais até n , contando os números que são
    divisores de n .
    4. Criar uma função que devolva o somatório dos divisores próprios de um número
    inteiro n (o conjunto dos divisores exclui o próprio número). Esta função deverá iterar
    sobre os números naturais até n (exclusive), acumulando os números que são divisores
    de n .
    5. Criar uma função que que recebe como argumento um número natural e devolve
    verdadeiro caso seja primo, ou falso caso contrário.
    6. Criar uma função que permite saber se existe algum número primo num dado
    intervalo (aberto).
    */
    public static void main(String[] args) {
        somaWhile1_100();
        somaFor1_100();

        int n = 3;
        System.out.println("\nO número de divisores de " + n + " é " + n_divisores(n));
        System.out.println("\nA soma dos divisores de " + n + " é " + soma_divisores(n));
        System.out.println("\n" + n + " é primo? " + isPrime(n));
        System.out.println("\nExiste algum primo no intervalo [8, 11[? " + prime_in_intervalQ(8,9));
    }

    // Exercício 1
    static void somaWhile1_100() {
        int i = 1;
        int resultado = 0;
        while (i < 101) {
            resultado += i;
            i++;
        }
        System.out.println("A soma dos números até 100 é: " + resultado);
    }

    // Exercício 2
    static void somaFor1_100() {
        int resultado = 0;
        for (int i = 1; i < 101; i++) {
            resultado += i;
        }
        System.out.println("A soma dos números até 100 é: " + resultado);
    }

    // Exercício 3
    static int n_divisores(int n){
        int n_divisores = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                n_divisores++;
            }
        }
        return n_divisores;
    }

    // Exercício 4
    static int soma_divisores(int n){
        int soma = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                soma += i;
            }
        }
        return soma;
    }

    // Exercício 5
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    // Exercício 6
    static boolean prime_in_intervalQ(int a, int b){
        for (int i = a; i < b; i++){
            System.out.println(i);
            if (isPrime(i)){
                return true;
            }
        }
        return false;
    }

}
