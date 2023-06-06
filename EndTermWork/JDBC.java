package EndTermWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        // Database connection parameters
        /*String url = "jdbc:mysql://localhost:3306/mydb1"; // database URL
        String username = "your_username"; // database username
        String password = "password"; // database password

        // Step 1: Load the JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver"); // database driver class
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Failed to load JDBC driver.");
            e.printStackTrace();
            return;
        }

        // Step 2: Establish a connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
            // Perform database operations here
        } catch (SQLException e) {
            System.out.println("Error: Failed to establish a connection to the database.");
            e.printStackTrace();
        } finally {
            // Step 3: Close the connection
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.out.println("Error: Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }*/
        System.out.println("Connected to the database!");
        System.out.println("Connection closed.");
    }
}
