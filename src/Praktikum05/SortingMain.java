package Praktikum05;

public class SortingMain {
	public static void main(String[] args) {
		int a[] = {20,10,2,7,12};
		Sorting09 dataurut1 = new Sorting09(a, a.length);
		System.out.println("Data awal 1");
		dataurut1.tampil();
		dataurut1.bubbleSort();
		System.out.println("Data setelah diurutkan 1");
		dataurut1.tampil();

		int b[] = {30,20,2,18,14};
		Sorting09 dataurut2 = new Sorting09(b, b.length);
		System.out.println("Data awal 2");
		dataurut2.tampil();
		dataurut2.SelectionSort();
		System.out.println("Data setelah diurutkan 2");
		dataurut2.tampil();

		int c[] = {40,10,4,9,3};
		Sorting09 dataurut3 = new Sorting09(c, c.length);
		System.out.println("Data awal 3");
		dataurut3.tampil();
		dataurut3.insertionSort();
		System.out.println("Data setelah diurutkan 3");
		dataurut3.tampil();
	}	
}
