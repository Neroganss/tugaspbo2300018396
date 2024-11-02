public class SistemMataKuliah extends MataKuliah {
    public SistemMataKuliah(String namaMK) {
        super(namaMK);
    }

    @Override
    public String infoMataKuliah() {
        return "Sistem Mata Kuliah - " + super.infoMataKuliah();
    }
}
