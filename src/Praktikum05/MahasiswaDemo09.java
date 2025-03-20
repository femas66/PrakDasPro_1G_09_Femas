package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo09 {
	public static void main(String[] args) {
		MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09();
		// Scanner sc = new Scanner(System.in);
		// for (int i = 0; i < 5; i++) {
		// 	System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
		// 	System.out.print("NIM    : ");
		// 	String nim = sc.nextLine();
		// 	System.out.print("Nama   : ");
		// 	String nama = sc.nextLine();
		// 	System.out.print("Kelas  : ");
		// 	String kelas = sc.nextLine();
		// 	System.out.print("IPK    : ");
		// 	double ipk = Double.parseDouble(sc.nextLine());
		// 	Mahasiswa09 m = new Mahasiswa09(nim, nama, kelas, ipk);
		// 	list.tambah(m);
		// }
		Mahasiswa09 m1 = new Mahasiswa09("123", "Zidan", "2A", 3.2);
		Mahasiswa09 m2 = new Mahasiswa09("124", "Ayu", "2A", 3.5);
		Mahasiswa09 m3 = new Mahasiswa09("125", "Sofi", "2A", 3.1);
		Mahasiswa09 m4 = new Mahasiswa09("126", "Sita", "2A", 3.9);
		Mahasiswa09 m5 = new Mahasiswa09("127", "Miki", "2A", 3.7);
		list.tambah(m1);
		list.tambah(m2);
		list.tambah(m3);
		list.tambah(m4);
		list.tambah(m5);
		// System.out.println("Data mahasiswa sebelum sorting: ");
		// list.tampil();
		// System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
		// list.bubbleSort();
		// list.tampil();

		// System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
		// list.selectionSort();
		// list.tampil();
		System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
		list.insertionSort();
		list.tampil();
	}
}
