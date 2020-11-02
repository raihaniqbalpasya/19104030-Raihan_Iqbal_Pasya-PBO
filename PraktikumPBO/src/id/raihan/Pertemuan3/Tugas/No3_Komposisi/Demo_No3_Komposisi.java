package id.raihan.Pertemuan3.Tugas.No3_Komposisi;

import java.util.ArrayList;
import java.util.List;

public class Demo_No3_Komposisi {
    public static void main(String[] args) {
        Keluarga keluarga = new Keluarga("Keluarga Pak Somat", "Banjarmasin");

        keluarga.getDataKeluarga();

        Ayah ayah = new Ayah(123001, "Somat", 45);
        Ibu ibu = new Ibu(123002, "Tuti", 42);
        Anak anak1 = new Anak(123003, "Ujang", 17, "Single");
        Anak anak2 = new Anak(123004, "Susi", 13, "Single");

        List<Anak> anakList = new ArrayList<>();
        anakList.add(anak1);
        anakList.add(anak2);

        keluarga.addAnggotaKeluarga(ayah, ibu, anakList);

        System.out.print("Data Ayah : \n");
        keluarga.getAyah().getDataAyah();
        System.out.println();

        System.out.print("Data Ibu : \n");
        keluarga.getIbu().getDataIbu();
        System.out.println();

        int index = 1;
        for (Anak anaks : anakList) {
            System.out.println("Data Anak Ke-" + index++ + " :");
            System.out.println("ID Anak \t: " + anaks.getIdAnak()
                    + "\nNama Anak \t: " + anaks.getNamaAnak()
                    + "\nUmur Anak \t: " + anaks.getUmurAnak()
                    + "\nStatus Anak : " + anaks.getStatusAnak());
            System.out.println();
        }
    }
}
