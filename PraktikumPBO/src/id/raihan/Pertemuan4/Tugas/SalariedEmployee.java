package id.raihan.Pertemuan4.Tugas;

public class SalariedEmployee extends Employee {
    private String nama;
    private String NIP;
    private int upahMingguan;

    public SalariedEmployee(String nama, String NIP, int upahMingguan) {
        super("Salaried Employee");
        this.nama = nama;
        this.NIP = NIP;
        this.upahMingguan = upahMingguan;
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
        int gaji;
        gaji = upahMingguan;
        return gaji;
    }

    public String printInformasi() {
        return "\nNama\t\t\t: " + nama + "\nNIP\t\t\t\t: " + NIP;
    }
}
