package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] penonton = new String[4][2];

    int baris, kolom;
    String next, nama;

    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Input data penonton");
      System.out.println("2. Tampilkan daftar penonton");
      System.out.println("3. Exit");
      System.out.print("Pilih menu: ");
      int pilihan = sc.nextInt();

      if (pilihan == 1) {
        System.out.print("Masukan nama : ");
        nama = sc.next();
        System.out.print("Masukan baris: ");
        baris = sc.nextInt();
        System.out.print("Masukan kolom: ");
        kolom = sc.nextInt();

        if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
          if (penonton[baris-1][kolom-1] != null) {
            System.out.println("Sudah diisi");
          } else {
            penonton[baris - 1][kolom - 1] = nama;
          }
        } else {
          System.out.println("Posisi baris atau kolom tidak valid.");
        }

      } else if (pilihan == 2) {
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
          for (int j = 0; j < penonton[i].length; j++) {
            if (penonton[i][j] != null) {
              System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
            } else {
              System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***$");
            }
          }
        }

      } else if (pilihan == 3) {
        System.out.println("Keluar dari program.");
        break;

      } else {
        System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
      }
    }
  }
}
