package S2Jobsheet1;

public class Fungsi {

	public static void main(String[] args) {
		String[] toko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
		int[][] stokBunga = {
			{10, 5, 15, 7,},
			{6, 11, 9, 12},
			{2, 10, 10, 5,},
			{5, 7, 12, 9}
		};
		int[] harga = {75000,50000,60000,10000};
		int[] pendapatan = hitungPendapatan(stokBunga, harga);
		for (int i = 0; i < pendapatan.length; i++) {
			System.out.println("Pendapatan cabang " + toko[i] + " adalah " + pendapatan[i]);
		}
		int[] stokBaru = {10, 5, 15, 7};
		updateStok(4, stokBaru, stokBunga);
	}
	public static int[] hitungPendapatan(int[][] stokBunga, int[] harga) {
		int[] pendapatanSetiapCabang = new int[stokBunga.length];
		for (int i = 0; i < stokBunga.length; i++) {
			pendapatanSetiapCabang[i] = 0;
			for (int j = 0; j < stokBunga[i].length; j++) {
				pendapatanSetiapCabang[i] += stokBunga[i][j] * harga[j];
			}
		}
		return pendapatanSetiapCabang;
	}
	public static void updateStok(int cabangKe, int[] stokBaru, int[][] stokBunga) {
			int baris = cabangKe - 1;
			for (int j = 0; j < stokBunga[baris].length; j++) {
				System.out.println(stokBunga[baris][j]);
				stokBunga[baris][j] = stokBaru[j];
			}
	}

}
