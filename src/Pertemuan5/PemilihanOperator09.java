package Pertemuan5;

import java.util.Scanner;

public class PemilihanOperator09 {
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

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        }
        else {
            System.out.println("Yang anda pilih tidak sesuai");
        }
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
