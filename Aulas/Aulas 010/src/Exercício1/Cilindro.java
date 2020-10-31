package Exercício1;

public class Cilindro implements FiguraGeometricaTridimensional {
    private int altura;
    private int raio;

    public Cilindro(int altura, int raio) {
        this.altura = altura;
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String getNomeFiguraTridimensional() {
        return "Cilindro";
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public int getVolume() {
        Circulo base = new Circulo(raio);
        return base.getArea() * altura;
    }
}
