package id.raihan.Pertemuan3.Tugas.No2_Agregasi;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private String id;
    private String nama;
    private List<Planet> planets = new ArrayList<>();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void getPlanets() {
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void getData() {
        System.out.println("Solar System : " + getNama());
        System.out.println("ID : " + getId());
        System.out.print("Nama-nama Planet : \n");
        for (Planet planet : planets) {
            System.out.println("- ID : " + planet.getIdPlanet()
                    + "\t- Urutan : " + planet.getUrutanPlanet()
                    + "\t- Nama : " + planet.getNamaPlanet());
        }
    }
}
