
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TRUONG THI NGOC NHI
 */
public class JDBCutil {
     private static final String URL = "jdbc:mysql://localhost:3306/cnm?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC"; // Đổi testdb thành database của bạn
    private static final String USER = "root"; // Đổi user nếu cần
    private static final String PASSWORD = ""; // Đổi mật khẩu nếu cần

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối MySQL thành công!");
        } catch (SQLException e) {
            System.out.println("Kết nối MySQL thất bại!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Đóng kết nối thành công!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

