package Pertemuan13;

public class PengunjungCafe09 {
  public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar nama pengunjung:");
    for (String nama : namaPengunjung) {
      System.out.println("- " + nama);
    }
  }
  public static void main(String[] args) {
    daftarPengunjung("ali", "budi", "citra");
  }
}
