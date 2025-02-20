package S2Jobsheet2;

public class Dosen09 {
	String idDosen;
	String nama;
	boolean statusAktif;
	int tahunGabung;
	String bidangKeahlian;

	public Dosen09(String idDosen, String nama, boolean statusAktif, int tahunGabung, String bidangKeahlian) {
		this.idDosen = idDosen;
		this.nama = nama;
		this.statusAktif = statusAktif;
		this.tahunGabung = tahunGabung;
		this.bidangKeahlian = bidangKeahlian;
	}

	public Dosen09() {
	}

	void tampilkanInformasi() {
		System.out.println("ID Dosen: " + idDosen);
		System.out.println("Nama: " + nama);
		System.out.println("Status Aktif: " + statusAktif);
		System.out.println("Tahun Gabung: " + tahunGabung);
		System.out.println("Bidang Keahlian: " + bidangKeahlian);
	}

	void setStatus(boolean status) {
		this.statusAktif = status;
	}

	void hitungMasaKerja(int tahunSekarang) {
		int masaKerja = tahunSekarang - tahunGabung;
		System.out.println("Masa Kerja: " + masaKerja + " tahun");
	}

	void ubahKeahlian(String bidangKeahlianBaru) {
		this.bidangKeahlian = bidangKeahlianBaru;
	}


}
