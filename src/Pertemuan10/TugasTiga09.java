package Pertemuan10;

import java.util.Scanner;

public class TugasTiga09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean ada = false;

    String[] menu = {"Nasi goreng", "Mie goreng", "roti bakar", "kentang goreng", "teh tarik", "capuccino", "Chocolate ice"};
    System.out.print("Masukan nama makanan yang ingin di cari : ");
    String cari = sc.nextLine();

    for (int i = 0; i<menu.length;i++){
      if (cari.equalsIgnoreCase(menu[i])) {
        ada = true;
        break;
      }
    }

    System.out.println(ada ? "Makanan tersedia" : "Makanan tidak ditemukan");
  }
}
