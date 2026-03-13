package java_db._01_java_db_apps_introduction.lab;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _01_Accessing_Database_via_Simple_Java_Application_1 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String jdbc = "jdbc:mysql://localhost:3306/soft_uni";
        String user = "root";
        String pass = "Looneytunes1!";
        Properties properties = new Properties();
        properties.setProperty("user",user);
        properties.setProperty("password",pass);
        Connection connection = DriverManager.getConnection(jdbc,properties);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT concat(first_name,' ',last_name)as name FROM employees WHERE salary > ?");
        double salary = Double.parseDouble(scanner.nextLine());
        preparedStatement.setDouble(1,salary);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            System.out.printf("%s%n",name);
        }
    }

}
