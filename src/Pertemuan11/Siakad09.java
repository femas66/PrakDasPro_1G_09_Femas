package Pertemuan11;

import java.util.Scanner;

public class Siakad09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahassiswa : ");
    int jmlhMhs = sc.nextInt();
    System.out.print("Masukan jumlah matkul : ");
    int jmlMatkul = sc.nextInt();
    int[][] nilai = new int[jmlhMhs][jmlMatkul];

    for (int i = 0; i < nilai.length; i++) {
      double totalPerSiswa = 0;
      System.out.println("Input nilai mahasiswa ke-" + (i+1));
      for (int j = 0; j < nilai[i].length; j++) {
        System.out.print("Nilai matkul "+(j+1)+": ");
        nilai[i][j] = sc.nextInt();
        totalPerSiswa += nilai[i][j];
      }
      System.out.println("Rata rata : " + (totalPerSiswa/nilai[i].length));
    }

    System.out.println("Rata rata nilai setiap matkul");
    for (int j = 0; j < 3; j++) {
      double totalPerMatkul = 0;
      for (int i = 0; i < 4; i++) {
        totalPerMatkul += nilai[i][j];
      }
      System.out.println("Matkul "+ (j + 1) + ": " + totalPerMatkul/4);
    }
  }
}
