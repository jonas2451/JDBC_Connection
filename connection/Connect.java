package group4.heidenliquids.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * creates a connection to a postgres database
 */
public class Connect {

    /**
     *
     * creates a new Connection to a postgres Database
     * @return Connection please save the returned connection into a local variable
     * @throws SQLException when the connection fails
     */
    public static Connection createConnection() throws SQLException{
        try {
            String dbURL = "jdbc:postgresql://localhost:5432/heiden";
            String userName = "postgres";
            String password = "mypassword";

            Connection dbConnection = DriverManager.getConnection(dbURL, userName, password);

            System.out.println("Connected!");

            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
