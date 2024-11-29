package Latihan;

/**
 * Latihan1
 * 
 */
public class Latihan1 {

  public static void main(String[] args) {
    int gajiPokok = 2000000;
    int thr = gajiPokok * 1 + 55000;
    double pajak = 0.05;
    int gaji = gajiPokok + thr;

    gaji -= gajiPokok * pajak;
    System.out.println("Pendapatan hari raya adalah : " + gaji);
  }
}
