package birds;

/**
 * Superclass umum burung yang merepresentasikan karakteristik universal.
 * Tidak memaksakan method fly() pada seluruh burung agar tidak melanggar LSP.
 * Memenuhi Liskov Substitution Principle (LSP).
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class Bird {

    public void eat() {
        System.out.println("Bird is eating food peacefully.");
    }
}
