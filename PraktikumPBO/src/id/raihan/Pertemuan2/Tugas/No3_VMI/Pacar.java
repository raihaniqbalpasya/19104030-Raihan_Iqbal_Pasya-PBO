package id.raihan.Pertemuan2.Tugas.No3_VMI;

public class Pacar extends Mahasiswa {
    public String namaPacar;
    public String lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    public void getStatus() {
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + status);
        System.out.println("Semester : " + semester);
        System.out.println("Nama Pacar : " + namaPacar);
        System.out.println("Lama Hubungan : " + lamaHubungan);
    }
}
