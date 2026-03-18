package java_db._01_java_db_apps_introduction.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class _05_Remove_Villain {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "Looneytunes1!");
        int villainId = Integer.parseInt(scanner.nextLine());


    }
}
