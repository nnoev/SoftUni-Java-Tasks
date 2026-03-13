package java_db._01_java_db_apps_introduction.lab;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _02_Accessing_Database_via_Simple_Java_Application_2 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String jdbc = "jdbc:mysql://localhost:3306/diablo";
        String user = "root";
        String pass = "Looneytunes1!";
        Properties properties = new Properties();
        properties.setProperty("user",user);
        properties.setProperty("password",pass);
        Connection connection = DriverManager.getConnection(jdbc,properties);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT u.user_name,u.first_name,u.last_name, count(ug.game_id) as played from users u JOIN users_games ug ON u.id=ug.user_id WHERE u.user_name = ? GROUP BY u.user_name, u.first_name, u.last_name;");
        String name = scanner.nextLine();
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String userName = resultSet.getString("u.user_name");
            String firstName = resultSet.getString("u.first_name");
            String lastName = resultSet.getString("u.last_name");
            String gamesPlayed = resultSet.getString("played");
            System.out.printf("User: %s%n",userName);
            System.out.printf("%s %s has played %s games",firstName,lastName,gamesPlayed);
        }
    }

}
