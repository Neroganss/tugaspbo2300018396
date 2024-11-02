public class Mahasiswa extends Person {
    public Mahasiswa(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public String infoPerson() {
        return "Mahasiswa - " + super.infoPerson();
    }
}

