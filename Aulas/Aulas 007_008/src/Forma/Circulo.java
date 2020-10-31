package Forma;

import java.lang.Math;

public class Circulo extends Forma {
    // Attributes
    final private float raio;


    // Constructors
    public Circulo(float raio) {
        this.raio = raio;
    }


    // Methods
    public float getRaio() {
        return raio;
    }

    @Override
    public float calcularArea() {
        double area = Math.PI * getRaio() * getRaio();
        return (float) area;
    }

    @Override
    public float cacularPerimetro() {
        double perimetro = 2 * Math.PI * getRaio();
        return (float) perimetro;
    }

    @Override
    public String toString() {
        String resultado = "Círculo:\nRaio: " + getRaio()
                + "\nArea: " + calcularArea() + "\tPerímetro: " + cacularPerimetro();
        return resultado;
    }
}
