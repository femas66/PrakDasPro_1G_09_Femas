package Pertemuan10;

import java.util.Scanner;

public class TugasDua09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = 0;
    System.out.print("Masukan jumlah pesanan : ");
    int jumlahPesanan = sc.nextInt();

    String[] pesanan = new String[jumlahPesanan];
    int[] harga = new int[jumlahPesanan];

    for (int i=0;i<jumlahPesanan;i++){
      System.out.print("Masukan nama pesanan : ");
      pesanan[i] = sc.next();
      System.out.print("Masukan harga pesanan : ");
      harga[i] = sc.nextInt();
      total += harga[i];
    }

    for (int i=0;i<jumlahPesanan;i++) {
      System.out.println("Nama pesanan ke " + (i+1) + ": " + pesanan[i]);
      System.out.println("Harga pesanan ke " + (i+1) + ": " + harga[i]);
      System.out.println("=====================");
    }
    System.out.println("Total : " + total);
  }
}
