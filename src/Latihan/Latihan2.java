package Latihan;

import java.util.Scanner;

public class Latihan2 {
  public static void main(String[] args) {
    Scanner femas = new Scanner(System.in);

    double bb = femas.nextDouble();
    double tb = femas.nextDouble() / 100;
    double imt = bb / (tb * tb);
    if (imt < 17) {
      System.out.println("Sangat kurus");
    } else if (imt >= 17 && imt < 18.5) {
      System.out.println("Kurus");
    } else if (imt >= 18.5 && imt < 25.0) {
      System.out.println("Normal");
    } else if (imt >= 25.0 && imt <= 27) {
      System.out.println("Gemuk");
    } else {
      System.out.println("Obesitas");
    }
  }
}
