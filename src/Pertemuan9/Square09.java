package Pertemuan9;

import java.util.Scanner;

public class Square09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan nilai N = ");
    int n = sc.nextInt();

    for (int i = 0; i<n; i++) {
      for(int j=0;j<n;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  } 
}
