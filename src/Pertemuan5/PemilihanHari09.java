package Pertemuan5;

import java.util.Scanner;

public class PemilihanHari09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String dayName, dayType;

    System.out.print("Masukan nama hari : ");
    dayName = input.nextLine();

    switch (dayName) {
      case "monday":
      case "tuesday":
      case "wednesday":
      case "thursday":
      case "friday":
        dayType = "weekday";
        break;

      case "saturday":
      case "sunday":
        dayType = "weekend";
      default:
        dayType = "Invalid";
        break;
    }
    System.out.println(dayName + " is a " + dayType);
  }
}
