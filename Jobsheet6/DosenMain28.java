import java.util.Scanner;
public class DosenMain28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen28 listDosen = new DataDosen28();
        int menu;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Semua Data Dosen");
            System.out.println("3. Sorting Usia ASC (Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting Usia DESC (Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); // Membersihkan sisa enter

            switch (menu) {
                case 1:
                    System.out.println("\n--- Tambah Data ---");
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine(); // Membersihkan sisa enter

                    Dosen28 dosenBaru = new Dosen28(kode, nama, jk, usia);
                    listDosen.tambah(dosenBaru);
                    break;
                case 2:
                    System.out.println("\n--- DAFTAR DOSEN ---");
                    listDosen.tampil();
                    break;
                case 3:
                    System.out.println("\n--- DATA DOSEN (USIA ASCENDING / TERMUDA) ---");
                    listDosen.sortingASC();
                    listDosen.tampil();
                    break;
                case 4:
                    System.out.println("\n--- DATA DOSEN (USIA DESCENDING / TERTUA) ---");
                    listDosen.sortingDSC();
                    listDosen.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-5.");
            }
        } while (menu != 5);
        
        sc.close();
    }
}