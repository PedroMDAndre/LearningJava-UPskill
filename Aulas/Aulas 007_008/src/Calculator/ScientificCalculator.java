package Calculator;
import java.lang.Math;

public class ScientificCalculator extends Calculator {
    // Attributes


    // Constructor
    public ScientificCalculator() {
        super();
    }


    // Methods
    public double raizQuadrada(double num){
        return Math.sqrt(num);
    }

    public double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
}
