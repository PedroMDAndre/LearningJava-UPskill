package Trabalho006_Classes;

import java.lang.Math;

public class Calculator {
    // Attributes
    private String[] historic;


    // Constructors
    public Calculator() {
        this.historic = new String[0];
    }


    // Methods
    public double add(double a, double b) {
        double result = a + b;
        this.saveToHistoric(a + " + " + b + " = " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        this.saveToHistoric(a + " - " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        this.saveToHistoric(a + " x " + b + " = " + result);
        return result;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            this.saveToHistoric(a + " / " + b + " => Cannot divide by zero");
            return 0; // (?) How should we handle this?
        }
        double result = a / b;
        this.saveToHistoric(a + " / " + b + " = " + result);
        return result;
    }

    public double pow(double a, double b) {
        double result = Math.pow(a, b);
        this.saveToHistoric(a + "^" + b + " = " + result);
        return result;
    }

    public double divRemainder(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            this.saveToHistoric(a + " % " + b + " => Cannot divide by zero");
            return 0; // (?) How should we handle this?
        }
        double result = a % b;
        this.saveToHistoric(a + " % " + b + " = " + result);
        return result;
    }

    public double[] quadraticFormula(double a, double b, double c) {
        // a.x^2 + b.x + c == 0
        double[] result = new double[2];
        if ((b * b - 4 * a * c) < 0) {
            System.out.println("The results are complex roots");
            this.saveToHistoric(a + " .x^2 + " + b + " .x + " + c + " == 0 => The results are complex roots");
            result[0] = 0;
            result[1] = 0;
            return result; // (?) How should we handle this?
        } else {
            result[0] = -b - Math.sqrt(b * b - 4 * a * c) / (2 * a);
            result[1] = -b + Math.sqrt(b * b - 4 * a * c) / (2 * a);
            this.saveToHistoric(a + " .x^2 + " + b + " .x + " + c + " == 0 => The roots are: " + result[0] + " and " + result[1]);
            return result;
        }
    }

    public void saveToHistoric(String operation) {
        String[] result = new String[this.historic.length + 1];
        result[0] = operation;
        for (int i = 1; i <= this.historic.length; i++) {
            result[i] = this.historic[i - 1];
        }
        this.historic = result;
    }

    public void printHistoric() {
        for (String x : this.historic) {
            System.out.println(x);
        }
    }

    public void printHistoric(int nr_results) {
        int max_len = nr_results;
        if (nr_results > this.historic.length) {
            max_len = this.historic.length;
        }

        for (int i = 0; i < max_len; i++) {
            System.out.println(this.historic[i]);
        }
    }
}