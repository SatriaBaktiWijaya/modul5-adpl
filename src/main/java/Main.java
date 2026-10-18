import services.EmailService;
import services.UserRepository;
import services.UserService;
import calculator.AreaCalculator;
import calculator.Circle;
import calculator.Rectangle;
import calculator.Triangle;
import birds.Bird;
import birds.Chicken;
import birds.FlyingBird;

/**
 * Demonstrasi pengujian prinsip SOLID Part 1 (SRP, OCP, LSP).
 * Praktikum Pemrograman Berorientasi Objek - Modul 5.
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("  PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK - MODUL 5");
        System.out.println("  Nama : Satria Bakti Wijaya (109092500017)");
        System.out.println("  Tema : Penerapan Prinsip SOLID Part 1 (SRP, OCP, LSP)");
        System.out.println("============================================================\n");

        // 1. PENGUJIAN SINGLE RESPONSIBILITY PRINCIPLE (SRP)
        System.out.println(">>> 1. Pengujian Single Responsibility Principle (SRP) <<<");
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();
        UserService userService = new UserService(userRepository, emailService);
        userService.createUser("satriabakti", "satria@telkomuniversity.ac.id");
        System.out.println("[Sukses] Tanggung jawab pembuatan user, database, dan email terpisah mandiri.\n");

        // 2. PENGUJIAN OPEN-CLOSED PRINCIPLE (OCP)
        System.out.println(">>> 2. Pengujian Open-Closed Principle (OCP) <<<");
        AreaCalculator calculator = new AreaCalculator();
        Rectangle rect = new Rectangle(10, 5);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(6, 8); // Fitur baru tanpa mengubah AreaCalculator

        System.out.println("Luas Persegi Panjang (10 x 5) : " + calculator.calculateArea(rect));
        System.out.printf("Luas Lingkaran (r = 7)        : %.2f\n", calculator.calculateArea(circle));
        System.out.println("Luas Segitiga (alas 6, t 8)   : " + calculator.calculateArea(triangle));
        System.out.println("[Sukses] Perluasan bentuk baru dapat ditambahkan tanpa memodifikasi kalkulator.\n");

        // 3. PENGUJIAN LISKOV SUBSTITUTION PRINCIPLE (LSP)
        System.out.println(">>> 3. Pengujian Liskov Substitution Principle (LSP) <<<");
        Bird umum = new Bird();
        FlyingBird merpati = new FlyingBird();
        Chicken ayam = new Chicken();

        System.out.print("Objek Bird umum   : ");
        umum.eat();

        System.out.print("Objek FlyingBird  : ");
        merpati.eat();
        System.out.print("Kemampuan Terbang : ");
        merpati.fly();

        System.out.print("Subclass Chicken  : ");
        ayam.eat(); // Substitusi Bird berjalan sempurna tanpa error!
        ayam.cluck();
        System.out.println("[Sukses] Objek Chicken dapat menggantikan Bird tanpa melempar UnsupportedOperationException.");
        System.out.println("\n============================================================");
        System.out.println("  SELURUH PENGUJIAN PRINSIP SOLID BERHASIL DILAKSANAKAN");
        System.out.println("============================================================");
    }
}
