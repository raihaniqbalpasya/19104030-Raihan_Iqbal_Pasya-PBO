package id.raihan.Pertemuan4.Praktikum.Abstract;

public class Burung extends Binatang {
    private String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.print("berkicau");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
