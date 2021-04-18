package id.raihan.Pertemuan5.Praktikum;

public class Finally {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            //Database di buka
            System.out.println("Akses Elemen ke-5\t: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //Exception
            System.out.println("ada Exception Array");
        } finally {
            //Database di buka
            array[array.length - 1] = 10;
            System.out.println("Nilai elemen terakhir\t: " + array[array.length - 1]);
        }
    }
}
