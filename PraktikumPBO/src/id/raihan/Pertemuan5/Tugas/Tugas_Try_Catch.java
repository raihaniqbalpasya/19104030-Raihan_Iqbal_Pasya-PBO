package id.raihan.Pertemuan5.Tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas_Try_Catch {
    public static int scanner() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static String buffered() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pilihan = br.readLine().toUpperCase();
        return pilihan;
    }

    public static void main(String[] args) throws IOException {
        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jmlPengunjung = 0;
        System.out.println("<--- Pelanggan --->");
        System.out.print("Jumlah Pengunjung : ");
        try {
            jmlPengunjung = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Tolong input data integer!!\n");
        }

        // Input data pengunjung
        System.out.println("Masukkan Data Pengunjung : ");

        for (int i = 0; i < jmlPengunjung; i++) {
            try {
                System.out.print("UID : ");
                int UID = scanner();
                array[i] = UID;
                System.out.println("Data ke-" + i + "\t: " + array[i] + " terdaftar!");
            } catch (InputMismatchException e) {
                System.out.println("Tolong input data integer!!");
                System.out.print("UID : ");
                int temp = scanner();
                array[i] = temp;
                System.out.println("Data ke-" + i + "\t: " + array[i] + " terdaftar!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index berlebih. max Array = " + array.length);
                break;
            }
        }


        // Lihat data pengunjung
        System.out.println("\n\nLihat Data Pengunjung : ");
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("Indeks : ");
                int index = scanner.nextInt();
                System.out.println("Data ke-" + index + "\t: " + array[index]);
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan input!!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index berlebih. max Array = " + array.length);
            } finally {
                System.out.print("Lihat lagi? (Y/N) : ");
                String pilihan = br.readLine();
                if (pilihan.toUpperCase().equals("N")) {
                    break;
                } else if (!pilihan.toUpperCase().equals("Y")) {
                    System.out.println("Tolong masukkan 'Y'/'N'!!");
                    System.out.print("Lihat lagi? (Y/N) : ");
                    buffered();
                } else if (pilihan.equals("Y")) {

                }
            }
        }
    }
}
