package Exercício1;

public class Circulo implements FiguraGeometricaPlana {
    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Círculo";
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * raio * raio);
    }

    @Override
    public int getPerimetro() {
        return (int) (2 * Math.PI * raio);
    }
}
