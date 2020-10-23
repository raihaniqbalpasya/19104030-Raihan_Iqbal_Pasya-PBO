package id.raihan.Pertemuan2.Tugas.No3_VMI;

public class DemoVMI {
    public static void main(String[] args) {
        Pacar pacar = new Pacar("Dodi", "Pacaran", 5, "Sekar", "2 tahun");
        Mahasiswa mahasiswaPacar = new Pacar("Udin", "Pacaran", 3, "Ani", "7 bulan");

        pacar.getStatus();
        System.out.println();
        mahasiswaPacar.getStatus();
    }
}
