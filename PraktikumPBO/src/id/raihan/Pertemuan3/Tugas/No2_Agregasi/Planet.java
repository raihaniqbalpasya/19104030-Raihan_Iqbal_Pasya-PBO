package id.raihan.Pertemuan3.Tugas.No2_Agregasi;

public class Planet {
    private int idPlanet;
    private int urutanPlanet;
    private String namaPlanet;

    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    public int getIdPlanet() {
        return idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }
}
