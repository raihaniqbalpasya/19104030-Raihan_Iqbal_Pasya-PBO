package id.raihan.Pertemuan4.Praktikum.Abstract;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaan = {
                new Burung("Pipit"),
                new Kambing("Etawa"),
                new Kucing("Anggora"),
                new Anjing("Dobermann")
        };

        Binatang kesayangan;

        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan anda\t:" + kesayangan);
        System.out.print("Suaranya\t: ");
        kesayangan.suara();
    }
}
