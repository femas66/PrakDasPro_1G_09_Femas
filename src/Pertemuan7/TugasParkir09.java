package Pertemuan7;

import java.util.Scanner;

/**
 * TugasParkir09
 */
public class TugasParkir09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jenis, durasi, total = 0;

    while (true) {
      System.out.print("Masukan jenis : ");
      jenis = sc.nextInt();
      if (jenis == 1 || jenis == 2) {
        System.out.print("Masukan durasi : ");
        durasi = sc.nextInt();
        if (durasi > 5) {
          total += 12500;
        } else if (jenis == 1) {
          total += durasi * 3000;
        } else if (jenis == 2) {
          total += durasi * 2000;
        }
      }
      if (jenis == 0) {
        break;
      }
    }

    System.out.println("Total adalah : " + total);
  }
}
