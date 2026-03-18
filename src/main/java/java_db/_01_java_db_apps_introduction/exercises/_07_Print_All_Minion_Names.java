package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.ArrayList;

public class _07_Print_All_Minion_Names {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "Looneytunes1!");
        ArrayList<String> minionsNames = getNames(connection);

        while (!minionsNames.isEmpty()){
            System.out.println(minionsNames.removeFirst());
            if (minionsNames.isEmpty()){
                break;
            }else {
                System.out.println(minionsNames.removeLast());
            }
        }

    }
    public  static  ArrayList<String> getNames(Connection connection) throws SQLException {
        ArrayList<String> names = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT name from minions;");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
           names.add(resultSet.getString("name"));
        }
        return names;
    }
}
