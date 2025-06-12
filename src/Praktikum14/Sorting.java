package Praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<String> daftarSiswa = new ArrayList<>();
		daftarSiswa.add("Zainab");
		daftarSiswa.add("Andi");
		daftarSiswa.add("Rara");
		Collections.sort(daftarSiswa);
		System.out.println(daftarSiswa);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer customer1 = new Customer(1, "Zakia");
		Customer customer2 = new Customer(5, "Budi");
		customers.add(customer1);
		customers.add(customer2);
		customers.add(new Customer(4, "Cica"));
		customers.add(new Customer(100, "Rosa"));
		customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
		System.out.println(customers);
	}
}
