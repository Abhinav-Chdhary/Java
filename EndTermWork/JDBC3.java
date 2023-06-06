package EndTermWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class JDBC3 extends JFrame implements ActionListener {
    // JDBC connection parameters
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/exampledb";
    private static final String USERNAME = "your-username";
    private static final String PASSWORD = "your-password";

    private JTextArea sqlTextArea;
    private JTextArea resultTextArea;

    public JDBC3() {
        setTitle("SQL Executor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create components
        sqlTextArea = new JTextArea(10, 50);
        JButton executeButton = new JButton("Execute");
        executeButton.addActionListener(this);
        resultTextArea = new JTextArea(10, 50);
        resultTextArea.setEditable(false);

        // Create scroll panes for text areas
        JScrollPane sqlScrollPane = new JScrollPane(sqlTextArea);
        JScrollPane resultScrollPane = new JScrollPane(resultTextArea);

        // Add components to the frame
        add(sqlScrollPane, BorderLayout.NORTH);
        add(executeButton, BorderLayout.CENTER);
        add(resultScrollPane, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JDBC3 app = new JDBC3();
                app.setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Execute")) {
            String sql = sqlTextArea.getText();

            try {
                // Establish a connection to the database
                Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

                // Create a statement object for executing SQL queries
                Statement statement = connection.createStatement();

                // Execute the SQL statement
                boolean hasResultSet = statement.execute(sql);

                if (hasResultSet) {
                    // If the SQL statement returned a ResultSet, display the result
                    ResultSet resultSet = statement.getResultSet();
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    StringBuilder resultBuilder = new StringBuilder();
                    while (resultSet.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            resultBuilder.append(resultSet.getString(i)).append("\t");
                        }
                        resultBuilder.append("\n");
                    }

                    resultTextArea.setText(resultBuilder.toString());
                } else {
                    // If the SQL statement did not return a ResultSet, display the update count
                    int updateCount = statement.getUpdateCount();
                    resultTextArea.setText("Update Count: " + updateCount);
                }

                // Close the statement and connection
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                resultTextArea.setText("Error: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}

