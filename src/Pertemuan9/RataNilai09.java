package Pertemuan9;

import java.util.Scanner;

public class RataNilai09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float totalNilai, nilai, rataNilai;
    int i, j;
    i = 1;
    while (i<=5) {
      
      totalNilai = 0;
      System.out.println("Input nilai mahasiswa ke " + i);
      for (j=1;j<=5;j++){
        System.out.print("Nilai ke " + j + " = ");
        nilai = sc.nextInt();
        totalNilai += nilai;
      }
      rataNilai = totalNilai/5;
      System.out.println("Rata rata nilai mahasiswa ke " + i + " adalah = " + rataNilai);
      i++;
    }
  }
}
