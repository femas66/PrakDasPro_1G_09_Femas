package Quiz09;

import java.util.Scanner;

public class Quiz09 {

  static Scanner scanner09 = new Scanner(System.in);

  static byte menu() {
    System.out.println("\n\nMenu : ");
    System.out.println("1. Tampilkan nilai");
    System.out.println("2. Tampilkan nilai akhir");
    System.out.print("Pilih menu : ");
    byte dipilih09 = scanner09.nextByte();
    return dipilih09;
  }

  static int[][] nilaiNilai09 = {
    {80,85,80,85},
    {60,60,70,75},
    {40,90,50,55},
    {45,75,60,80},
    {75,61,72,40},
  };
  static String[] namaNama09 = {
    "Sito",
    "Semi",
    "Risma",
    "Vero",
    "Barri",
  };

  static void menuSatu() {
    byte totalRemidi09 = 0;
    System.out.println("\tTugas\tKuis\tUTS\tUAS");
    for (int i = 0; i < nilaiNilai09.length; i++) {
      System.out.print(namaNama09[i] + "\t");
      for (int j = 0; j < nilaiNilai09[i].length; j++) {
        System.out.print(nilaiNilai09[i][j] + "\t");
        if (nilaiNilai09[i][j] < 60) totalRemidi09++;
      }
      System.out.println("");
    }
    System.out.println("Banyak komponen yang harus remidi adalah :" + totalRemidi09);
  }

  static void menuDua() {
    System.out.println("\tTugas\tKuis\tUTS\tUAS\tNilai Akhir");
    double rataRataNilaiAkhir09 = 0;
    for (int i = 0; i < nilaiNilai09.length; i++) {
      System.out.print(namaNama09[i] + "\t");
      double nilaiAkhir09 = 0;
      for (int j = 0; j < nilaiNilai09[i].length; j++) {
        if (j == 0 || j == 1) {
          nilaiAkhir09 += nilaiNilai09[i][j] * 0.2;
        } else if (j == 2 || j == 3) {
          nilaiAkhir09 += nilaiNilai09[i][j] * 0.3
        }
        System.out.print(nilaiNilai09[i][j] + "\t");
      }
      System.out.print(nilaiAkhir09);
      System.out.println("");
      rataRataNilaiAkhir09 += nilaiAkhir09;
    }
    System.out.println("Rata rata nilai akhir : " + rataRataNilaiAkhir09 / nilaiNilai09.length);
  }

  public static void main(String[] args) {
    while (true) {
      byte dipilih = menu();
      if (dipilih == 1) {
        menuSatu();
      }
      else if (dipilih == 2) {
        menuDua();
      } else {
        System.out.println("Pilihan yang anda input tidak valid!");
        break;
      }
    }
    
  }
}
