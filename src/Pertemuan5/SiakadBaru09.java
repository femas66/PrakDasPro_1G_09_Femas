package Pertemuan5;

import java.util.Scanner;

public class SiakadBaru09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nama, nim, kelas, kualifikasi,nilaiHuruf;
    
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    System.out.print("Masukan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukan kelas: ");
    kelas = sc.nextLine();
    System.out.print("Masukan nomor absen: ");
    absen = sc.nextByte();

    System.out.print("Masukan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukan nilai UTS: ");
    nilaiUTS = sc.nextDouble();
    System.out.print("Masukan nilai UAS: ");
    nilaiUAS = sc.nextDouble();

    nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai akhir: " + nilaiAkhir);

    if (80 < nilaiAkhir && nilaiAkhir <= 100) {
      nilaiHuruf = "A";
      kualifikasi = "Sangat baik";
    } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
      nilaiHuruf = "B+";
      kualifikasi = "Lebih dari baik";
    } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
      nilaiHuruf = "B";
      kualifikasi = "Baik";
    } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
      nilaiHuruf = "C+";
      kualifikasi = "Lebih dari cukup";
    } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
      nilaiHuruf = "C";
      kualifikasi = "Cukup";
    } else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
      nilaiHuruf = "D";
      kualifikasi = "Kurang";
    } else {
      nilaiHuruf = "E";
      kualifikasi = "Gagal";
    }
    System.out.println("Nilai akhir huruf : " + nilaiHuruf);
    System.out.println("Kualifikasi : " + kualifikasi);
  }
}
