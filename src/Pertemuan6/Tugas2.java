package Pertemuan6;

import java.util.Scanner;

public class Tugas2 {

  public static void main(String[] args) {
    Scanner input09 = new Scanner(System.in);

    String hari, jenisBuku;
    int diskon_persen = 0, jumlahBuku;

    System.out.print("Masukan hari : ");
    hari = input09.next();
    System.out.print("Masukan jumlah buku : ");
    jumlahBuku = input09.nextInt();
    System.out.print("Masukan jenis buku : ");
    jenisBuku = input09.next();

    if (hari.equalsIgnoreCase("rabu")) {
      if (jenisBuku.equalsIgnoreCase("kamus")) {
        diskon_persen = 10;
        if (jumlahBuku > 2) {
          diskon_persen += 2;
        }
      } else if (jenisBuku.equalsIgnoreCase("novel")) {
        diskon_persen = 7;
        if (jumlahBuku > 3) {
          diskon_persen += 2;
        } else {
          diskon_persen += 1;
        }
      } else {
        if (jumlahBuku > 3) {
          diskon_persen = 5;
        }
      }
    }
    System.out.println("Diskon yang di dapat = " + diskon_persen);
  }
}
