package Pertemuan3;

import java.util.Scanner;

public class Tugas1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double totalTagihan, penggunaanListrik;
    int tarifPerKWH = 1500;

    System.out.print("Penggunaan listrik : ");
    penggunaanListrik = sc.nextDouble();

    if (penggunaanListrik > 500) System.out.println("Penggunaan lebih dari 500");
    totalTagihan = penggunaanListrik * tarifPerKWH;
    System.out.println("Total tagihan : Rp. " + totalTagihan);
    
  }
}
