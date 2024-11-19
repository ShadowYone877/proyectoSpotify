import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Login login = new Login();

        System.out.println("==== BIENVENIDO ====");
        System.out.print("Usuario: ");
        String username = ingreso.nextLine();

        System.out.print("Contraseña: ");
        String password = ingreso.nextLine();

        if (login.authenticate(username, password)) {
            System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + username);
        } else {
            System.out.println("Usuario o contraseña incorrectas. Intelo nuevamente");
        }

    }
}
