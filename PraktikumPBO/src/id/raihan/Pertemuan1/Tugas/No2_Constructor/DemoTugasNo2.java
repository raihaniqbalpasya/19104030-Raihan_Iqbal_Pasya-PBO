package id.raihan.Pertemuan1.Tugas.No2_Constructor;

import java.util.Scanner;

public class DemoTugasNo2 {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        System.out.println("---Pendaftaran Mahasiswa Baru---");

        // Array of objek
        TugasNo2 arrrayMahasiswa[] = new TugasNo2[1];
        TugasNo2 maba = new TugasNo2();

        // set nama
        System.out.print("Masukkan Nama : ");
        String setNama = string.nextLine();
        maba.setNama(setNama);

        // set alamat
        System.out.print("Masukkan Alamat : ");
        String setAlamat = string.nextLine();
        maba.setAlamat(setAlamat);

        // set tanggal lahir
        System.out.print("Masukkan Tanggal Lahir (dalam angka): ");
        int setTanggallahir = integer.nextInt();
        maba.setTanggallahir(setTanggallahir);

        // set email
        System.out.print("Masukkan Email : ");
        String setEmail = string.nextLine();
        maba.setEmail(setEmail);

        arrrayMahasiswa[0] = maba;

        // print output
        System.out.println("\nPendaftaran Berhasil !\n");
        for (TugasNo2 x : arrrayMahasiswa) {
            System.out.println("Data Calon Mahasiswa : ");
            System.out.println("Nama \t\t\t: " + x.getNama());
            System.out.println("Alamat \t\t\t: " + x.getAlamat());
            System.out.println("Tanggal Lahir \t: " + x.getTanggallahir());
            System.out.println("Email \t\t\t: " + x.getEmail());
        }
    }
}
