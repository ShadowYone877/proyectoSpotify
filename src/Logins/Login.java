package Logins;
import Basededatos.Base;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Login {
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM Usuarios WHERE Usuario = ? AND Contraseña = ?";
        try (Connection connection = Base.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, username);
            statement.setString(2, password);

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException i) {
            System.out.println("Error en la autenticación: " + i.getMessage());
        }
        return false; 
    }
}
