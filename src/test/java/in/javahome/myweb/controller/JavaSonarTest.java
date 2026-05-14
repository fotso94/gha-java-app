import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JavaSonarTest {

    public void badMethod() {
        int unusedNumber = 10;

        if (true) {
            System.out.println("This is bad code");
        }
    }

    public void duplicatedMethodOne() {
        System.out.println("duplicate");
        System.out.println("duplicate");
        System.out.println("duplicate");
    }

    public void duplicatedMethodTwo() {
        System.out.println("duplicate");
        System.out.println("duplicate");
        System.out.println("duplicate");
    }

}
