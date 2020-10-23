package id.raihan.Pertemuan1.Praktikum.Objek;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Raihan");
        mahasiswaTanpa.setNim(19104030);

        //output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Udin", 1029410);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t\t: " + mahasiswa.getNim());
    }
}
