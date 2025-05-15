package TugasP12;

import java.util.Scanner;

public class AntrianMahasiswa {
	private Queue antrian;
    public boolean isAntrianKosong() {
        return antrian.IsEmpty();
    }
    AntrianMahasiswa() {
	   antrian = new Queue();
    }
    public boolean isAntrianPenuh() {
        return antrian.IsFull();
    }
    public void kosongkanAntrian() {
        antrian.clear();
        System.out.println("Antrian telah dikosongkan.");
    }
    public void tambahAntrian(Mahasiswa mahasiswa) {
        antrian.Enqueue(mahasiswa);
        System.out.println("Mahasiswa " + mahasiswa.nama + " berhasil ditambahkan ke antrian.");
    }
    public Mahasiswa panggilAntrian() {
        Mahasiswa mahasiswaDipanggil = antrian.Dequeue();
        if (mahasiswaDipanggil != null) {
            System.out.println("Memanggil mahasiswa: " + mahasiswaDipanggil);
        }
        return mahasiswaDipanggil;
    }
    public void lihatAntrianTerdepan() {
        Mahasiswa terdepan = antrian.peek();
        if (terdepan != null) {
            System.out.println("Antrian terdepan: " + terdepan);
        }
    }
    public void lihatAntrianTerakhir() {
        Mahasiswa terakhir = antrian.peekRear();
        if (terakhir != null) {
            System.out.println("Antrian terakhir: " + terakhir);
        }
    }
    public int lihatJumlahMahasiswaMengantre() {
        return antrian.getSize();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianMahasiswa layanan = new AntrianMahasiswa();
        while (true) {
            System.out.println("\n--- Layanan Unit Kemahasiswaan ---");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Tambah Antrian (Admin)");
            System.out.println("3. Panggil Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Lihat Jumlah Mengantre");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Kosongkan Antrian (Admin)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Anda: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Anda: ");
                    String nim = scanner.nextLine();
                    layanan.tambahAntrian(new Mahasiswa(nama, nim));
                    break;
                case 2:
                    System.out.print("Masukkan Nama Mahasiswa (Admin): ");
                    String namaAdmin = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (Admin): ");
                    String nimAdmin = scanner.nextLine();
                    layanan.tambahAntrian(new Mahasiswa(namaAdmin, nimAdmin));
                    break;
                case 3:
                    layanan.panggilAntrian();
                    break;
                case 4:
                    layanan.lihatAntrianTerdepan();
                    break;
                case 5:
                    layanan.lihatAntrianTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa yang mengantre: " + layanan.lihatJumlahMahasiswaMengantre());
                    break;
                case 7:
                    System.out.println("Apakah antrian kosong? " + layanan.isAntrianKosong());
                    break;
                case 8:
                    layanan.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
