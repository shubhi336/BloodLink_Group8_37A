package Databasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql implements Database {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "IT$universe31";
    private static final String URL = "jdbc:mysql://localhost:3306/bloodlink?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";


    public static void main(String[] args) {
        // Optional: test the connection here
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Connection test passed.");
        } else {
            System.out.println("Connection test failed.");
        }
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC Driver
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("✅ getConnection(): Connected successfully");
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ getConnection(): Connection failed - " + e.getMessage());
        }
        return null;
    }

    public static void closeConnection(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Connection openConnection() {
        return getConnection();
    }

    @Override
    public void CloseConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("🔌 Connection closed");
            }
        } catch (SQLException e) {
            System.out.println("❌ Close Error: " + e.getMessage());
        }
    }

    @Override
    public ResultSet runQuery(Connection conn, String query) {
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("❌ Query Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public int executeUpdate(Connection conn, String query) {
        try {
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("❌ Update Error: " + e.getMessage());
            return -1;
        }
    }
}
