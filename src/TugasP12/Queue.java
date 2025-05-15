package TugasP12;

class Queue {
    Node front;
    Node rear;
    int size;
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    public boolean IsEmpty() {
        return size == 0;
    }
    public boolean IsFull() {
        return false;
    }
    public Mahasiswa peek() {
        if (!IsEmpty()) {
            return front.data;
        } else {
            System.out.println("Antrian masih kosong");
            return null;
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            Node current = front;
            System.out.print("Isi antrian: ");
            while (current != null) {
                System.out.print(current.data + (current.next == null ? "" : " -> "));
                current = current.next;
            }
            System.out.println("\nJumlah elemen = " + size);
        }
    }
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }
    public void Enqueue(Mahasiswa dt) {
        Node newNode = new Node(dt);
        if (IsEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    public Mahasiswa Dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } else {
            Mahasiswa dt = front.data;
            front = front.next;
            size--;
            if (IsEmpty()) {
                rear = null;
            }
            return dt;
        }
    }
    public Mahasiswa peekRear() {
        if (!IsEmpty()) {
            return rear.data;
        } else {
            System.out.println("Antrian masih kosong");
            return null;
        }
    }
    public int getSize() {
        return size;
    }
}