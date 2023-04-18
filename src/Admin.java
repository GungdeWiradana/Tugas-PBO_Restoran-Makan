import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Admin {
        static HashMap<String, Restaurant> restaurants = new HashMap<>();
        public static ArrayList<Order> orders = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        static void MenuAdmin() {
            System.out.println("============ MENU ADMIN =============");
            System.out.println("| 1. Tampilkan Menu Restaurant       ");
            System.out.println("| 2. Tambah Menu Restaurant          ");
            System.out.println("| 3. Hapus Menu Restauran            ");
            System.out.println("| 4. Masuk Kembali                   ");
            System.out.println("| 5. Keluar                          ");
            System.out.println("=====================================");
        }

        //    add restaurant
        public static void addRestaurant() {
            System.out.print("Masukkan Id Restaurant : ");
            int id = scanner.nextInt();

            System.out.print("Masukan Nama Restaurant Yang Anda Pilih  : ");
            String nama = scanner.next();

            System.out.print("Masukan Alamat Restaurant Yang Anda Pilih: ");
            String alamat = scanner.next();
            Restaurant restaurant = new Restaurant(id, nama, alamat);

            String inputMenu = "";
            while (!inputMenu.equals("Selesai")) {
                System.out.print("Masukan/Menambah Menu (Format: menuName|menuPrice) Enter, Lalu Ketik \"Selesai\" untuk selesai: ");
                inputMenu = scanner.next();
                if (!inputMenu.equals("Selesai")) {
                    String[] menuData = inputMenu.split("\\|");
                    restaurant.setMenus(new Menu(menuData[0], Integer.parseInt(menuData[1])));
                }
            }
            restaurants.put(nama, restaurant);
            System.out.println("Tambah Restaurant berhasil!");
        }


        //    view retaurant
        public static void viewRestaurant() {
            System.out.println("============= RESTAURANT =============");
            for (String namaRestaurant : restaurants.keySet()) {
                System.out.println("ID Restaurant : " + restaurants.get(namaRestaurant).getId()
                        + " || Nama : " + namaRestaurant + " || Alamat : " + restaurants.get(namaRestaurant).getAlamat());
                System.out.println("Menu : ");
                for (Menu menu : restaurants.get(namaRestaurant).getMenus()) {
                    System.out.println(menu.getNama() + " || " + menu.getHarga());
                }
            }
        }

        public static void viewMenu() {
            System.out.println("==== RESTAURANT ====");
            for (String namarestaurant : restaurants.keySet()) {
                System.out.println(namarestaurant + " || " + restaurants.get(namarestaurant).getAlamat());
            }
            System.out.print("Masukan Nama Restaurant : ");
            String pilih_restaurant = scanner.next();
            if (!restaurants.containsKey(pilih_restaurant)) {
                System.out.println("Maaf Menu Tidak Terdaftar!");
            }
            Restaurant res = restaurants.get(pilih_restaurant);
            Order newOrder = new Order(res);
            String menu = "";
            while (!menu.equals("2")) {
                System.out.println("==== " + res.getNama() + " ====");
                System.out.println("Menu : ");
                int nomorMenu = 1;
                for (Menu menu1 : res.getMenus()) {
                    System.out.println(nomorMenu + ". " + menu1.getNama() + " - " + menu1.getHarga());
                    nomorMenu++;
                }
                System.out.print("Masukan Nomor Menu : ");
                int indexMenu = scanner.nextInt();
                System.out.print("Jumlah Beli : ");
                int jumlah_beli = scanner.nextInt();
                scanner.nextLine();

                newOrder.addMenu(res.getMenus().get(indexMenu - 1), jumlah_beli);

                System.out.print("Tambah Menu lagi?  (1 = iya / 2 = tidak) : ");
                menu = scanner.next();
            }
            System.out.print("Masukan jarak pengantaran makanan (dalam km) : ");
            int jarak = scanner.nextInt();

            newOrder.setDistance(jarak);
            orders.add(newOrder);
            System.out.println("Order Menu Berhasil!");
        }

        public static void viewOrder() {
            System.out.println("===== ORDERS =====");
            for (int i = 0; i < orders.size(); i++) {
                Order order = orders.get(i);
                System.out.println((i + 1) + ". " + order.getRestaurant().getNama());
                System.out.println("Menu : ");
                for (Menu menu : order.getMenus().keySet()) {
                    System.out.println(menu.getNama() + " X " + order.getMenus().get(menu));
                }
                System.out.println("Ongkir 1.000.km || Jarak : " + order.getDistance() + " km");
                System.out.println("Total Bayar : " + order.getTotalPrice());
            }
        }

        public static void removeRestaurant() {
            for (String namaRestaurant : restaurants.keySet()) {
                System.out.println("ID Restaurant : " + restaurants.get(namaRestaurant).getId()
                        + " || Nama : " + namaRestaurant + " || Alamat : " + restaurants.get(namaRestaurant).getAlamat());
            }
            System.out.println("==============================");
            System.out.println("Masukan Nama Restaurant : ");
            String namaRestaurant = scanner.next();
            if (restaurants.containsKey(namaRestaurant)) {
                restaurants.remove(namaRestaurant);
                System.out.println("Restaurant Telah Berhasil Di Hapus!");
            } else {
                System.out.println("Restaurant Tidak Dapat Ditemukan!");
            }
        }

}
