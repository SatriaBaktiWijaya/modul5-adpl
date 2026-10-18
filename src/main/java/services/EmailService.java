package services;

/**
 * Tanggung jawab khusus untuk pengiriman pesan notifikasi dan email ke pengguna.
 * Memenuhi Single Responsibility Principle (SRP).
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class EmailService {

    public void sendNotification(String email) {
        System.out.println("Sending welcome email to: " + email);
    }
}
