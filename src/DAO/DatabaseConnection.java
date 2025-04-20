package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = 
        "jdbc:sqlserver://localhost:1433;databaseName=cnm;integratedSecurity=true;encrypt=false;trustServerCertificate=true";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load SQL Server driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Bảo đảm Windows Authentication tìm đúng thư viện
            System.setProperty("java.library.path", "C:\\Windows\\System32");

            conn = DriverManager.getConnection(URL);
            System.out.println("Ket noi SQL Server thanh cong!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ket noi that bai:");
            e.printStackTrace();
        }
        return conn;
    }
}
 