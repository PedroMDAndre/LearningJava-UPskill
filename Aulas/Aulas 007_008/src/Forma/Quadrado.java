package Forma;

public class Quadrado extends Rectangulo {
    // Attributes


    // Constructors
    public Quadrado(float lado) {
        super(lado, lado);
    }


    // Methods
    @Override
    public String toString() {
        String resultado = "Quadrado:\nLado: " + getLado()
                + "\nArea: " + calcularArea() + "\tPerímetro: " + cacularPerimetro();
        return resultado;
    }

}
