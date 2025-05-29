
import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection con = DBconnection.connect();
        if (con != null) {
            System.out.println("Connection is successful!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
