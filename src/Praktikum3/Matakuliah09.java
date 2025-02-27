package Praktikum3;

public class Matakuliah09 {
	public String kode;
	public String nama;
	public int sks;
	public int jumlahJam;
	public Matakuliah09(String kode, String nama, int sks, int jumlahJam) {
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
		this.jumlahJam = jumlahJam;
	}
	public Matakuliah09() {}

	public void tambahData(String kode, String nama, int sks, int jumlahJam) {
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
		this.jumlahJam = jumlahJam;
	}

	public void cetakInfo() {
		System.out.println("Kode Mata Kuliah: " + kode);
		System.out.println("Nama Mata Kuliah: " + nama);
		System.out.println("SKS: " + sks);
		System.out.println("Jumlah Jam: " + jumlahJam);
	}
}
