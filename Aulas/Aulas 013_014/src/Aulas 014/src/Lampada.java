public class Lampada {
    private int potencia;

    public Lampada(int potencia) {
        this.potencia = potencia;  // Watts
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Lâmpada de " + potencia + " W";
    }
}
