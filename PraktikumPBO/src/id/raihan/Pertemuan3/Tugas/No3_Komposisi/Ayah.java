package id.raihan.Pertemuan3.Tugas.No3_Komposisi;

public class Ayah {
    private int idAyah;
    private String namaAyah;
    private int umurAyah;

    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    public int getIdAyah() {
        return idAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }

    public void getDataAyah() {
        System.out.println("ID Ayah\t\t: " + getIdAyah());
        System.out.println("Nama Ayah\t: " + getNamaAyah());
        System.out.println("Umur Ayah\t: " + getUmurAyah());
    }
}
