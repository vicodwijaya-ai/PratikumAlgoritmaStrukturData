package Jobsheet9;

public class StackTugasMahasiswa28 {

    Mahasiswa28[] stack;
    int size;
    int top;

    public StackTugasMahasiswa28(int size) {
        this.size = size;
        stack = new Mahasiswa28[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa28 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa28 pop() {
        if (!isEmpty()) {
            Mahasiswa28 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stak kosong! Tidak ada tugas untuk dinilai. ");
            return null;
        }
    }

    public Mahasiswa28 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) { // for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }

    public Mahasiswa28 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // Elemen terbawah selalu berada di indeks 0
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int getJumlahTugas() {
    return top + 1; 
}

}
