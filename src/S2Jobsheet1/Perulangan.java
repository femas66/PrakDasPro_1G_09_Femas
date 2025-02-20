package S2Jobsheet1;

import java.util.Scanner;

public class Perulangan {
	public static void main(String[] args) {
		long nim, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan NIM : ");
		nim = sc.nextLong();
		n = nim % 100;
		if (n < 10) {
			n += 10;
		}
		for (int i = 1; i <= n; i++) {
			if (i == 6 || i == 10) {
				continue;
			}
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				System.out.print("* ");
			}
		}

	}
}
