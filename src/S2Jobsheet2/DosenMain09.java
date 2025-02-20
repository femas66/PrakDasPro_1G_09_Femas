package S2Jobsheet2;

public class DosenMain09 {
	public static void main(String[] args) {
		Dosen09 dosen1 = new Dosen09();
		dosen1.idDosen = "D01";
		dosen1.nama = "Femas akbar faturrohim";
		dosen1.statusAktif = true;
		dosen1.tahunGabung = 2000;
		dosen1.bidangKeahlian = "Matematika";
		dosen1.tampilkanInformasi();
		dosen1.setStatus(false);
		dosen1.hitungMasaKerja(2025);
		dosen1.ubahKeahlian("Fisika");
		dosen1.tampilkanInformasi();

		Dosen09 dosen2 = new Dosen09("D02", "Femas akbar faturrohim", true, 2000, "Matematika");
		dosen2.tampilkanInformasi();
		dosen2.hitungMasaKerja(2025);
		dosen2.ubahKeahlian("Fisika");
		dosen2.tampilkanInformasi();
	}
}
