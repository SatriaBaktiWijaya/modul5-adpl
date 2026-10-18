package calculator;

/**
 * Implementasi bentuk Persegi Panjang yang memenuhi kontrak Shape.
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
