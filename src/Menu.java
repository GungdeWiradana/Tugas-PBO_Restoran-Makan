import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    String nama;
    int harga;

    public Menu(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String toString() {
        return "Nama Menu : " + nama + " || Rp." + harga;
    }

}
