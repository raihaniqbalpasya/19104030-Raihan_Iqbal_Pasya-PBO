package id.raihan.Pertemuan2.Praktikum.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Yoru ni Kakeru");
        Lagu lagu2 = new Lagu("Lemon", "Kenshi Yonezu");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
