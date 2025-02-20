package S2Jobsheet1;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("Program menghitung nilai semester");
		System.out.println("======================");

		System.out.print("Masukan jumlah mata kuliah : ");
		byte jmlMatkul = (byte) sc.nextInt();

		String[] matkul = new String[jmlMatkul];

		for (int i = 0; i < jmlMatkul; i++) {
			System.out.print("Masukan nama matkul ke-" + (i + 1) + " : ");
			matkul[i] = sc.next();
		}

		double[] nilai = new double[jmlMatkul];
		String[] nilaiHuruf = new String[jmlMatkul];
		double[] bobotNilai = new double[jmlMatkul];
		double[] bobotSks = new double[jmlMatkul];
		double sementara = 0, totalSks = 0, ips = 0;

		for (int i = 0; i < jmlMatkul; i++) {
			System.out.print("Masukan nilai Angka untuk MK " + matkul[i] + " : ");
			nilai[i] = sc.nextDouble();
			System.out.print("Bobot sks : ");
			bobotSks[i] = sc.nextDouble();
			String nilaiH;
			double nilaiAngka;
			if (nilai[i] > 80 && nilai[i] <= 100) {
				nilaiH = "A";
				nilaiAngka = 4;
			} else if (nilai[i] > 73 && nilai[i] <= 80) {
				nilaiH = "B+";
				nilaiAngka = 3.5;
			} else if (nilai[i] > 65 && nilai[i] <= 73) {
				nilaiH = "B";
				nilaiAngka = 3;
			} else if (nilai[i] > 60 && nilai[i] <= 65) {
				nilaiH = "C+";
				nilaiAngka = 2.5;
			} else if (nilai[i] > 50 && nilai[i] < 60) {
				nilaiH = "C";
				nilaiAngka = 2;
			} else if (nilai[i] > 39 && nilai[i] <= 50) {
				nilaiH = "D";
				nilaiAngka = 1;
			} else {
				nilaiAngka = 0;
				nilaiH = "E";
			}
			bobotNilai[i] = nilaiAngka;
			nilaiHuruf[i] = nilaiH;

			totalSks += bobotSks[i];

			sementara += bobotNilai[i] * bobotSks[i];
		}

		System.out.println("======================");
		System.out.println("Hasil Konversi Nilai");
		System.out.println("======================");


		for (int i = -1; i < jmlMatkul; i++) {
			if (i == -1) {
				System.out.print("MK\t\t");
				System.out.print("Nilai Angka\t");
				System.out.print("Nilai Huruf\t");
				System.out.print("Bobot Nilai\t");
			} else {
				System.out.print(matkul[i] + "\t");
				System.out.print(nilai[i] + "\t\t");
				System.out.print(nilaiHuruf[i] + "\t\t");
				System.out.print(bobotNilai[i] + "\t\t");
			}
			System.out.println("");
		}
		
		System.out.println("==================");

		System.out.println("IPS : " + (sementara / totalSks));
		

	}
}
