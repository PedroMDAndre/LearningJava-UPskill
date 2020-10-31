package Trabalho11.Exercicio7;

public class Racional implements Comparable<Racional> {
    // Attributes
    private int num; // numerador
    private int den; // denominador


    // Constructor
    public Racional(int num, int den) {
        this.num = num;
        this.den = den;
    }


    // Methods
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return num + " / " + den;
    }

    @Override
    public int compareTo(Racional o) {
        // Fazer a comparação por numerador
        // Colocar ambos com o mesmo denominador
        // Calcula novo numerador
        int numThis = this.num * o.den;
        int numO = o.num * this.den;

        if (this.den == 0 && o.den == 0) {  // Se denominador for zero nos dois casos considera-se igual
            return 0;
        } else if (this.den == 0) {  // Considera-se se existir um valor com denominador zero que este é o maior
            return 1;
        } else if (o.den == 0) {
            return -1;
        } else if (numThis > numO) {
            return 1;
        } else if (numThis < numO) {
            return -1;
        } else {
            return 0;
        }
    }
}
