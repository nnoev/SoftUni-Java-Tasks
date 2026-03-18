package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.Collection;
import java.util.Scanner;

public class _09_Increase_Age_Stored_Procedure {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db","root","Looneytunes1!");
        int id = Integer.parseInt(scanner.nextLine());
        useProcedure(connection,id);
        PreparedStatement statement = connection.prepareStatement("select name,age from minions where id=?;");
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        System.out.printf("%s %d",resultSet.getString("name"),resultSet.getInt("age"));

    }

    private static void useProcedure(Connection connection, int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("call usp_get_older(?);");
        statement.setInt(1,id);
        statement.executeQuery();
    }

}
