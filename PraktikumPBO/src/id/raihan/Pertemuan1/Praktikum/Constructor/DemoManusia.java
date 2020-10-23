package id.raihan.Pertemuan1.Praktikum.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of objek
        Manusia arrayManusia[] = new Manusia[3];

        //constructor pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Ryan");
        manusia1.setUmur(21);

        //constructor kedua
        Manusia manusia2 = new Manusia("Anjay");

        //constructor ketiga
        Manusia manusia3 = new Manusia("Anjayani", 17);

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia) {
            System.out.println("Karakter");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println();
        }
    }
}
