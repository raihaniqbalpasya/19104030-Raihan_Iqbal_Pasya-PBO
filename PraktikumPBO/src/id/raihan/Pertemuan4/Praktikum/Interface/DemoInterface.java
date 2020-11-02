package id.raihan.Pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket a = new Paket("PBO", "Anugrah Iman", 120000, "4gb", 50000);

        a.hitungHargaPaket();
        a.cetakPaket();
    }
}
