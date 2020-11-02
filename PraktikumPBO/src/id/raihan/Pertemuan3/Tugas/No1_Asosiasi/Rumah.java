package id.raihan.Pertemuan3.Tugas.No1_Asosiasi;

public class Rumah {
    private String idRumah;
    private String pemilikRumah;
    private int jmlOrang;

    public Rumah(String idRumah, String pemilikRumah, int jmlOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jmlOrang = jmlOrang;
    }

    public String getIdRumah() {
        return idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public int getJmlOrang() {
        return jmlOrang;
    }
}
