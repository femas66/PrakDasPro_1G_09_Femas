package Pertemuan5;

import java.util.Scanner;

public class PemilihanSwitch09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double angka1, angka2, hasil = 0;
    char operator;

    System.out.print("Masukan angka 1 : ");
    angka1 = input.nextDouble();
    System.out.print("Masukan angka 2 : ");
    angka2 = input.nextDouble();
    System.out.print("Masukan operator : ");
    operator = input.next().charAt(0);

    switch (operator) {
      case '+':
        hasil = angka1 + angka2;
        break;
      case '-':
        hasil = angka1 - angka2;
        break;
      case '*':
        hasil = angka1 * angka2;
        break;
      case '/':
        hasil = angka1 / angka2;
        break;
      default:
        System.out.println("Yang anda pilih tidak sesuai");
        break;

    }
    System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
  }
}
