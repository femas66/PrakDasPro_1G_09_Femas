package P2Jobsheet10;

public class AntrianKRS {
    private Mahasiswa[] antrian;
    private int front;
    private int rear;
    private int size;
    private int maxAntrian = 10;
    private int jumlahDiproses;
    public AntrianKRS() {
        this.antrian = new Mahasiswa[maxAntrian];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDiproses = 0;
    }
    public boolean isKosong() {
        return size == 0;
    }
    public boolean isPenuh() {
        return size == maxAntrian;
    }
    public void kosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
    }
    public void tambahAntrian(Mahasiswa mhs) {
        if (!isPenuh()) {
            rear = (rear + 1) % maxAntrian; // Handle circular queue
            antrian[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh, " + mhs.nama + " tidak dapat ditambahkan.");
        }
    }
    public void prosesKRS() {
        if (!isKosong()) {
            if (size >= 2) {
                Mahasiswa mhs1 = antrian[front];
                front = (front + 1) % maxAntrian;
                Mahasiswa mhs2 = antrian[front];
                front = (front + 1) % maxAntrian;
                size -= 2;
                System.out.println("\nMemproses KRS untuk:");
                System.out.print("1. ");
                mhs1.tampilkanData();
                System.out.print("2. ");
                mhs2.tampilkanData();
                jumlahDiproses += 2;
            } else {
                System.out.println("Jumlah antrian kurang dari 2, proses KRS dibatalkan.");
            }
        } else {
            System.out.println("Antrian kosong, tidak ada yang bisa diproses.");
        }
    }
    public void tampilkanSemuaAntrian() {
        if (!isKosong()) {
            System.out.println("\nDaftar Antrian KRS:");
            System.out.println("No. NIM - Nama - Prodi - Kelas");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % maxAntrian;
                System.out.print((i + 1) + ". ");
                antrian[index].tampilkanData();
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void tampilkanDuaTerdepan() {
        if (!isKosong()) {
            System.out.println("\n2 Antrian Terdepan:");
            System.out.println("No. NIM - Nama - Prodi - Kelas");
            int count = Math.min(2, size);
            int tempFront = front;
            for (int i = 0; i < count; i++) {
                System.out.print((i + 1) + ". ");
                antrian[tempFront].tampilkanData();
                tempFront = (tempFront + 1) % maxAntrian;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void tampilkanAntrianTerakhir() {
        if (!isKosong()) {
            int lastIndex = (front + size - 1) % maxAntrian;
            System.out.print("\nAntrian Terakhir: ");
            antrian[lastIndex].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public int cetakJumlahAntrian() {
        return size;
    }
    public int cetakJumlahSudahProsesKRS() {
        return jumlahDiproses;
    }
    public int cetakJumlahBelumProsesKRS(int jumlahDPA) {
        return jumlahDPA - jumlahDiproses;
    }
}
