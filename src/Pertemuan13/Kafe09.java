package Pertemuan13;

import java.util.Scanner;

public class Kafe09 {

  public static int hitungTotalHarga09(int[][] menuDanJumlah, String kodePromo) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = 0;
    for (int i = 0; i < menuDanJumlah.length; i++) {
      hargaTotal +=  (hargaItems[menuDanJumlah[i][0] - 1]) * menuDanJumlah[i][1];
    }
    if (kodePromo.equals("DISKON50")) {
      return hargaTotal -= hargaTotal * 0.5;
    } else if (kodePromo.equals("DISKON30")) {
      return hargaTotal -= hargaTotal * 0.3;
    } else {
      System.out.println("Tidak valid kode promo");
    }
    return hargaTotal;
  }

  public static void Menu(String namaPelanggan, boolean isMember,String kodepromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    if (isMember) {
      System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    if (kodepromo.equals("DISKON50")) {
      System.out.println("Diskon 50%");
    } else if (kodepromo.equals("DISKON30")) {
      System.out.println("Diskon 30%");
    } else {
      System.out.println("Kode tidak valid");
    }
    System.out.println("==== MENU RESTO KAFE =====");
    System.out.println("1. Kopi hitam - Rp 15,000 ");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silahkan pilih menu yang anda inginkan.");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   Menu("Andi", true, "DISKON50");

    System.out.print("Masukan jumlah menu yang anda inginkan : ");
    int jumlahMenu = sc.nextInt();
    int[][] menuDanJumlah = new int[jumlahMenu][2];
    for (int i = 0; i < menuDanJumlah.length; i++) {
      System.out.print("Masukan menu ke " + (i + 1) + " : ");
      menuDanJumlah[i][0] = sc.nextInt();
      System.out.print("Masukan jumlah yang dibeli : ");
      menuDanJumlah[i][1] = sc.nextInt();
      System.out.println("===================================");
    }

    System.out.print("Masukan kode promo: ");
    int totalPesananAnda = 0;
    String kodePromo = sc.next();
    for (int i = 0; i < menuDanJumlah.length; i++) {
      totalPesananAnda += menuDanJumlah[i][1];
    }

    int totalHarga = hitungTotalHarga09(menuDanJumlah, kodePromo);
    System.out.println("Total pesanan anda : " + totalPesananAnda);
    System.out.println("Total harga untuk pesanan anda : Rp " + totalHarga);
  }
}
