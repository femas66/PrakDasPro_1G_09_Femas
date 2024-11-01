package Pertemuan9;

import java.util.Scanner;

/**
 * TugasDua09
 */
public class TugasDua09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i=0; i<4;i++) {
      if (i == 0) {
        System.out.println("Badminton");
      } else if (i == 1) {
        System.out.println("Tenis meja");
      } else if (i == 2) {
        System.out.println("Basket");
      } else if (i == 3) {
        System.out.println("Bola voly");
      }
      for (int j = 0; j < 5; j++) {
        System.out.print("Masukan nama atlet ke " + (j + 1) + " : ");
        String nama = sc.next();
      }
      System.out.println("");
    }
  }
}