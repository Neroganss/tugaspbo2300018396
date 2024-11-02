// Main.java
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ali", 20);
        Dosen dosen1 = new Dosen("Dr. Budi", 45);
        SistemMataKuliah mataKuliah1 = new SistemMataKuliah("Pemrograman Berorientasi Objek");
        Kelas kelas1 = new Kelas("Jaringan Komputer", "JK101");

        // Menampilkan informasi
        System.out.println(mahasiswa1.infoPerson());
        System.out.println(dosen1.infoPerson());
        System.out.println(mataKuliah1.infoMataKuliah());
        System.out.println(kelas1.infoKelas());

        // Mengubah nama mahasiswa
        mahasiswa1.setNama("Siti");
        System.out.println("Nama Mahasiswa setelah diubah: " + mahasiswa1.getNama());
    }
}
