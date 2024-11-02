public class DineIn extends Pesanan {
    private int nomorMeja;

    public DineIn(Pelanggan pelanggan, Menu menu, int jumlah, int nomorMeja) {
        super(pelanggan, menu, jumlah);
        this.nomorMeja = nomorMeja;
    }

    @Override
    public String detailPesanan() {
        return String.format("DINE-IN | Pelanggan: %s, Menu: %s, Jumlah: %d, Total: %d, Status: %s, Nomor Meja: %d",
                pelanggan.getNama(), menu.getNama(), jumlah, hitungTotal(), status, nomorMeja);
    }
}
