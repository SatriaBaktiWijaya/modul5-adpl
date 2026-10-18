package calculator;

/**
 * Implementasi bentuk Lingkaran yang memenuhi kontrak Shape.
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
