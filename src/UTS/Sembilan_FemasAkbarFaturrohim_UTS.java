package UTS;

import java.util.Scanner;

public class Sembilan_FemasAkbarFaturrohim_UTS {
  public static void main(String[] args) {
    Scanner femas = new Scanner(System.in);
    byte menu;

    String nama = "", alamat = "", noHp = "", confirm = "";
    int jumlahPenjualanSepeda = 0, masaKerja = 0, jumlahCuti = 0,totalKomisi = 0, totalSetelahKomisi = 0, tunjangan = 0, cuti = 0;

    double komisi = 0, totalGaji = 0;
    int hargaSatuBuahSepeda = 1500000, totalHasilMenjualSepeda = 0;

    while (true) {
      System.out.println("== UTS PRAKTIKUM PEMGROGRAMAN TI-1G =======");
      System.out.println("Dibuat oleh\t: Femas Akbar Faturrohim");
      System.out.println("NIM\t\t: 244107020200");
      System.out.println("===========================================");
      System.out.println("Pilih menu : ");
      System.out.println("1. Data Karyawan");
      System.out.println("2. Gaji Karyawan");
      System.out.print("Menu : ");
      menu = femas.nextByte();
      if (menu == 2) {
        if (nama.isEmpty() || nama.equals("")) {
          System.out.println("Masukan data karyawan terlebih dahulu");
          System.out.print("Kembali ke menu ? (y/t)");
          confirm = femas.next();
          if (!confirm.equalsIgnoreCase("y")) {
            break;
          } else {
            continue;
          }
        } else {
          totalHasilMenjualSepeda = hargaSatuBuahSepeda * jumlahPenjualanSepeda;
          if (totalHasilMenjualSepeda > 10000000) {
            komisi = 0.15;
          } else if (totalHasilMenjualSepeda > 5000000 && totalHasilMenjualSepeda <= 10000000) {
            komisi = 0.07;
          } else if (totalHasilMenjualSepeda > 3000000 && totalHasilMenjualSepeda <= 5000000) {
            komisi = 0.05;
          } else if (totalHasilMenjualSepeda == 3000000) {
            komisi = 0.02;
          }
          totalKomisi = (int) (totalHasilMenjualSepeda * komisi);
          totalSetelahKomisi = totalHasilMenjualSepeda + totalKomisi;

          if (masaKerja > 8) {
            tunjangan = 3000000;
          } else if (masaKerja >= 6 && masaKerja <= 8) {
            tunjangan = 2000000;
          } else if (masaKerja >= 3 && masaKerja <= 5) {
            tunjangan = 1000000;
          }

          cuti = jumlahCuti * 35000;
          totalGaji = totalKomisi + tunjangan - cuti;

          System.out.println("============= DATA GAJI ================");
          System.out.println("Nama : " + nama);
          System.out.println("Komisi : " + komisi * totalHasilMenjualSepeda);
          System.out.println("Tunjangan : " + tunjangan);
          System.out.println("Potongan cuti : " + cuti);
          System.out.println("Gaji yang diterima : " + totalGaji);
          System.out.print("Kembali ke menu? : (y/t) ");
          confirm = femas.next();
          if (confirm.equalsIgnoreCase("y")) {
            continue;
          }
          break;
        }
      } else if (menu == 1) {
        System.out.println("Masukan data karyawan\n");
        System.out.print("Masukan nama : ");
        nama = femas.next();
        System.out.print("Masukan alamat : ");
        alamat = femas.next();
        System.out.print("Masukan NoHP : ");
        noHp = femas.next();
        System.out.print("Jumlah penjualan sepeda : ");
        jumlahPenjualanSepeda = femas.nextInt();
        System.out.print("Masa kerja : ");
        masaKerja = femas.nextInt();
        System.out.print("lama cuti : ");
        jumlahCuti = femas.nextInt();

        System.out.print("Apakah anda ingin mencetak data karyawan ? (y/t) ");
        confirm = femas.next();
        if (confirm.equalsIgnoreCase("y")) {
          System.out.println("===========================");
          System.out.println("Data Karyawan");
          System.out.println("===========================");
          System.out.println("Nama : " + nama);
          System.out.println("Alamat : " + alamat);
          System.out.println("NoHp : " + noHp);
          System.out.println("Jumlah penjualan sepeda : " + jumlahPenjualanSepeda + " sepeda");
          System.out.println("Masa kerja : " + masaKerja + " tahun");
          System.out.println("Lama cuti : " + jumlahCuti + " hari");
        }
        System.out.print("Kembali ke menu ? (y/t) ");
        confirm = femas.next();
        if (confirm.equalsIgnoreCase("y")) {
          continue;
        }
        break;
      }
    }

  } 
}
