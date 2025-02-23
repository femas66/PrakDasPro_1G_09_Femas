package Pertemuan7;

import java.util.Scanner;

/**
 * KafeDoWhile09
 */
public class KafeDoWhile09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kopi, teh, roti;
    String namaPelanggan;
    int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 2000, totalHarga;

    do {
      System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) : ");
      namaPelanggan = sc.nextLine();

      if (namaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan");
        break;
      }
      System.out.print("Jumlah kopi : ");
      kopi = sc.nextInt();
      System.out.print("Jumlah teh : ");
      teh = sc.nextInt();
      System.out.print("Jumlah roti : ");
      roti = sc.nextInt();
      totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
      System.out.println("Total yang harus anda bayar adalah : " + totalHarga);
      sc.nextLine();

    } while (true);
    System.out.println("Semua transaksi telah selesai");
  }
}
