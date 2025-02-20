package S2Jobsheet2;

public class MataKuliahMain09 {
	public static void main(String[] args) {
		MataKuliah09 mk1 = new MataKuliah09();
		mk1.kodeMk = "MK01";
		mk1.namaMk = "Matematika";
		mk1.sks = 3;
		mk1.jumlahJam = 6;
		mk1.tampilkanInformasi();
		mk1.ubahSKS(4);
		mk1.tambahJam(2);
		mk1.kurangiJam(1);
		mk1.tampilkanInformasi();

		MataKuliah09 mk2 = new MataKuliah09("MK02", "Fisika", 3, 6);
		mk2.tampilkanInformasi();
	}
	
}
