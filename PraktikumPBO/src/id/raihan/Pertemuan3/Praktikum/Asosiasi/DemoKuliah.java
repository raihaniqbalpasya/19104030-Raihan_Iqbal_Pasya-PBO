package id.raihan.Pertemuan3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Ucok");
        mahasiswa1.setNim(19104011);

        Mahasiswa mahasiswa2 = new Mahasiswa(19104022, "Dodo");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMHS(mahasiswa1.getNim());
        dosen.setNimMHS(mahasiswa2.getNim());

        System.out.println("Kode Dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMhs(i));
        }
    }
}
