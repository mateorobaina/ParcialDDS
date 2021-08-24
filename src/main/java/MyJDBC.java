import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url= "jdbc:mysql://localhost:3306/parcialdds", user "root", password: "juan12345");

        Statement statement = connection.createStatement();
    }
}
