package Pertemuan11;

public class Bioskop09 {
  public static void main(String[] args) {
    String[][] penonton = new String[4][2];
    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena"; 
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan"; 
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";

    System.out.println(penonton.length);
    for (String[] penon : penonton) {
      System.out.println("Panjang baris adalah : " + penon.length);
    }

    for (String tmp : penonton[2]) {
      System.out.println(tmp);
    }

    for (int i = 0; i < penonton.length; i++) {
      System.out.println("Penonton baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
    }
  }
}
