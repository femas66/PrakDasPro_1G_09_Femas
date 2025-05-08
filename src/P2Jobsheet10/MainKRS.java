package P2Jobsheet10;

import java.util.Scanner;

public class MainKRS {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrianKrs = new AntrianKRS();
        int jumlahDPA = 30;
        int pilih;
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Sudah Proses KRS");
            System.out.println("8. Cetak Jumlah Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrianKrs.tambahAntrian(mhs);
                    break;
                case 2:
                    antrianKrs.prosesKRS();
                    break;
                case 3:
                    antrianKrs.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrianKrs.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKrs.tampilkanAntrianTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian: " + antrianKrs.cetakJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah Sudah Proses KRS: " + antrianKrs.cetakJumlahSudahProsesKRS());
                    break;
                case 8:
                    System.out.println("Jumlah Belum Proses KRS: " + antrianKrs.cetakJumlahBelumProsesKRS(jumlahDPA));
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}
