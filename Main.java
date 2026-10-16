import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String URL="jdbc:mysql://localhost:3306/yulia_db";
        String username="root";
        String password="root";

        Connection connection;
        try{
            connection=DriverManager.getConnection(URL, username, password);
            System.out.println("Connection Established ! with db ");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
