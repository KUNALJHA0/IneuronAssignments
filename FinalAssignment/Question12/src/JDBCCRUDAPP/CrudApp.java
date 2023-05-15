package JDBCCRUDAPP;

import java.sql.*;

public class CrudApp {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306//octbatch";
        String username = "root";
        String password = "root123";
        
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            // Insert new record
            String insertSql = "INSERT INTO mytable (name, age) VALUES (?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSql);
            insertStatement.setString(1, "John");
            insertStatement.setInt(2, 30);
            insertStatement.executeUpdate();

            // Select all records
            String selectSql = "SELECT * FROM mytable";
            Statement selectStatement = connection.createStatement();
            ResultSet resultSet = selectStatement.executeQuery(selectSql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Update record
            String updateSql = "UPDATE mytable SET age = ? WHERE name = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateSql);
            updateStatement.setInt(1, 35);
            updateStatement.setString(2, "John");
            updateStatement.executeUpdate();

            // Delete record
            String deleteSql = "DELETE FROM mytable WHERE name = ?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteSql);
            deleteStatement.setString(1, "John");
            deleteStatement.executeUpdate();

            resultSet.close();
            insertStatement.close();
            selectStatement.close();
            updateStatement.close();
            deleteStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
