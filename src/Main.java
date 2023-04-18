import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user, password;
        int menu_resto;
        int menu_order;
//        new object
        Scanner scanner = new Scanner(System.in);
        Login user1 = new Login();
        Admin restaurant = new Admin();
        Admin menu = new Admin();
        boolean loggiedin = false;

        while(loggiedin == false) {
            System.out.println("=============  Login  ===========");
            System.out.print("| Silahkan Masukan Username Anda : ");user = scanner.next();
            System.out.print("| Silahkan Masukan Password Anda : ");password = scanner.next();
            System.out.println("=================================");


            if (user.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user()) || user.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin())) {
                int ulang;
                loggiedin = true;
                if (user.equals(user1.getUsername_user())) {
                    do {
                        System.out.println("=========== MENU PELANGGAN ===========");
                        System.out.println("| 1. Pesan                            ");
                        System.out.println("| 2. Lihat Pesanan                    ");
                        System.out.println("| 3. Masuk Kembali                    ");
                        System.out.println("| 4. Keluar                           ");
                        System.out.println("======================================");
                        System.out.print("Masukan Pilihan Yang Anda Ingin Pilih ? ");
                        menu_order = scanner.nextInt();
                        switch (menu_order){
                            case 1:
                                restaurant.viewMenu();
                                break;
                            case 2:
                                restaurant.viewOrder();
                                break;
                            case 3:
                                loggiedin = false;
                                break;
                            case 4:
                                System.out.println("Anda Berhasil Keluar!");
                                System.exit(0);
                                break;
                        }
                        String pesan = (loggiedin == false) ? "Masuk Kembali ? (1 = Tidak/ 2 = Iya) : " : "Apakah Anda Ingin Memilih Menu Yang Lainnya? (1 = Iya /2 = Tidak) : ";
                        System.out.print(pesan);ulang= scanner.nextInt();
                    }while(ulang == 1);
                } else if (user.equals(user1.getUsername_admin())) {
                    do {
                        restaurant.MenuAdmin();
                        System.out.print("Masukan Pilihan Yang Ingin Anda Pilih : ");
                        menu_resto = scanner.nextInt();

                        switch (menu_resto) {
                            case 1:
                                restaurant.viewRestaurant();
                                break;
                            case 2:
                                restaurant.addRestaurant();
                                break;
                            case 3:
                                restaurant.removeRestaurant();
                                break;
                            case 4:
                                loggiedin = false;
                                break;
                            case 5:
                                System.out.println("Anda Berhasil Keluar!");
                                System.exit(0);
                                break;
                        }
                        String pesan = (loggiedin == false) ? "Masuk Kembali ? (1 = Tidak/ 2 = Iya) : " : "Apakah Anda Ingin Memilih Menu Yang Lainnya? (1 = Iya /2 = Tidak) : ";
                        System.out.print(pesan);ulang= scanner.nextInt();
                    }while(ulang == 1);
                }

            }else{
                System.out.println("* Username/Password Yang Anda Masukkan Salah!*");
            }

        }
    }

}