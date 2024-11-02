public class Kelas extends MataKuliah {
    private String kodeKelas;

    public Kelas(String namaMK, String kodeKelas) {
        super(namaMK);
        this.kodeKelas = kodeKelas;
    }

    public String infoKelas() {
        return infoMataKuliah() + ", Kode Kelas: " + kodeKelas;
    }
}
