package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        StackTugasMahasiswa28 stack = new StackTugasMahasiswa28(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println(" \nMenu: ");
            System.out.println("1. Mengumpulkan Tugas ");
            System.out.println("2. Menilai Tuas " );
            System.out.println("3. Melihat Tugas Teratas ");
            System.out.println("4. Melihat Daftar Tugas ");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Cek Jumlah Tugas Terkumpul ");
            System.out.print("Pilih:");
            pilih = sc.nextInt();
            sc.nextLine();
        
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa28 mhs = new Mahasiswa28(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n ", mhs.nama);
                    break;
                
                case 2:
                    Mahasiswa28 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n ", dinilai.nama, nilai);
                    }
                    break;
                
                case 3:
                    Mahasiswa28 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas ");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa28 lihatBawah = stack.peekBottom();
                    if (lihatBawah != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;

                case 6:
                    int jumlah = stack.getJumlahTugas();
                    System.out.println("Jumlah tugas  yang  sudah dikumpulkan saat ini: " + jumlah + "tugas ");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. ");
            }
            
        } while (pilih >= 1 && pilih <= 6 );

    }
}
