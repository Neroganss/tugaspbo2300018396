public class TakeAway extends Pesanan {
    private String waktuAmbil;

    public TakeAway(Pelanggan pelanggan, Menu menu, int jumlah, String waktuAmbil) {
        super(pelanggan, menu, jumlah);
        this.waktuAmbil = waktuAmbil;
    }

    @Override
    public String detailPesanan() {
        return String.format("TAKE-AWAY | Pelanggan: %s, Menu: %s, Jumlah: %d, Total: %d, Status: %s, Waktu Ambil: %s",
                pelanggan.getNama(), menu.getNama(), jumlah, hitungTotal(), status, waktuAmbil);
    }
}
