package S2Jobsheet2;

public class MahasiswaMain09 {
	public static void main(String[] args) {
		Mahasiswa09 mhs1 = new Mahasiswa09();
		mhs1.nama = "Femas akbar faturrohim";
		mhs1.nim = "244107020200";
		mhs1.kelas = "1G";
		mhs1.ipk = 3.67;
		mhs1.tampilkanInformasi();
		mhs1.ubahKelas("2G");
		mhs1.updateIPK(4.0);
		mhs1.tampilkanInformasi();

		Mahasiswa09 mhs2 = new Mahasiswa09("244107020201", "Femas akbar faturrohim", "1G", 3.67);
		mhs2.updateIPK(3.9);
		mhs2.tampilkanInformasi();

		Mahasiswa09 mhsFemas = new Mahasiswa09("244107020200", "Femas akbar faturrohim", "1G", 3.67);
	}

}
