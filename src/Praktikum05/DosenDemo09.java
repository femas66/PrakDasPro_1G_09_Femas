package Praktikum05;

public class DosenDemo09 {
	public static void main(String[] args) {
		DataDosen09 data = new DataDosen09();

		data.tambah(new Dosen09("D001", "Budi", true, 45));
		data.tambah(new Dosen09("D002", "Ani", false, 30));
		data.tambah(new Dosen09("D003", "Tono", true, 50));
		data.tambah(new Dosen09("D004", "Siti", false, 35));
  
		System.out.println("Data Awal:");
		data.tampil();
  
		data.sortingASC();
		System.out.println("Data setelah diurutkan ASC (Bubble Sort):");
		data.tampil();
  
		data.sortingDSC();
		System.out.println("Data setelah diurutkan DSC (Selection Sort):");
		data.tampil();
  
		data.insertionSort();
		System.out.println("Data setelah diurutkan DSC (Insertion Sort):");
		data.tampil();
	}
}
