package S2Jobsheet1;

import java.util.Scanner;

public class Tugas1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] code = {'A','B','D','E','F','G','H','L','N','T',};
		char[][] kota = {
			{
				'B', 'A', 'N','T','E','N',
			},
			{
				'J','A','K','A','R','T','A',
			},
			{
				'B','A','N','D','U','N','G',
			},
			{
				'C','I','R','E','B','O','N',
			},
			{
				'B','O','G','O','R',
			},
			{
				'P','E','K','A','L','O','N','G','A','N'
			},
			{
				'S','E','M','A','R','A','N','G',
			},
			{
				'S','U','R','A','B','A','Y','A',
			},
			{
				'M','A','L','A','N','G'
			},
			{
				'T','E','G','A','L'
			}
		};
		System.out.print("Masukan kode : ");
		char c = sc.next().charAt(0);
		int i = 0;
		int j = 0;
		while (i < code.length) {
			if (c == code[i]) {
				break;
			}
			i++;
		}
		while (j < kota[i].length) {
			System.out.print(kota[i][j]);
			j++;
		}
	}

	
}
