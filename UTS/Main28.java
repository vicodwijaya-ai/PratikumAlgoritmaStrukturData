import java.util.Scanner;

public class Main28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi Data Mahasiswa`1
        Mahasiswa28[] arrMhs = {
            new Mahasiswa28("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa28("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa28("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Inisialisasi Data Buku
        Buku28 [] arrBuku = {
            new Buku28 ("B001", "Algoritma", 2020),
            new Buku28 ("B002", "Basis Data", 2019),
            new Buku28 ("B003", "Pemrograman", 2021),
            new Buku28 ("B004", "Fisika", 2024)
        };

        // Inisialisasi Data Peminjaman28 
        Peminjaman28 [] arrPinjam = {
            new Peminjaman28 (arrMhs[0], arrBuku[0], 7),  // Andi - Algoritma
            new Peminjaman28 (arrMhs[1], arrBuku[1], 3),  // Budi - Basis Data
            new Peminjaman28 (arrMhs[2], arrBuku[2], 10), // Citra - Pemrograman
            new Peminjaman28 (arrMhs[2], arrBuku[3], 6),  // Citra - Fisika
            new Peminjaman28 (arrMhs[0], arrBuku[1], 4)   // Andi - Basis Data
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa28  m : arrMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku28  b : arrBuku) b.tampilBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (Peminjaman28  p : arrPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    // Insertion Sort (Descending berdasarkan Denda)
                    for (int i = 1; i < arrPinjam.length; i++) {
                        Peminjaman28  key = arrPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && arrPinjam[j].denda < key.denda) {
                            arrPinjam[j + 1] = arrPinjam[j];
                            j = j - 1;
                        }
                        arrPinjam[j + 1] = key;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (Peminjaman28 p : arrPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    
                    // Mengurutkan data berdasarkan NIM terlebih dahulu (Syarat Binary Search)
                    for (int i = 1; i < arrPinjam.length; i++) {
                        Peminjaman28  key = arrPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && arrPinjam[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                            arrPinjam[j + 1] = arrPinjam[j];
                            j--;
                        }
                        arrPinjam[j + 1] = key;
                    }

                    // Binary Search
                    int left = 0;
                    int right = arrPinjam.length - 1;
                    int foundIndex = -1;

                    while (left <= right) {
                        int mid = left + (right - left) / 2;
                        int res = cariNim.compareTo(arrPinjam[mid].mhs.nim);

                        if (res == 0) {
                            foundIndex = mid;
                            break;
                        }
                        if (res > 0) left = mid + 1;
                        else right = mid - 1;
                    }

                    if (foundIndex != -1) {
                        // Cek elemen ke kiri dan kanan dari foundIndex jika ada lebih dari satu peminjaman
                        int start = foundIndex;
                        while (start > 0 && arrPinjam[start - 1].mhs.nim.equals(cariNim)) start--;
                        
                        int end = foundIndex;
                        while (end < arrPinjam.length - 1 && arrPinjam[end + 1].mhs.nim.equals(cariNim)) end++;

                        for (int i = start; i <= end; i++) {
                            arrPinjam[i].tampilPeminjaman();
                        }
                    } else {
                        System.out.println("Data dengan NIM " + cariNim + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}