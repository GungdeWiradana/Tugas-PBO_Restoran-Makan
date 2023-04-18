import java.util.ArrayList;

public class Restaurant {

    private int id;
    private String nama;
    private String alamat;

    public Restaurant(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getId() {
        setId(id);
        return id;
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
        return "Restaurant || " +
                ", nama=" + nama + ' ' +
                ", alamat=" + alamat + ' ';
    }

}