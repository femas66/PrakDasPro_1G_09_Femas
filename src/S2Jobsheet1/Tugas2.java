package S2Jobsheet1;

import java.util.Scanner;

public class Tugas2 {
	static Scanner sc = new Scanner(System.in);
	public static int tampilkanMenu() {
		System.out.println("1. Rumus menghitung volume kubus");
		System.out.println("2. Rumus menghitung luas kubus");
		System.out.println("3. Rumus menghitung keliling kubus");
		return sc.nextInt();
	}
	public static void hitungVolume(int sisi) {
		int volume = sisi * sisi * sisi;
		System.out.println("Volume kubus adalah " + volume);
	}
	public static void hitungLuas(int sisi) {
		int luas = 6 * sisi * sisi;
		System.out.println("Luas kubus adalah " + luas);
	}
	public static void hitungKeliling(int sisi) {
		int keliling = 12 * sisi;
		System.out.println("Keliling kubus adalah " + keliling);
	}
	public static void main(String[] args) {
		int pilihan;
		pilihan = tampilkanMenu();
		if (pilihan == 1) {
			System.out.print("Masukan sisi: ");
			int sisi = sc.nextInt();
			hitungVolume(sisi);
		} else if (pilihan == 2) {
			System.out.print("Masukan sisi: ");
			int sisi = sc.nextInt();
			hitungLuas(sisi);
		} else if (pilihan == 3) {
			System.out.print("Masukan sisi: ");
			int sisi = sc.nextInt();
			hitungKeliling(sisi);
		}
	}
}
