package id.raihan.Pertemuan1.Tugas.No1_Method;

import java.util.Scanner;

// class output konversi suhu
public class DemoTugasNo1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("---Program Konversi suhu---");
        System.out.print("Masukkan nilai suhu : ");
        float inputsuhu = inputan.nextFloat();

        // objek class TugasNo1
        TugasNo1 tugasNo1 = new TugasNo1();
        System.out.print("\nCelsius to Fahrenheit \t: " + tugasNo1.cf(inputsuhu));
        System.out.print("\nFahrenheit to Kelvin \t: " + tugasNo1.fk(inputsuhu));
        System.out.print("\nKelvin to Reaumur \t\t: " + tugasNo1.kr(inputsuhu));
        System.out.println("\nReaumur to Celsius \t\t: " + tugasNo1.rc(inputsuhu));
    }
}
