package Pertemuan10;

import java.util.Scanner;

public class ArrayNilai09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nilaiAkhir = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Masukan nilai akhir ke " + i + " : ");
      nilaiAkhir[i] = sc.nextInt();
    }
    for (int i = 0; i< 10; i++) {
      if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke " + i + " lulus!");
      }
      else {
        System.out.println("Mahasiswa ke " + i + " tidak lulus");
      }
    }
  }
}
