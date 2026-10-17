package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    // public static java.sql.Connection
    public static Connection getConnection() throws SQLException{
        String URL="jdbc:mysql://localhost:3306/yulia_db";

        String username="root";
        String password="root";
        return DriverManager.getConnection(URL, username, password);
    }
}
