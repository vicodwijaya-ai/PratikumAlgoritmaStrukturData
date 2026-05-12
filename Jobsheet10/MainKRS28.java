package Jobsheet10;

import java.util.Scanner;

public class MainKRS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS28 antrian = new AntrianKRS28(); // max otomatis 10 di konstruktor
        int pilihan;

        do {
            
            System.out.println("\n=== LAYANAN PERSETUJUAN KRS ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil 2 Mahasiswa (Proses KRS)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Cek 2 Antrian Terdepan");
            System.out.println("5. Cek Antrian Paling Belakang");
            System.out.println("6. Info Rekapitulasi KRS");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa28 mhs = new Mahasiswa28(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.layaniDuaMahasiswa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.infoKRS();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}
