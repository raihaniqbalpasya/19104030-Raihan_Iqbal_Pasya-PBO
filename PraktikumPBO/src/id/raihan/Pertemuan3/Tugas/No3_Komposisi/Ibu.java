package id.raihan.Pertemuan3.Tugas.No3_Komposisi;

public class Ibu {
    private int idIbu;
    private String namaIbu;
    private int umurIbu;

    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }

    public void getDataIbu() {
        System.out.println("ID Ibu\t\t: " + getIdIbu());
        System.out.println("Nama Ibu\t: " + getNamaIbu());
        System.out.println("Umur Ibu\t: " + getUmurIbu());
    }
}
