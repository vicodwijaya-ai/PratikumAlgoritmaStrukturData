package Jobsheet9;

public class StackSurat28 {
    Surat28[] stack;
    int size, top;

    public StackSurat28(int size) {
        this.size = size;
        stack = new Surat28[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat28 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil diterima dari: " + surat.namaMahasiswa);
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    public Surat28 pop() {
        if (!isEmpty()) {
            Surat28 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tumpukan surat kosong!");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Surat Teratas:");
            System.out.println("Nama: " + stack[top].namaMahasiswa + " | ID: " + stack[top].idSurat + " | Jenis Izin: " + stack[top].jenisIzin);
        } else {
            System.out.println("Tumpukan surat kosong!");
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan di posisi tumpukan ke-" + (top - i + 1) + " (dari atas)");
                    System.out.println("Detail: ID " + stack[i].idSurat + " | Durasi: " + stack[i].durasi + " hari");
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Surat dari mahasiswa bernama " + nama + " tidak ditemukan.");
            }
        } else {
            System.out.println("Tumpukan surat kosong!");
        }
    }
}