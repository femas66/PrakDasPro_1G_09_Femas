package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int panjang;
    System.out.print("Masukan jumlah mahasiswa : ");
    panjang = sc.nextInt();
    int[] nilaiMhs = new int[panjang];
    double total = 0;
    double rata2;
    int banyakLolos = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
      System.out.print("Masukan nilai mahasiswa ke " + (i + 1) + " : ");
      nilaiMhs[i] = sc.nextInt();
    }

    for (int i = 0; i< nilaiMhs.length; i++) {
      total += nilaiMhs[i];
      if (nilaiMhs[i] > 70) banyakLolos++;
    }

    rata2 = total/nilaiMhs.length;
    System.out.println("Jumlah lolos : " + banyakLolos);
    System.out.println("Rata rata nilai adalah : " + rata2);
  }
}
