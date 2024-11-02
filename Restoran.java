import java.util.ArrayList;
import java.util.List;

public class Restoran {
    private String nama;
    private List<Menu> menuList;
    private List<Pelanggan> pelangganList;
    private RiwayatPesanan riwayatPesanan;

    public Restoran(String nama) {
        this.nama = nama;
        this.menuList = new ArrayList<>();
        this.pelangganList = new ArrayList<>();
        this.riwayatPesanan = new RiwayatPesanan();
    }

    public void tambahMenu(Menu menu) {
        menuList.add(menu);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    public void catatPesanan(Pesanan pesanan) {
        riwayatPesanan.tambahPesanan(pesanan);
        System.out.println("Pesanan berhasil dicatat!");
    }
}
