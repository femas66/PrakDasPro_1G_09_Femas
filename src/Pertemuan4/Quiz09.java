package Pertemuan4;

import java.util.Scanner;

public class Quiz09 {
  public static void main(String[] args) {
    Scanner input09 = new Scanner(System.in);
    int tanggalBerangkat09, bulanBerangkat09, tanggalPulang09, bulanPulang09, bulanLama09, hariLama09, tahunBerangkat09, tahunPulang09, tahunLama09;

    System.out.println("Nama : Femas Akbar Faturrohim");
    System.out.println("NIM : 244107020200");
    System.out.println("ABSEN : 09");
    System.out.println("================== QUIZ 1 TI - 1G =================");
    System.out.print("masukan tanggal berangkat : ");
    tanggalBerangkat09 = input09.nextByte();
    System.out.print("masukan bulan berangkat : ");
    bulanBerangkat09 = input09.nextByte();
    System.out.print("masukan tahun berangkat : ");
    tahunBerangkat09 = input09.nextInt();
    System.out.println("tanggal berangkat : " + tanggalBerangkat09 + "-" + bulanBerangkat09 + "-" + tahunBerangkat09);
    System.out.println();
    System.out.print("masukan tanggal pulang : ");
    tanggalPulang09 = input09.nextByte();
    System.out.print("masukan bulan pulang : ");
    bulanPulang09 = input09.nextByte();
    System.out.print("masukan tahun pulang : ");
    tahunPulang09 = input09.nextInt();
    System.out.println("tanggal kepulangan : " + tanggalPulang09 + "-" + bulanPulang09 + "-" + tahunPulang09);
    System.out.println();
    hariLama09 = tanggalPulang09 - tanggalBerangkat09;
    bulanLama09 =  bulanPulang09 - bulanBerangkat09;
    tahunLama09 =  tahunPulang09 - tahunBerangkat09;
    System.out.println("Lama student exchange anda adalah : " + tahunLama09 + " tahun " + bulanLama09 + " bulan " + hariLama09 + " hari");

  }
}