package id.raihan.Pertemuan3.Praktikum.Asosiasi;

public class Mahasiswa {
    private int nim;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
