package Pertemuan7;

import java.util.Scanner;

/**
 * SiakadFor09
 */
public class SiakadFor09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilai, tertinggi = 0, terendah = 100;
    byte lolos = 0, gagal = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Masukan nilai mahasiswa ke - " + i + " : ");
      nilai = sc.nextDouble();
      if (nilai >= 60) {
        lolos++;
      } else {
        gagal++;
      }
      if (nilai > tertinggi) {
        tertinggi = nilai;
      }
      if (nilai < terendah) {
        terendah = nilai;
      }
    }

    System.out.println("Nilai tertinggi : " + tertinggi);
    System.out.println("Nilai terendah : " + terendah);
    System.out.println("Gagal : " + gagal);
    System.out.println("Lolos : " + lolos);
  }
}
