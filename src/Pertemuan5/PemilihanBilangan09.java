package Pertemuan5;

import java.util.Scanner;

public class PemilihanBilangan09 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int angka;

    System.out.print("input angka : ");
    angka = input.nextInt();

    if (angka % 2 == 0) {
      System.out.println(angka + " adalah bilangan genap");
    } else {
      System.out.println(angka + " adalah bilangan ganjil");
    }
  }
}
