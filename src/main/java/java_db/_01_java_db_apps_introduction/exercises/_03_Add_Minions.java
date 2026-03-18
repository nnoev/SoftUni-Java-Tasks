package java_db._01_java_db_apps_introduction.exercises;

import java.sql.*;
import java.util.Scanner;

public class _03_Add_Minions {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "Looneytunes1!");
        String[] minions = scanner.nextLine().split(" ");
        String minionName = minions[1];
        int minionAge = Integer.parseInt(minions[2]);
        String minionTown = minions[3];
        String[] villains = scanner.nextLine().split(" ");
        String villainName = villains[1];
        int townId = getTownId(connection, minionTown);
        int villainId = getVillainId(connection, villainName);
        int minionId = getMinionId(connection, minionName, minionAge,townId);
        makeVillainMinionRelation(connection, villainId, minionId);
        System.out.printf("Successfully added %s to be minion of %s.%n", minionName, villainName);
    }

    private static void makeVillainMinionRelation(Connection connection, int villainId, int minionId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into minions_villains value(?,?)");
        statement.setInt(1,minionId);
        statement.setInt(2,villainId);
        statement.executeUpdate();
    }

    private static int getMinionId(Connection connection, String minionName, int minionAge,int townId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into minions (name,age,town_id)value (?,?,?)", Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, minionName);
        statement.setInt(2, minionAge);
        statement.setInt(3, townId);
        statement.executeUpdate();
        ResultSet resultSet = statement.getGeneratedKeys();
        resultSet.next();
        return resultSet.getInt(1);
    }

    public static int getTownId(Connection connection, String minionTown) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from towns WHERE name = ?;");
        statement.setString(1, minionTown);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) return resultSet.getInt(1);
        PreparedStatement insertStatement = connection.prepareStatement("insert into towns (name) value(?)", Statement.RETURN_GENERATED_KEYS);
        insertStatement.setString(1, minionTown);
        insertStatement.executeUpdate();
        ResultSet insertResult = insertStatement.getGeneratedKeys();
        insertResult.next();
        System.out.printf("Town %s was added to the database.%n", minionTown);
        return insertResult.getInt(1);
    }

    public static int getVillainId(Connection connection, String villainName) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from villains WHERE name = ?;");
        statement.setString(1, villainName);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) return resultSet.getInt(1);
        PreparedStatement insertStatement = connection.prepareStatement("insert into villains (name,evilness_factor) value(?,'evil')", Statement.RETURN_GENERATED_KEYS);
        insertStatement.setString(1, villainName);
        insertStatement.executeUpdate();
        ResultSet insertResult = insertStatement.getGeneratedKeys();
        insertResult.next();
        System.out.printf("Villain %s was added to the database.%n", villainName);
        return insertResult.getInt(1);
    }
}
