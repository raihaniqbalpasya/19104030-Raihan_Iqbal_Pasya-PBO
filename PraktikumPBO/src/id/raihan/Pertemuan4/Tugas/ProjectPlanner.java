package id.raihan.Pertemuan4.Tugas;

public class ProjectPlanner extends Employee {
    private String nama;
    private String NIP;
    private int gajiPokok;
    private int komisi;
    private int totalHasilProyek;

    public ProjectPlanner(String nama, String NIP, int gajiPokok, int komisi, int totalHasilProyek) {
        super("Project Planner");
        this.nama = nama;
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }

    /* meredefenisi method abstract dengan
     * menuliskan perintah di dalamnya*/
    @Override
    protected void gaji() {
        System.out.println("Gaji \t\t\t: " + hitungGaji());
    }

    @Override
    public String toString() {
        return super.toString() + printInformasi();
    }

    public int hitungGaji() {
        int gaji, pajak;
        pajak = gajiPokok * 10 / 200;
        gaji = gajiPokok + (komisi * totalHasilProyek) - pajak;
        return gaji;
    }

    public String printInformasi() {
        return "\nNama\t\t\t: " + nama + "\nNIP\t\t\t\t: " + NIP;
    }
}
