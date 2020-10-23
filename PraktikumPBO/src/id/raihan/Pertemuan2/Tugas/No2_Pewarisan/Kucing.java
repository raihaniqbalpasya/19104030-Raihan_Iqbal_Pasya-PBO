package id.raihan.Pertemuan2.Tugas.No2_Pewarisan;

public class Kucing extends Binatang {
    public String nama;

    public Kucing(String nama) {
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

    public void meong() {
        System.out.println(nama + " memiliki lebih dari 100 suara vokal yang berbeda");
    }
}
