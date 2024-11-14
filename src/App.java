import Service.UserService;
import UI.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        UserService cp = new UserService();
        cp.menu usuarios();
    }
}
