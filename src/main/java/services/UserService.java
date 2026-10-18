package services;

/**
 * Tanggung jawab khusus untuk logika bisnis pembuatan pengguna.
 * Mengkoordinasikan UserRepository dan EmailService tanpa mencampurkan
 * logika query database atau pengiriman email secara langsung.
 * Memenuhi Single Responsibility Principle (SRP).
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class UserService {

    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void createUser(String username, String email) {
        System.out.println("Creating user: " + username);
        userRepository.saveUser(username, email);
        emailService.sendNotification(email);
    }
}
