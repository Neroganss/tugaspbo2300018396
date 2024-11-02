        public class MataKuliah {
    private String namaMK;

    public MataKuliah(String namaMK) {
        this.namaMK = namaMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public String infoMataKuliah() {
        return "Nama Mata Kuliah: " + namaMK;
    }
}
