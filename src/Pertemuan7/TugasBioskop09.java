package Pertemuan7;

import java.util.Scanner;

import javax.swing.ToolTipManager;

/**
 * TugasBioskop09
 */
public class TugasBioskop09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalHarga, hargaTiket = 50000, totalTiketTerjual;

    while (true) {
      System.out.print("Masukan total tiket terjual : ");
      totalTiketTerjual = sc.nextInt();

      if (totalTiketTerjual < 0) {
        System.out.println("Tiket yang terjual tidak valid");
      } else {
        break;
      }
    }

    System.out.println("total tiket yang terjual adalah : " + totalTiketTerjual);
    totalHarga = totalTiketTerjual * hargaTiket;
    if (totalTiketTerjual > 10) {
      totalHarga -= totalHarga * 0.15;
    } else if (totalTiketTerjual > 4) {
      totalHarga -= totalHarga * 0.1;
    }
    System.out.println("Total harga adalah : " + totalHarga);
  }
}
