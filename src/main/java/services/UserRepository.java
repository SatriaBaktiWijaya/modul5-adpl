package services;

/**
 * Tanggung jawab khusus untuk operasi persistensi dan manipulasi basis data pengguna.
 * Memenuhi Single Responsibility Principle (SRP).
 * 
 * @author Satria Bakti Wijaya (109092500017)
 */
public class UserRepository {

    public void saveUser(String username, String email) {
        String sql = "INSERT INTO users (username, email) VALUES ('" + username + "', '" + email + "')";
        System.out.println("Executing SQL: " + sql);
    }
}
