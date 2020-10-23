package id.raihan.Pertemuan2.Tugas.No2_Pewarisan;

public class Ikan extends Binatang {
    public String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public void makan(String nama) {
        super.makan(nama);
        System.out.println("Makanan : " + nama);
    }

    public void tidur(String nama) {
        super.tidur(nama);
        System.out.println("Tidur " + nama);
    }

    public void getNama() {
        System.out.println("Nama Hewan : " + nama);
        ;
    }

    public void berenang() {
        System.out.println("Secara umum " + nama + " dapat berenang dengan kecepatan 8 km per jam");
    }
}
