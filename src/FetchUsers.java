import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchUsers {
    public static void main(String[] args) {
        try (Connection con = DBconnection.connect()) {
            String query = "SELECT * FROM Users";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Users in the database:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("user_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Role: " + rs.getString("role"));
                System.out.println("----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
