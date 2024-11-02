    public class Dosen extends Person {
    public Dosen(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public String infoPerson() {
        return "Dosen - " + super.infoPerson();
    }
}
