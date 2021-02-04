import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
    /**
     * This method should connect to the database by reading the database details from the db.properties file and it should return the connection object
     * @return Connection to the MySQL database or null when there is some problem connecting to the database
     * @see Connection
     */
    public Connection establishConnection() {
        Properties properties = new Properties();

        try {
            // Creating input stream from db.properties file
            FileInputStream fileInputStream = new FileInputStream("db.properties");
            properties.load(fileInputStream);

            // Getting value of the properties file
            String driver = properties.getProperty("db.classname");
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // Making sure drive jar is available
            Class.forName(driver);

            // Returning a new database connection
            return DriverManager.getConnection(
                    url,
                    username,
                    password
            );
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
