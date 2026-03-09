
import java.util.Scanner;

public class DosenDemo28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen28[] arrayOfDosen = new Dosen28[3];

        String kode, nama, jkDummy;
        int usia;
        Boolean jenisKelamin;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            jkDummy = sc.nextLine();
            if (jkDummy.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------------");

            arrayOfDosen[i] = new Dosen28(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== HASIL DATA DOSEN =====");

        int counter = 1;
        for (Dosen28 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);

            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-----------------------------------");
            counter++;
        }
    }
}
