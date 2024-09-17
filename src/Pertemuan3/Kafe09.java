package Pertemuan3;

import java.util.Scanner;

public class Kafe09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean keanggotaan;
    int jumlahKopi, jumlahTeh, jumlahRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 2000.0, totalHarga, nominalBayar;
    float diskon = 10 / 100;
    int nominalInt;
    byte totalByte;

    System.out.print("Masukan keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();

    System.out.print("Masukan jumlah pembelian kopi: ");
    jumlahKopi = input.nextInt();
    System.out.print("Masukan jumlah pembelian teh: ");
    jumlahTeh = input.nextInt();
    System.out.print("Masukan jumlah pembelian rpto: ");
    jumlahRoti = input.nextInt();

    totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);
    nominalInt = (int) totalHarga;
    totalByte = (byte) totalHarga;
    nominalBayar = totalHarga - (diskon*totalHarga);
    System.out.println("Keanggotaan pelanggan " + keanggotaan);
    System.out.println("Item pemblian " + jumlahKopi + " kopi, "+ jumlahTeh +  " teh, " + jumlahRoti + " roti");
    System.out.println("Nominal bayar Rp " + nominalBayar);
    System.out.println("Total harga : " + totalHarga);
    System.out.println("Total int : " + nominalInt);
    System.out.println("Total byte : " + totalByte);
  }
}
