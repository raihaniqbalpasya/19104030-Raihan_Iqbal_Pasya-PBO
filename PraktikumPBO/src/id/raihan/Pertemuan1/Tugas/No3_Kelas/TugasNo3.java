package id.raihan.Pertemuan1.Tugas.No3_Kelas;

public class TugasNo3 {
    // method nama dan jabatan
    private static String nama = "Gilbert Sinaga";
    private static String jabatan = "Karyawan";

    // method dengan setter
    private static int setGaji() {
        int gaji = 3500000;
        return gaji;
    }

    public static void main(String[] args) {
        System.out.println("---Data Karyawan PT.Mencari Cinta Sejati---");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Jabatan \t: " + jabatan);
        System.out.println("Gaji \t\t: " + setGaji());
    }
}
