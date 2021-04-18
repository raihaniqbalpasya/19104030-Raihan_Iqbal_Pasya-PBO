package id.raihan.Pertemuan3.Tugas.No2_Agregasi;

import java.util.ArrayList;
import java.util.List;

public class Demo_No2_Agregasi {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem("GB123", "Galaxy Bimasakti");

        Planet planet1 = new Planet(111, 1, "Merkurius");
        Planet planet2 = new Planet(222, 2, "Venus");
        Planet planet3 = new Planet(333, 3, "Bumi");
        Planet planet4 = new Planet(444, 4, "Mars");
        Planet planet5 = new Planet(555, 5, "Jupiter");
        Planet planet6 = new Planet(666, 6, "Saturnus");
        Planet planet7 = new Planet(777, 7, "Uranus");
        Planet planet8 = new Planet(888, 8, "Neptunus");

        //List Planet dari Class Demo
        List<Planet> planets = new ArrayList<>();
        planets.add(planet1);
        planets.add(planet2);
        planets.add(planet3);
        planets.add(planet4);
        planets.add(planet5);
        planets.add(planet6);
        planets.add(planet7);
        planets.add(planet8);

        //Untuk copas data dari list planet class "Demo_No2_Agregasi" ke class "SolarSystem"
        solarSystem.setPlanets(planets);

        solarSystem.getData();
    }
}
