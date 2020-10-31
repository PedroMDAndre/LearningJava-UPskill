package Exercício1;

public class Rectangulo implements FiguraGeometricaPlana {
    int lado;
    int altura;

    public Rectangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Rectângulo";
    }

    @Override
    public int getArea() {
        return lado * altura;
    }

    @Override
    public int getPerimetro() {
        return 2 * (lado + altura);
    }
}
