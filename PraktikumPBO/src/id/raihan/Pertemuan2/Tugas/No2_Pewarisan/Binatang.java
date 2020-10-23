package id.raihan.Pertemuan2.Tugas.No2_Pewarisan;

public class Binatang {
    public static void main(String[] args) {
        System.out.println("---Fakta Unik Beberapa Hewan---\n");
        Burung binatang1 = new Burung("Burung Merpati");
        binatang1.getNama();
        binatang1.makan("Cacing & Serangga");
        binatang1.tidur("pada malam hari");
        binatang1.terbang();
        System.out.println();

        Ikan binatang2 = new Ikan("Ikan Hiu");
        binatang2.getNama();
        binatang2.makan("Ikan-ikan dan hewan laut yang lebih kecil darinya");
        binatang2.tidur("sambil berenang");
        binatang2.berenang();
        System.out.println();

        Kucing binatang3 = new Kucing("Kucing");
        binatang3.getNama();
        binatang3.makan("Whiskas");
        binatang3.tidur("rata-rata 16-18 jam per hari");
        binatang3.meong();
    }

    ;

    public void makan(String nama) {
    }

    ;

    public void tidur(String nama) {
    }
}
