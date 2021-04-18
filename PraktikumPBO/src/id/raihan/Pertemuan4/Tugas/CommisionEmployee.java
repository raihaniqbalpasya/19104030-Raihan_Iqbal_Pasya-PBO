package id.raihan.Pertemuan4.Tugas;

public class CommisionEmployee extends Employee {
    private String nama;
    private String NIP;
    private int gajiPokok;
    private int komisi;
    private int totalPenjualan;

    public CommisionEmployee(String nama, String NIP, int gajiPokok, int komisi, int totalPenjualan) {
        super("Commision Employee");
        this.nama = nama;
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
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
        gaji = gajiPokok + (komisi * totalPenjualan);
        return gaji;
    }

    public String printInformasi() {
        return "\nNama\t\t\t: " + nama + "\nNIP\t\t\t\t: " + NIP;
    }
}
