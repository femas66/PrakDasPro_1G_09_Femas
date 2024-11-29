package Pertemuan11;

import java.util.Scanner;

/**
 * Flowchard5_09
 */
public class Flowchard5_09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] data = {
        4, 3, 6, 4, 6, 7, 5, 0, 1, 4, 6
    };

    String ketemu = "";
    System.out.print("Masukkan angka yang ingin dicari : ");
    int cari = sc.nextInt();
    for (int i = 0; i < data.length; i++) {
      if (data[i] == cari) {
        ketemu += i + ", ";
      }
    }
    System.out.println("Ditemukan pada index : " + ketemu);
  }
}
