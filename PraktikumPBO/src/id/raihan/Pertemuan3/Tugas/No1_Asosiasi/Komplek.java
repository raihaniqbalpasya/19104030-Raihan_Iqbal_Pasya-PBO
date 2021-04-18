package id.raihan.Pertemuan3.Tugas.No1_Asosiasi;

import java.util.ArrayList;
import java.util.List;

public class Komplek {
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah = 0;
    private List<String> idRumah = new ArrayList<>();

    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    public void addRumah(String idRumah) {
        this.idRumah.add(jmlRumah, idRumah);
        jmlRumah++;
    }

    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    public void getIdRumah() {
        for (String index : idRumah) {
            System.out.println("- " + index);
        }
    }

    public void setIdRumah(List<String> idRumah) {
        this.idRumah = idRumah;
    }

    public void getDataKomplek() {
        System.out.println("Komplek Perumahan " + getNamaKomplek());
        System.out.println("ID Komplek : " + getIdKomplek());
        System.out.println("Daftar Rumah:");
        getIdRumah();
    }
}
