package Pertemuan10;

import java.util.Scanner;

public class TugasAwal09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jmlMhs, tertinggi = 0, terendah = 100;
    double total = 0, rata2;

    System.out.print("Masukan jumlah mahasiswa : ");
    jmlMhs = sc.nextInt();
    int[] nilaiMhs = new int[jmlMhs];

    for(int i=0;i<nilaiMhs.length;i++){
      System.out.print("Masukan nilai mahasiswa ke " + (i + 1) + " : ");
      nilaiMhs[i] = sc.nextInt();
      total += nilaiMhs[i];
      if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
      if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
    }
    rata2 = total/nilaiMhs.length;
    System.out.println("Rata rata adalah : " + rata2);
    System.out.println("Nilai tertinggi : " + tertinggi);
    System.out.println("Nilai terendah : " + terendah);
    for (int nilaiTmp : nilaiMhs) System.out.println(nilaiTmp);
  }
}
