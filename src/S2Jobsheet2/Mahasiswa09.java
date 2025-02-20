package S2Jobsheet2;

public class Mahasiswa09 {
	String nim;
	String nama;
	String kelas;
	double ipk;

	public Mahasiswa09() {
	}

	public Mahasiswa09(String nim, String nama, String kelas, double ipk) {
		this.nim = nim;
		this.nama = nama;
		this.kelas = kelas;
		this.ipk = ipk;
	}

	void tampilkanInformasi() {
		System.out.println("Nama : " + nama);
		System.out.println("NIM : " + nim);
		System.out.println("IPK : " + ipk);
		System.out.println("Kelas : " + kelas);
	}

	void ubahKelas(String kelasBaru) {
		kelas = kelasBaru;
	}

	void updateIPK(double ipkBaru) {
		if (ipkBaru >= 0 && ipkBaru <= 4) {
			ipk = ipkBaru;
		} else {
			System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
		}
	}

	String nilaiKinerja() {
		if (ipk >= 3.5) {
			return "Kinerja sangat baik";
		} else if (ipk >= 3) {
			return "Kinerja baik";
		} else if (ipk >= 2.0) {
			return "Kinerja cukup";
		} else {
			return "Kinerja kurang";
		}

	}
}
