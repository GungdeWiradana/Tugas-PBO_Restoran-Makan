import java.util.ArrayList;

public class Restaurant {

    private int id;
    private String nama;
    private String alamat;
    private ArrayList<Menu> menus;

    public Restaurant(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.menus = new ArrayList<>();
    }

    public int getId() {
        setId(id);
        return id;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Menu menu){
        this.menus.add(menu);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        setNama(nama);
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        setAlamat(alamat);
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "ID Restaurant : " + id +
                " || nama = " + nama + ' ' +
                " || alamat = " + alamat + ' ';
    }

}