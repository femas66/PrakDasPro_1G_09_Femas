package Pertemuan5;

import java.util.Scanner;

public class PemilihanBilangan09 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int angka;

    System.out.print("input angka : ");
    angka = input.nextInt();

    System.out.println((angka % 2 == 0) ? angka + " adalah bilangan genap" : angka + " adalah bilangan ganjil");
  }
}
