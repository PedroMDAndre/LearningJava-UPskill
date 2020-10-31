package Trabalho11.Exercicio2_3;

public class Eletrodomestico {
    // Attributes
    private String tipo;
    private String marca;
    private int potencia;  // potência elétrica que consome


    // Constructors
    public Eletrodomestico(String tipo, String marca, int potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }


    // Methods
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
