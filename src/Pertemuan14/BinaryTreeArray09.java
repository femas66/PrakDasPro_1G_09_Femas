package Pertemuan14;

public class BinaryTreeArray09 {
    Mahasiswa09[] dataMahasiswa;
    int idxLast;
    public BinaryTreeArray09() {
        this.dataMahasiswa = new Mahasiswa09[10];
    }
    void populateData(Mahasiswa09[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void add(Mahasiswa09 data) {
		int currentIndex = 0; 
		if (dataMahasiswa[0] == null) { 
			dataMahasiswa[0] = data;
			idxLast = 0;
			return;
		}
		while (true) {
			int leftChildIdx = 2 * currentIndex + 1;
			int rightChildIdx = 2 * currentIndex + 2;
			if (data.ipk < dataMahasiswa[currentIndex].ipk) {
				if (leftChildIdx >= dataMahasiswa.length) {
					System.out.println("Array penuh, tidak bisa tambah di kiri!");
					return;
				}
				if (dataMahasiswa[leftChildIdx] == null) {
					dataMahasiswa[leftChildIdx] = data;
					if (leftChildIdx > idxLast) idxLast = leftChildIdx;
					return;
				} else {
					currentIndex = leftChildIdx;
				}
			} else {
				if (rightChildIdx >= dataMahasiswa.length) {
					System.out.println("Array penuh, tidak bisa tambah di kanan!");
					return;
				}
				if (dataMahasiswa[rightChildIdx] == null) {
					dataMahasiswa[rightChildIdx] = data;
					if (rightChildIdx > idxLast) idxLast = rightChildIdx;
					return;
				} else {
					currentIndex = rightChildIdx;
				}
			}
		}
	}
	public void traversePreOrder() {
		if (dataMahasiswa[0] == null) {
			System.out.println("Tree array masih kosong!");
			return;
		}
		System.out.println("PreOrder Traversal:");
		traversePreOrderHelper(0);
		}
		private void traversePreOrderHelper(int idxStart) {
		if (idxStart > idxLast || idxStart >= dataMahasiswa.length || dataMahasiswa[idxStart] == null) {
			return;
		}
		dataMahasiswa[idxStart].tampilInformasi();
		traversePreOrderHelper(2 * idxStart + 1);
		traversePreOrderHelper(2 * idxStart + 2);
	}
}