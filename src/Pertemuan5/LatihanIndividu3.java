package Pertemuan5;

import java.util.Objects;
import java.util.Scanner;

public class LatihanIndividu3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String namaMakanan;
    int harga,jumlah,total;

    System.out.print("Nama makanan : ");
    namaMakanan = input.nextLine();
    System.out.print("Harga makanan : ");
    harga = input.nextInt();
    System.out.print("Jumlah makanan : ");
    jumlah = input.nextInt();

    if (Objects.equals(namaMakanan, "nasi goreng") || Objects.equals(namaMakanan, "mie rebus") || Objects.equals(namaMakanan, "fuyunghai")) {
      total = harga * jumlah;
      if (100000 < total && total <= 200000) {
        total -= (int) (total * 0.02);
      } else if (200000 < total && total <= 500000) {
        total -= (int) (total * 0.05);
      } else if (500000 > total) {
        total -= (int) (total * 0.1);
      }
      System.out.println("Total : " + total);
    } else {
      System.out.println("Tidak mendapatkan diskon");
    }
  }
}
