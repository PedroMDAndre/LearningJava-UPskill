package Exercício1;

public class Quadrado implements FiguraGeometricaPlana {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void
    setLado() {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro() {
        int permimetro = 0;
        int perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Quadrado";
    }
}
