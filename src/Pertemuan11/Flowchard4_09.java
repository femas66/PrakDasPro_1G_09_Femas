package Pertemuan11;

import java.util.Scanner;

/**
 * Flowchard4_09
 */
public class Flowchard4_09 {

  public static void main(String[] args) {
    int[] nilai = new int[10];
    int total = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < nilai.length; i++) {
      System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
      nilai[i] = sc.nextInt();
      total += nilai[i];
    }
    System.out.println("Rata rata nilai adalah " + total / nilai.length);
  }
}
