package birds;

/**
 * Subclass Ayam yang merupakan turunan Bird.
 * Karena ayam tidak dapat terbang, ia tidak mengimplementasikan interface Flyable.
 * Ayam dapat menggantikan Bird secara aman tanpa memicu runtime error / exception.
 * Memenuhi Liskov Substitution Principle (LSP).
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class Chicken extends Bird {

    @Override
    public void eat() {
        System.out.println("Chicken pecks corn on the ground.");
    }

    public void cluck() {
        System.out.println("Chickens cannot fly! (I keep on running like a chicken with its head cut off)");
    }
}
