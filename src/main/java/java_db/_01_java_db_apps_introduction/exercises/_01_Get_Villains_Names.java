package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;

public class _01_Get_Villains_Names {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db","root","Looneytunes1!");
        PreparedStatement statement = connection.prepareStatement("SELECT v.name,count(mv.minion_id) num from villains v\n" +
                "JOIN minions_villains mv on v.id=mv.villain_id\n" +
                "GROUP BY v.name\n" +
                "HAVING num>15\n" +
                "ORDER BY num DESC\n" +
                ";");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
        String name = resultSet.getString("name");
        int num = resultSet.getInt("num");
            System.out.printf("%s %s%n", name ,num );
        }
    }
}
