public class Main {
    public static void main(String[] args) {

        Restoran restoran = new Restoran("Restoran Lezat");

        Menu menu1 = new Menu("Nasi Goreng", 20000);
        Menu menu2 = new Menu("Es Teh", 5000);
        restoran.tambahMenu(menu1);
        restoran.tambahMenu(menu2);

        Pelanggan pelanggan1 = new Pelanggan("Budi", "08123456789");
        Pelanggan pelanggan2 = new Pelanggan("Ani", "08987654321");
        restoran.tambahPelanggan(pelanggan1);
        restoran.tambahPelanggan(pelanggan2);

        DineIn pesanan1 = new DineIn(pelanggan1, menu1, 2, 5);
        restoran.catatPesanan(pesanan1);

        TakeAway pesanan2 = new TakeAway(pelanggan2, menu2, 3, "18:30");
        restoran.catatPesanan(pesanan2);

        System.out.println(pesanan1.detailPesanan());
        System.out.println(pesanan2.detailPesanan());
    }
}
