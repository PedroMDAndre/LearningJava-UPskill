package Calculator;

public abstract class Calculator {
    // Attributes


    // Constructor
    public Calculator() {

    }


    // Methods
    public double sum(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by 0!");
            return 0;
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
