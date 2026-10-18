package calculator;

/**
 * Kelas kalkulator luas yang mematuhi Open-Closed Principle (OCP).
 * Terbuka untuk penambahan bentuk baru (Shape) tanpa perlu mengubah kode kalkulator.
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class AreaCalculator {

    public double calculateArea(Shape shape) {
        if (shape == null) {
            throw new IllegalArgumentException("Shape cannot be null");
        }
        return shape.calculateArea();
    }
}
