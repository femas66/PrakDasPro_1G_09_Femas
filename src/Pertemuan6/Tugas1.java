package Pertemuan6;

import java.util.Scanner;

public class Tugas1 {

  public static void main(String[] args) {
    int bil1, bil2, bil3;
    Scanner input09 = new Scanner(System.in);

    System.out.print("Masukan bilangan 1 : ");
    bil1 = input09.nextInt();
    System.out.print("Masukan bilangan 2 : ");
    bil2 = input09.nextInt();
    System.out.print("Masukan bilangan 2 : ");
    bil3 = input09.nextInt();

    if (bil1 > bil2) {
      if (bil1 > bil3) {
        System.out.println(bil1);
      } else {
        System.out.println(bil3);
      }
    } else if (bil2 > bil3) {
      System.out.println(bil2);
    } else {
      System.out.println(bil3);
    }
  }
}
