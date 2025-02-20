package S2Jobsheet2;

class MataKuliah09 {
	String kodeMk;
	String namaMk;
	int sks;
	int jumlahJam;

	public MataKuliah09(String kodeMk, String namaMk, int sks, int jumlahJam) {
		this.kodeMk = kodeMk;
		this.namaMk = namaMk;
		this.sks = sks;
		this.jumlahJam = jumlahJam;
	}

	public MataKuliah09() {
	}

	void tampilkanInformasi() {
		System.out.println("Kode Mata Kuliah: " + kodeMk);
		System.out.println("Nama Mata Kuliah: " + namaMk);
		System.out.println("SKS: " + sks);
		System.out.println("Jumlah Jam: " + jumlahJam);
	}

	void ubahSKS(int sksBaru) {
		sks = sksBaru;
	}

	void tambahJam(int jumlahJamBaru) {
		jumlahJam += jumlahJamBaru;
	}

	void kurangiJam(int jumlahJamBaru) {
		if (jumlahJam >= jumlahJamBaru) {
			jumlahJam -= jumlahJamBaru;
		} else {
			System.out.println("Jumlah jam kurang");
		}
	}
}