package Forma;

public class Rectangulo extends Forma {
    // Attributes
    final private float lado;
    final private float altura;


    // Constructors
    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    // Methods
    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public float calcularArea() {
        return getLado() * getAltura();
    }

    @Override
    public float cacularPerimetro() {
        return 2 * (getLado() + getAltura());
    }

    @Override
    public String toString() {
        String resultado = "Rectângulo:\nLado: " + getLado() + "\tAltura: " + getAltura()
                + "\nArea: " + calcularArea() + "\tPerímetro: " + cacularPerimetro();
        return resultado;
    }
}
