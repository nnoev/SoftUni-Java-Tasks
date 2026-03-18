package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.Scanner;

public class _02_Get_Minion_Names {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db","root","Looneytunes1!");
        PreparedStatement statement = connection.prepareStatement("\tSELECT m.name, m.age , v.name as vName from minions m\n" +
                "\tJOIN minions_villains mv on m.id=mv.minion_id \n" +
                "    JOIN villains v on mv.villain_id=v.id \n" +
                "\tWHERE mv.villain_id = ?\n" +
                "\t;\n");
        String id = scanner.nextLine();
        statement.setString(1,id);
        ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            String vNama = resultSet.getString("vName");
        System.out.printf("Villain: %s%n",vNama);
        int count = 1;
         do {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.printf("%d. %s %d%n",count,name,age);
            count++;
        }while (resultSet.next());
    }

}
