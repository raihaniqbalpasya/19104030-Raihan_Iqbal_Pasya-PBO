package id.raihan.Pertemuan1.Praktikum.Objek;

public class Mahasiswa {
    String nama;
    int nim;

    //constructor
    public Mahasiswa() {
    }

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
