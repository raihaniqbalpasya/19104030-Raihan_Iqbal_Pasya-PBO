package id.raihan.Pertemuan2.Tugas.No2_Pewarisan;

public class Burung extends Binatang {
    public String nama;

    public Burung(String nama) {
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
    }

    public void terbang() {
        System.out.println(nama + " dapat terbang sejauh 965km dalam sehari");
    }
}
