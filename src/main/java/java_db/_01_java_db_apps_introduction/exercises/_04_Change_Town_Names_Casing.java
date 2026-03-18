package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _04_Change_Town_Names_Casing {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "Looneytunes1!");
        String country = scanner.nextLine();
        int towns = checkIfTownsExists(connection,country);
        if (towns==0){
            System.out.println("No town names were affected.");
        }else {
            changeTownNamesToUpperCase(connection, country);
            ArrayList<String> townList = getChangedTowns(connection, country);
            System.out.printf("%d town names were affected.%n",towns);
            System.out.println(townList.toString());
        }
    }

    private static ArrayList getChangedTowns(Connection connection, String country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select name from towns WHERE country= ?;");
        statement.setString(1,country);
        ResultSet resultSet = statement.executeQuery();
        ArrayList<String> towns = new  ArrayList<>();
        while (resultSet.next()){
            towns.add(resultSet.getString("name"));
        }
        return towns;
    }

    private static int checkIfTownsExists(Connection connection, String country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) from towns WHERE country=?;");
        statement.setString(1,country);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()) return 0;
        return resultSet.getInt(1);
    }

    private static void changeTownNamesToUpperCase(Connection connection, String country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE towns SET name = upper(name) WHERE country = ?;");
        statement.setString(1,country);
        statement.executeUpdate();
    }


}
