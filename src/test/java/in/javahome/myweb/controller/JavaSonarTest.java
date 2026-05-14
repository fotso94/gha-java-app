import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VulnerableApp {

    public void login(String username) {

        String password = "admin123"; // Hardcoded password

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    password
            );

            Statement stmt = conn.createStatement();

            // SQL Injection vulnerability
            String query = "SELECT * FROM users WHERE username = '" + username + "'";

            stmt.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
