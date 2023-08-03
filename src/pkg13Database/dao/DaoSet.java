package pkg13Database.dao;

import java.sql.*;

public class DaoSet {
    Connection conn;
    PreparedStatement pstmt;
    Statement stmt;
    ResultSet rs;

    public Connection conn() throws SQLException{
        String driver = "jdbc:mariadb://127.0.0.1:3306/db7";
        String user = "db7", pass = "1234";
        conn = DriverManager.getConnection(driver, user, pass);
        return conn;
    }

    public void closeDB() {
        try {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
