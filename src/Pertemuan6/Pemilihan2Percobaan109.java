package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan109 {
  public static void main(String[] args) {
    Scanner input09 = new Scanner(System.in);
    int tahun;
    System.out.print("Masukan tahun : ");
    tahun = input09.nextInt();
    if (tahun % 400 == 0) {
      System.out.println("Tahun kabisat");
    } else {
      if (tahun % 100 == 0) {
        System.out.println("Bukan tahun kabisat");
      } else {
        if (tahun % 4 == 0) {
          System.out.println("Tahun kabisat");
        } else {
          System.out.println("Bukan tahun kabisat");
        }
      }
    }
  }
}
