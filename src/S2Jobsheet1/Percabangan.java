package S2Jobsheet1;

import java.util.Scanner;

public class Percabangan {
	public static void main(String[] args) {
		double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, total, nilai;
		String nilaiHuruf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program menghitung nilai akhir");
		System.out.println("======================");
		System.out.print("Masukan nilai tugas: ");
		nilaiTugas = sc.nextDouble();
		System.out.print("Masukan nilai kuis: ");
		nilaiKuis = sc.nextDouble();
		System.out.print("Masukan nilai UTS: ");
		nilaiUTS = sc.nextDouble();
		System.out.print("Masukan nilai UAS: ");
		nilaiUAS = sc.nextDouble();
		System.out.println("======================");
		System.out.println("======================");
		if (nilaiTugas > 100 && nilaiTugas < 0) {
			System.out.println("Nilai tidak valid");
			return;
		}
		if (nilaiTugas > 100 || nilaiTugas < 0) {
			System.out.println("Nilai tidak valid");
			return;
		}
		if (nilaiKuis > 100 || nilaiKuis < 0) {
			System.out.println("Nilai tidak valid");
			return;
		}
		if (nilaiUTS > 100 || nilaiUTS < 0) {
			System.out.println("Nilai tidak valid");
			return;
		}
		if (nilaiUAS > 100 || nilaiUAS < 0) {
			System.out.println("Nilai tidak valid");
			return;
		}
		System.out.println("===================");
		nilaiTugas = (nilaiTugas * 0.2);
		nilaiKuis = (nilaiKuis * 0.2);
		nilaiUTS = (nilaiUTS * 0.3);
		nilaiUAS = (nilaiUAS * 0.3);
		total = nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS;
		System.out.println("Nilai akhir: " + total);
		if (total > 80 && total <= 100) {
			nilaiHuruf = "A";
			nilai = 4;
		} else if (total > 73 && total <= 80) {
			nilaiHuruf = "B+";
			nilai = 3.5;
		} else if (total > 65 && total <= 73) {
			nilaiHuruf = "B";
			nilai = 3;
		} else if (total > 60 && total <= 65) {
			nilaiHuruf = "C+";
			nilai = 2.5;
		} else if (total > 50 && total < 60) {
			nilaiHuruf = "C";
			nilai = 2;
		} else if (total > 39 && total <= 50) {
			nilaiHuruf = "D";
			nilai = 1;
		} else {
			nilai = 0;
			nilaiHuruf = "E";
		}
		System.out.println("Nilai huruf: " + nilaiHuruf);
		System.out.println("===================");
		if (nilai >= 2)
			System.out.println("SELAMAT ANDA LULUS");
		else
			System.out.println("ANDA TIDAK LULUS");
	}
	
}
