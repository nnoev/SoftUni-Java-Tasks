package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.Scanner;

public class _06_Remove_Villain {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        int villainId = Integer.parseInt(scanner.nextLine());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "Looneytunes1!");

        String villainName = getVillainName(connection, villainId);
        int numberOfMinions = getNumberOfMinions(connection, villainId);
        if (villainName.equals("No such villain was found")) {
            System.out.println("No such villain was found");
            return;
        } else {
            deleteFromMV(connection, villainId);
            deleteVillain(connection, villainId);
            System.out.printf("%s was deleted%n%d minions released", villainName, numberOfMinions);
        }
    }

    private static int getNumberOfMinions(Connection connection, int villainId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT count(minion_id) from minions_villains\n" +
                "WHERE villain_id = ?");
        statement.setInt(1, villainId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return resultSet.getInt(1);
        } else {
            return 0;
        }


    }

    private static String getVillainName(Connection connection, int villainId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select name from villains where id=?");
        statement.setInt(1, villainId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return resultSet.getString("name");
        } else return "No such villain was found";
    }

    private static void deleteVillain(Connection connection, int villainId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE from villains\n" +
                "WHERE id=?");
        statement.setInt(1, villainId);
        statement.executeUpdate();
    }

    private static void deleteFromMV(Connection connection, int villainId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE from minions_villains\n" +
                "WHERE villain_id=?");
        statement.setInt(1, villainId);
        statement.executeUpdate();
    }

}
