package Praktikum3;

import java.util.Scanner;

public class DosenDemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Masukkan jumlah dosen: ");
	    int jumlah = sc.nextInt();
	    sc.nextLine();
	    Dosen[] daftarDosen = new Dosen[jumlah];
	    for (int i = 0; i < jumlah; i++) {
		   System.out.println("Masukkan data dosen ke-" + (i + 1));
		   System.out.print("Kode       : ");
		   String kode = sc.nextLine();
		   System.out.print("Nama       : ");
		   String nama = sc.nextLine();
		   System.out.print("Jenis Kelamin (L/P): ");
		   String jk = sc.nextLine();
		   boolean jenisKelamin = jk.equalsIgnoreCase("L");
		   System.out.print("Usia       : ");
		   int usia = sc.nextInt();
		   sc.nextLine();
		   daftarDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
	    }
	    System.out.println("\n=== Data Dosen ===");
	    for (Dosen dosen : daftarDosen) {
		   System.out.println("Kode       : " + dosen.kode);
		   System.out.println("Nama       : " + dosen.nama);
		   System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
		   System.out.println("Usia       : " + dosen.usia);
		   System.out.println("--------------------------");
	    }

	    DataDosen09 dataDosen = new DataDosen09();
	    dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
	    dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
	    dataDosen.infoDosenPalingMuda(daftarDosen);
	    dataDosen.infoDosenPalingTua(daftarDosen);
	    dataDosen.dataSemuaDosen(daftarDosen);
	}
 }