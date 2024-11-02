public abstract class Pesanan {
    protected Pelanggan pelanggan;
    protected Menu menu;
    protected int jumlah;
    protected String status;

    public Pesanan(Pelanggan pelanggan, Menu menu, int jumlah) {
        this.pelanggan = pelanggan;
        this.menu = menu;
        this.jumlah = jumlah;
        this.status = "Belum Diproses";
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract String detailPesanan();
}
