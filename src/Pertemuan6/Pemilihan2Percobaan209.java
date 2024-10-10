package Pertemuan6;

import java.util.Scanner;

/**
 * Pemilihan2Percobaan209
 */
public class Pemilihan2Percobaan209 {

  public static void main(String[] args) {
    String member;
    double diskon;
    int harga, jumlahBeli, totalBayar = 0, menu;

    Scanner input09 = new Scanner(System.in);

    System.out.println("==============================");
    System.out.println("Menu kafe jti");
    System.out.println("==============================");
    System.out.println("1. ricebowl");
    System.out.println("2. ice tea");
    System.out.println("3. Paket bunding");
    System.out.println("===============================");
    System.out.print("Masukan menu : ");
    menu = input09.nextInt();

    System.out.print("Apakah anda mempunyai member (y / n) : ");
    member = input09.next();

    if (member.equalsIgnoreCase("y")) {
      diskon = 0.10;
      System.out.println("Besar diskon = 10%");
      if (menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
      } else if (menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
      } else if (menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
      } else {
        System.out.println("Masukan menu dengan benar");
        return;
      }
      totalBayar = (int) (harga - (harga * diskon));
      System.out.println("Total bayar setelah diskon : " + totalBayar);
    } else if (member.equals("n")) {

      if (menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
      } else if (menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
      } else if (menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
      } else {
        System.out.println("Masukan menu dengan benar");
        return;
      }
      System.out.println("Total bayar setelah diskon = " + harga);
    } else {
      System.out.println("Member tidak valid");
    }
    System.out.println("-----------------------");
  }
}
