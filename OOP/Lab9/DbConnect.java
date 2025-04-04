package Lab9;
import java.sql.*;

public class DbConnect {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Employee_DB"; 
        String user = "postgres"; 
        String password = "postgres"; 

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Успешное подключение к PostgreSQL!");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка подключения: " + e.getMessage());
        }
       
    }
}
