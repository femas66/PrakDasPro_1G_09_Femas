package S2Jobsheet1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterCari = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, semesterCari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaCari = scanner.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, namaCari);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
        scanner.close();
    }

    public static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nSeluruh jadwal kuliah:");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal kuliah pada hari " + hari + ":");
        boolean found = false;
        for (int i = 0; i < hariKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println((i + 1) + ". " + namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, int semesterCari) {
        System.out.println("\nJadwal kuliah pada semester " + semesterCari + ":");
        boolean found = false;
        for (int i = 0; i < semester.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.println((i + 1) + ". " + namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + semesterCari + ".");
        }
    }

    public static void cariMataKuliah(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String namaCari) {
        System.out.println("\nPencarian mata kuliah dengan nama \"" + namaCari + "\":");
        boolean found = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                System.out.println("Nama: " + namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah \"" + namaCari + "\" tidak ditemukan.");
        }
    }
}
