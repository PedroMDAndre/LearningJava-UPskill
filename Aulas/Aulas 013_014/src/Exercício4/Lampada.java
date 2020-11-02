package Exercício4;

public class Lampada {
    // Attributes
    private int potencia; // potência da lâmpada(em Watts)


    // Constructor
    public Lampada(int potencia){
        this.potencia = potencia;
    }

    // Methods
    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "potencia=" + potencia +
                '}';
    }
}
