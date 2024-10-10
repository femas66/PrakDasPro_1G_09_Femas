package Pertemuan5;

import java.util.Scanner;

public class PemilihanHariDenganIf09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte hari;
        String dayType = null;

        System.out.print("Masukan hari : ");
        hari = input.nextByte();

        if (hari == 1 || hari == 2 || hari == 3 || hari == 4 || hari == 5) {
            dayType = "Weekday";
        } else if (hari == 6 || hari == 7) {
            dayType = "Weekend";
        }

        System.out.println(hari + " is a " + dayType);
    }

}
