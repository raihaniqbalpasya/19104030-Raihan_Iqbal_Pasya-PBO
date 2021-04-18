package id.raihan.Pertemuan4.Tugas;

import java.util.Random;

public class DemoTugas {
    public static void main(String[] args) {
        Employee[] karyawan = {
                new SalariedEmployee("Rara", "123456789", 2500000),
                new CommisionEmployee("Riri", "987654321", 5000000, 25000, 100),
                new ProjectPlanner("Ruru", "918273645", 8000000, 50000, 50)
        };
        Employee data;
        Random pilihan = new Random();
        data = karyawan[pilihan.nextInt(karyawan.length)];

        System.out.println("---Informasi Karyawan---\n" + data);
        data.gaji();
    }
}

