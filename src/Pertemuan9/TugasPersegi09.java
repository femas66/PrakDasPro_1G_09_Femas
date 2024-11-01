package Pertemuan9;

import java.util.Scanner;

public class TugasPersegi09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Masukan n : (minimal 3)");
    n = sc.nextInt();
    if (n < 3) {
      System.out.println("Min 3");
      return;
    }
    for (int i = 0; i < n; i++) {
      for(int j=0;j<n;j++){
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print(n + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }
}
