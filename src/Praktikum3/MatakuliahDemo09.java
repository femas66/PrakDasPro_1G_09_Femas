package Praktikum3;

import java.util.Scanner;

public class MatakuliahDemo09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Jumlah Matakuliah : ");
		int jumlahMatakuliah = sc.nextInt();
		Matakuliah09[] arrayOfMatakuliah = new Matakuliah09[jumlahMatakuliah];
		String kode, nama, dummy;
		int sks, jumlahJam;
		for(int i = 0; i < 3; i++) {
			System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
			System.out.print("Kode      : ");
			kode = sc.nextLine();
			System.out.print("Nama      : ");
			nama = sc.nextLine();
			System.out.print("Sks       : ");
			dummy = sc.nextLine();
			sks = Integer.parseInt(dummy);
			System.out.print("Jumlah Jam: ");
			dummy = sc.nextLine();
			jumlahJam = Integer.parseInt(dummy);
			System.out.println("--------------------------------------");
			arrayOfMatakuliah[i] = new Matakuliah09();
			arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
		}
		for(int i = 0; i < 3; i++) {
			arrayOfMatakuliah[i].cetakInfo();
		 }
	}
	
}
