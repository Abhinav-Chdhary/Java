package EndTermWork;

import java.sql.*;

public class JDBC2 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/exampledb";
    private static final String USERNAME = "my-username";
    private static final String PASSWORD = "my-password";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            createTable(connection);
            insertRecord(connection, 1, "John Doe", 25);
            retrieveRecords(connection);
            deleteRecord(connection, 1);
            retrieveRecords(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableQuery);
        statement.close();
    }

    private static void insertRecord(Connection connection, int id, String name, int age) throws SQLException {
        String insertQuery = "INSERT INTO employees (id, name, age) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, age);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private static void retrieveRecords(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM employees";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);

        System.out.println("Records in the table:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        resultSet.close();
        statement.close();
    }

    private static void deleteRecord(Connection connection, int id) throws SQLException {
        String deleteQuery = "DELETE FROM employees WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}

