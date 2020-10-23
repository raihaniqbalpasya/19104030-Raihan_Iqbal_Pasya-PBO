package id.raihan.Pertemuan1.Praktikum.Method;

public class TesPass {
    int nomor1, nomor2;

    //constructor
    public TesPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //Method Pass by Value, parameter berupa tipe data primitif
    public void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    //Method Pass by Reference, parameter berupa tipe data class
    public void calculate(TesPass pass) {
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 2;
    }
}
