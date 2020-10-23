package id.raihan.Pertemuan1.Praktikum.Method;

public class Passed {
    public static void main(String[] args) {
        int nomor1, nomor2;
        TesPass pass = new TesPass(50, 100); //Deklarasi objek
        nomor1 = 10;
        nomor2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("nomor 1 = " + nomor1);
        System.out.println("nomor 2 = " + nomor2);

        pass.calculate(nomor1, nomor2);
        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("nomor 1 = " + nomor1);
        System.out.println("nomor 2 = " + nomor2);

        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("nomor 1 = " + pass.nomor1);
        System.out.println("nomor 2 = " + pass.nomor2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference : ");
        System.out.println("nomor 1 = " + pass.nomor1);
        System.out.println("nomor 2 = " + pass.nomor2);
    }
}
