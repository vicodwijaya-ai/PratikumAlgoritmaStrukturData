package Jobsheet10;

public class AntrianKRS28 {

    Mahasiswa28[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalSelesai;
    int kuotaDPA = 30;

    public AntrianKRS28() {
        this.max = 10;
        this.data = new Mahasiswa28[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalSelesai = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan. ");
        } else {
            System.out.println("Antrisan masih kosong. ");
        }
    }

    public void enqueue(Mahasiswa28 mhs) {
        if (isFull()) {
            System.out.println("Mohon maaf, antrian sudah penuh (Maksimal 10).");
        } else if (totalSelesai + size >= kuotaDPA) {
            System.out.println("Mohon maaf, kuota DPA sudah habis (Maksimal 30 mahasiswa).");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian.");
        }

    }

    public void layaniDuaMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong tidak ada yang dilayani.");
            return;
        }

        System.out.println("=== Memanggil Mahasiswa untuk KRS ===");
        for (int i = 0; i < 2; i++) {
            if (!isEmpty()) {
                Mahasiswa28 mhs = data[front];
                System.out.print("Melayani: ");
                mhs.tampilkanData();

                front = (front + 1) % max;
                size--;
                totalSelesai++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== Daftar Semua Antrian ===");
            for (int i = 0; i < size; i++) {
                int index = (front + 1) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== 2 Mahasiswa Terdepan ===");
            int batas = Math.min(size, 2);
            for (int i = 0; i < batas; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }

    }

    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        }else{
            System.out.print("Mahasiswa paling belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void infoKRS() {
        int belumKRS = kuotaDPA - totalSelesai;
        System.out.println("=== Info Rekapitulasi KRS ===");
        System.out.println("Jumlah mahasiswa mengantri saat ini     :" + size);
        System.out.println("Jumlah mahasiswa sudah diproses KRS     :" + totalSelesai);
        System.out.println("Sisa kouta DPA yang belum KRS           :" + belumKRS );
    }
}
