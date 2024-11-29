package Latihan;

import java.util.Random;
import java.util.Scanner;

/**
 * Latihan3
 */
public class Latihan3 {

  public static void main(String[] args) {
    Scanner femas = new Scanner(System.in);

    Random rand = new Random();

    int benar = rand.nextInt(100);

    while (true) {
      int tebakan = femas.nextInt();
      if (tebakan == benar) {
        System.out.println("Benar");
        break;
      } else if (tebakan > benar) {
        System.out.println("Angka terlalu besar");
      } else if (tebakan < benar) {
        System.out.println("Angka terlalu kecil");
      }

    }

  }
}
