package id.raihan.Pertemuan3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("SE", "Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Udin", 19104033);
        Mahasiswa mahasiswa2 = new Mahasiswa("Dudu", 19104044);
        Mahasiswa mahasiswa3 = new Mahasiswa("Gogo", 19204055);

        //List Mahasiswa dari Class Demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Bibi", 19104066));

        //Untuk copas data dari list mahasiswa class "demo jurusan" ke class "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        //Untuk masukan data Mahasiswa langsung ke class Jurusan
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();
    }
}
