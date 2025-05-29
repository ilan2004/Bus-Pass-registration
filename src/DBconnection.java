import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static Connection connect() {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish the connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:5396/new", "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database.");
            e.printStackTrace();
        }
        return con;
    }
}
