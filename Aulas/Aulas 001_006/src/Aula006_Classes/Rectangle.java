package Aula006_Classes;

public class Rectangle {
    // Aula 6 - Exercise C
    // Attributes
    private final double height;
    private final double width;

    // Constructors
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height) {
        // or this(height, height)
        this.height = height;
        this.width = height;
    }

    // Methods

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public boolean isSquare() {
        return width == height;
    }

    public double getHipotenusa() {
        // same as getDiagonal
        return Math.hypot(height, width);
    }

    @Override
    public String toString() {
        return "Rectangle of Heigth: " + height + " and Width: " + width;
    }
}
