package Pertemuan6;

import java.util.Scanner;

public class Tugas3 {

  public static void main(String[] args) {
    Scanner inpt = new Scanner(System.in);

    int ukuran;
    String merk, kategori;

    System.out.print("merek : ");
    merk = inpt.next();
    System.out.print("kategori : ");
    kategori = inpt.next();
    System.out.print("ukuran : ");
    ukuran = inpt.nextInt();

    if (merk.equals("convere")) {
      if (kategori.equals("slip on")) {
        if (ukuran >= 36 && ukuran <= 40) {
            System.out.println("800000");
          
        }
      } else if (kategori.equals("High top")) {
        if (ukuran >= 40 && ukuran <= 44) {
          System.out.println("1200000");
        }
      }
    } else if (merk.equals("sketchers")) {
      if (kategori.equals("woman")) {
        if (ukuran >= 36 && ukuran <= 41) {
         
            System.out.println("1000000");
          }
      } else if (kategori.equals("man")) {
        if (ukuran >= 41 && ukuran <= 44) {
          
            System.out.println("1800000");
        }
      }
    } else if (merk.equals("nike")) {
      if (kategori.equals("kids")) {
        if (ukuran >= 36 && ukuran <= 41) { 
            System.out.println("7500000");
        }
      } else if (kategori.equals("adult")) {
        if (ukuran >= 40 && ukuran <= 44) {
          
            System.out.println("1500000");
          
        
        }
      }
    }
  }
}
