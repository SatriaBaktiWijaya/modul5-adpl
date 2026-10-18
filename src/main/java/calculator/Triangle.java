package calculator;

/**
 * Implementasi bentuk Segitiga (fitur baru yang ditambahkan tanpa perlu mengubah AreaCalculator).
 * Memenuhi Open-Closed Principle (OCP).
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
