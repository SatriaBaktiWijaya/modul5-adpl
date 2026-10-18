package birds;

/**
 * Representasi burung yang memiliki kemampuan terbang.
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class FlyingBird extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying high in the sky!!!");
    }
}
