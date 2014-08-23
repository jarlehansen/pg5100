import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/tools/server/db-files/h2-demo", "sa", "sa")) {
            Statement statement = connection.createStatement();
            // List all tables
            ResultSet resultSet = statement.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES");

            System.out.println("Default tables");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }
    }
}
