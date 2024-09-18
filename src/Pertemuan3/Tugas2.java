package Pertemuan3;

import java.util.Scanner;

public class Tugas2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jumlahJamKerja;
    double bonus = 0.1, pajak = 0.05, gajiPerbulan, upahPerJam;

    System.out.print("Jumlah jam kerja : ");
    jumlahJamKerja = sc.nextInt();

    System.out.print("Upah per jam : ");
    upahPerJam = sc.nextDouble();

    gajiPerbulan = jumlahJamKerja * upahPerJam;
    gajiPerbulan += gajiPerbulan * bonus;
    gajiPerbulan -= gajiPerbulan * pajak;

    System.out.println("Total gaji : " + gajiPerbulan);
  }
}
