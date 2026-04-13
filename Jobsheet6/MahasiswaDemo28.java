import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        MahasiswaBerprestasi28 list = new MahasiswaBerprestasi28();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan sisa enter

            Mahasiswa28 m = new Mahasiswa28(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data yang sudah terurut memggunakan InsertionSort (ASC) : ");
        list.insertionSort();
        list.tampil();

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();
    }
}
