package Praktikum3;

public class DataDosen09 {
	public int jumlahWanita;
	public int jumlahPria;
	public int rataRataUsiaPria;
	public int rataRataUsiaWanita;
	public void dataSemuaDosen(Dosen[] daftarDosen) {
		for (Dosen dosen : daftarDosen) {
			System.out.println("===========================");
			System.out.println("Kode       : " + dosen.kode);
			System.out.println("Nama       : " + dosen.nama);
			System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
			System.out.println("Usia       : " + dosen.usia);
			System.out.println("===========================");
		}
	}

	public void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
		for (Dosen dosen : arrayOfDosen) {
			if (dosen.jenisKelamin) {
				jumlahPria++;
			} else {
				jumlahWanita++;
			}
		}
		System.out.println("Jumlah Dosen Pria: " + jumlahPria);
		System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
	}

	public void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
		int totalDosenPria = 0;
		int totalDosenWanita = 0;
		int totalUsiaDosenPria = 0;
		int totalUsiaDosenWanita = 0;
		for (Dosen dosen : arrayOfDosen) {
			if (dosen.jenisKelamin) {
				totalDosenPria++;
				totalUsiaDosenPria += dosen.usia;
			} else {
				totalDosenWanita++;
				totalUsiaDosenWanita += dosen.usia;
			}
		}
		rataRataUsiaPria = totalUsiaDosenPria / totalDosenPria;
		rataRataUsiaWanita = totalUsiaDosenWanita / totalDosenWanita;
		System.out.println("Rata-rata usia Dosen Pria: " + rataRataUsiaPria);
		System.out.println("Rata-rata usia Dosen Wanita: " + rataRataUsiaWanita);
	}

	public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
		int usiaTerbesar = 0;
		String namaDosenTerbesar = "";
		for (Dosen dosen : arrayOfDosen) {
			if (dosen.usia > usiaTerbesar) {
				usiaTerbesar = dosen.usia;
				namaDosenTerbesar = dosen.nama;
			}
		}
		System.out.println("Dosen paling tua adalah " + namaDosenTerbesar + " dengan usia " + usiaTerbesar);
	}

	public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
		int usiaTerkecil = arrayOfDosen[0].usia;
		String namaDosenTerkecil = arrayOfDosen[0].nama;
		for (Dosen dosen : arrayOfDosen) {
			if (dosen.usia < usiaTerkecil) {
				usiaTerkecil = dosen.usia;
				namaDosenTerkecil = dosen.nama;
			}
		}
		System.out.println("Dosen paling muda adalah " + namaDosenTerkecil + " dengan usia " + usiaTerkecil);
	}


}