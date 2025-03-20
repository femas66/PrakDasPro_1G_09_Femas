package Praktikum05;

public class DataDosen09 {
	Dosen09[] dataDosen = new Dosen09[10];
    int idx = 0;

    public void tambah(Dosen09 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void sortingASC() {
		for (int i = 0; i < idx - 1; i++) {
			for (int j = 0; j < idx - i - 1; j++) {
				if (dataDosen[j].usia > dataDosen[j + 1].usia) {
					Dosen09 temp = dataDosen[j];
					dataDosen[j] = dataDosen[j + 1];
					dataDosen[j + 1] = temp;
				}
			}
		}
	}

	public void sortingDSC() {
		for (int i = 0; i < idx - 1; i++) {
		int maxIndex = i;
		for (int j = i + 1; j < idx; j++) {
			if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
				maxIndex = j;
			}
		}
		Dosen09 temp = dataDosen[i];
		dataDosen[i] = dataDosen[maxIndex];
		dataDosen[maxIndex] = temp;
		}
	}

	public void insertionSort() {
		for (int i = 1; i < idx; i++) {
		Dosen09 key = dataDosen[i];
		int j = i - 1;
		while (j >= 0 && dataDosen[j].usia < key.usia) {
			dataDosen[j + 1] = dataDosen[j];
			j--;
		}
		dataDosen[j + 1] = key;
		}
	}
}
