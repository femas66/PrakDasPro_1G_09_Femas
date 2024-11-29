package Pertemuan11;

import java.util.Scanner;

public class Flowchard3_09 {
  public static void main(String[] args) {
    String[] bulan = { "Januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september",
        "oktober", "november", "desember" };

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukan angka bulan : (1-12)");
    int angka = sc.nextInt();
    System.out.println("Nama bulan ke-" + angka + " adalah " + bulan[angka - 1]);
  }
}
