package Trabalho11.Exercicio2_Aula;

public class Electrodomestico {
    // Attributes
    private String tipo;
    private String marca;
    private int potencia;


    // Constructors
    public Electrodomestico(String tipo, String marca, int potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }


    // Methods
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
