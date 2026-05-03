package Jobsheet9;

import java.util.Scanner;

public class MainSurat28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat28 stack = new StackSurat28(10); // Kapasitas 10 surat
        int pilih;

        do {
            System.out.println("\n--- Sistem Pengelolaan Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S: Sakit / I: Izin lain): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    
                    Surat28 suratBaru = new Surat28 (id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    break;
                case 2:
                    Surat28 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa + " (ID: " + diproses.idSurat + ")");
                        System.out.println("Status: Telah diverifikasi dan disetujui.");
                    }
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}