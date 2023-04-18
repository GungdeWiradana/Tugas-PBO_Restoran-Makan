import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Login user_login = new Login();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=============================");
        System.out.println("Masukkan Username Untuk Login");
        System.out.print("Masukkan UserName Anda : ");
        String user = bf.readLine();
        System.out.print("Masukkan Password Anda : ");
        String password = bf.readLine();
        System.out.println("=============================");
        if (user.equals(user_login.getUser()) && password.equals(user_login.getPassword_user()) || user.equals(user_login.getAdmin()) && password.equals(user_login.getPassword_admin())) {
            if (user.equals(user_login.getUser())) {
                System.out.println("Selamat datang User");
            } else if (user.equals(user_login.getAdmin())) {
                System.out.println("Selamat datang Admin");
            }
        }

    }
}