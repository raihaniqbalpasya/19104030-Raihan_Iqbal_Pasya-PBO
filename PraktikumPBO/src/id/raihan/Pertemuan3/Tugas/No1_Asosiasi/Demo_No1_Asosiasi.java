package id.raihan.Pertemuan3.Tugas.No1_Asosiasi;

public class Demo_No1_Asosiasi {
    public static void main(String[] args) {
        Komplek komplek = new Komplek("K-004", "Citra Indah");

        Rumah rumah1 = new Rumah("R-001", "Gita", 2);
        Rumah rumah2 = new Rumah("R-002", "Roi", 4);

        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());

        //Untuk masukan data Rumah langsung ke class Demo_No1_Asosiasi
        komplek.addRumah(new Rumah("R-003", "Udin", 3).getIdRumah());

        komplek.getDataKomplek();
    }
}
