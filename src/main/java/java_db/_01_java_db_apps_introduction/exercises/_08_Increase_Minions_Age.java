package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class _08_Increase_Minions_Age {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "Looneytunes1!");
        int[] ids = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        updateAge(connection,ids);
        printMinions(connection);
    }

    private static void printMinions(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select name,age from minions");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            System.out.printf("%s %d%n",resultSet.getString("name"),resultSet.getInt("age"));
        }
    }

    private static void updateAge(Connection connection, int[] ids) throws SQLException {
        for (int i = 0; i < ids.length; i++) {
            PreparedStatement statement = connection.prepareStatement("UPDATE minions set name=lower(name),age = age +1 where id =?;");
            statement.setInt(1,ids[i]);
            statement.executeUpdate();
        }
    }
}
