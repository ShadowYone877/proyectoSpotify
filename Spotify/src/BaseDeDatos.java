import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BaseDeDatos {
    private static final String URL = "jdbc:postgresql://localhost:5432/spotify";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Spotify";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
