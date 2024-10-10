package Pertemuan6;

import java.util.Scanner;

public class Tugas3 {

  public static void main(String[] args) {
    Scanner input09 = new Scanner(System.in);

    String merk, kategori;
    byte ukuran;

    System.out.print("Masukan merek : ");
    merk = input09.next();
    System.out.print("Masukan kategori : ");
    kategori = input09.next();
    System.out.print("Masukan ukuran : ");
    ukuran = input09.nextByte();

    if (merk.equalsIgnoreCase("convere")) {
      if (kategori.equalsIgnoreCase("slip on")) {
        if (ukuran >= 36) {
          if (ukuran <= 40) {
            System.out.println("800000");
          } else {
            System.out.println("Ukuran tidak ada");
          }
        } else {
          System.out.println("Ukuran tidak ada");
        }
      } else if (kategori.equalsIgnoreCase("High top")) {
        if (ukuran >= 40) {
          if (ukuran <= 44) {
            System.out.println("1200000");
          } else {
            System.out.println("Ukuran tidak ada");
          }
        } else {
          System.out.println("Ukuran tidak ada");
        }
      } else {
        System.out.println("Kategori tidak ada");
      }
    } else if (merk.equalsIgnoreCase("sketchers")) {
      if (kategori.equalsIgnoreCase("woman")) {
        if (ukuran >= 36) {
          if (ukuran <= 41) {
            System.out.println("1000000");
          } else {
            System.out.println("Ukuran tidak ada");
          }
        } else {
          System.out.println("Ukuran tidak ada");
        }
      } else if (kategori.equalsIgnoreCase("man")) {
        if (ukuran >= 41) {
          if (ukuran <= 44) {
            System.out.println("1800000");
          } else {
            System.out.println("Ukuran tidak ada");
          }
        } else {
          System.out.println("Ukuran tidak ada");
        }
      } else {
        System.out.println("Kategori tidak ada");
      }
    } else if (merk.equalsIgnoreCase("nike")) {
      if (kategori.equalsIgnoreCase("kids")) {
        if (ukuran >= 36) {
          if (ukuran <= 41) {
            System.out.println("7500000");
          } else {
            System.out.println("Ukuran tidak ada");
          }
        } else {
          System.out.println("Ukuran tidak ada");
        }
      } else if (kategori.equalsIgnoreCase("adult")) {
        if (ukuran >= 40) {
          if (ukuran <= 44) {
            System.out.println("1500000");
          } else {
            System.out.println("Ukuran tidak ada");
          }
        } else {
          System.out.println("Ukuran tidak ada");
        }
      }
    }
  }
}
