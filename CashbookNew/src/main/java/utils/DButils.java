package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
    public static Connection getConnection () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
}
