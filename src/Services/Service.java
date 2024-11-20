package Services;
import Logins.Login;
import java.util.Scanner;

public class Service{
    public void menu(){
        try(Scanner ingreso = new Scanner(System.in)){ 
        Login login = new Login();

        System.out.println("BIENVENIDO");
        System.out.print("Usuario: ");
        String username = ingreso.nextLine();

        System.out.print("Contraseña: ");
        String password = ingreso.nextLine();
        
            if (login.authenticate(username, password)) {
            System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + username + password);
            } else {
            System.out.println("Usuario o contraseña incorrectas. Intelo nuevamente");
            }
        }
    }
}