package id.raihan.Pertemuan2.Tugas.No1_Overloading;

public class Club {
    public String nama = "Belum diinput";
    public int tahunBerdiri = 0;
    public String stadion = "Belum diinput";
    public int juaraUcl = 0;
    public String deskripsi = "Belum diinput";

    public Club() {
    }

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        System.out.println("Nama Club \t\t: " + nama);
        System.out.println("Tahun Berdiri \t: " + tahunBerdiri);
        System.out.println("Stadion \t\t: " + stadion);
        System.out.println("Juara UCL \t\t: " + juaraUcl);
        System.out.println("Deskripsi \t\t: " + deskripsi);
        System.out.println();
    }
}
