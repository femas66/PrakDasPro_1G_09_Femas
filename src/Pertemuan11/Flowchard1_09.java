package Pertemuan11;

import java.util.Scanner;

public class Flowchard1_09 {
  public static void main(String[] args) {
    int[] nilai = new int[30];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < nilai.length; i++) {
      System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
      nilai[i] = sc.nextInt();
    }

    for (int i = 0; i < nilai.length; i++) {
      System.out.println("Nilai ke " + (i + 1) + " adalah " + nilai[i]);
    }
  }
}
