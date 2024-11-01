package Pertemuan10;

import java.util.Scanner;

public class SearchNilai09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan banyaknya nilai yang akan di input : ");
    int banyakNilai = sc.nextInt();
    int[] arrNilai = new int[banyakNilai];
    int key;
    int hasil = -1;

    for (int i = 0; i < arrNilai.length; i++) {
      System.out.print("Masukan nilai mahasiswa ke " + (i + 1) + " : ");
      arrNilai[i] = sc.nextInt();
    }

    System.out.print("Masukan nilai yang ingin di cari : ");
    key = sc.nextInt();

    for (int i = 0; i< arrNilai.length; i++) {
      if (key == arrNilai[i]) {
        hasil = i;
        break;
      }
    }
    if (hasil < 0) {
      System.out.println("Nilai yang dicari tidak ditemukan");
    } else {
      System.out.println("Nilai " + key + " ketemu di index ke " + hasil);
    }
  }
}
