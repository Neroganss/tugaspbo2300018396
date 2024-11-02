import java.util.ArrayList;
import java.util.List;

public class RiwayatPesanan {
    private List<Pesanan> pesananList;

    public RiwayatPesanan() {
        this.pesananList = new ArrayList<>();
    }

    public void tambahPesanan(Pesanan pesanan) {
        pesananList.add(pesanan);
    }

    public void tampilkanRiwayat() {
        for (Pesanan pesanan : pesananList) {
            System.out.println(pesanan.detailPesanan());
        }
    }
}

