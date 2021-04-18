package id.raihan.Pertemuan4.Praktikum.Abstract;

public class Anjing extends Binatang {
    private String nama;

    public Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.print("Menggonggong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
