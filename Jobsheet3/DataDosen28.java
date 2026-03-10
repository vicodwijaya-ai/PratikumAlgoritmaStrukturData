public class DataDosen28 {

   
    public void dataSemuaDosen(Dosen28[] arrayOfDosen) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
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

    public void jumlahDosenPerJenisKelamin(Dosen28[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen28 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen28[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen28 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                countPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                countWanita++;
            }
        }

        System.out.println("\n===== RATA-RATA USIA DOSEN =====");

        if (countPria > 0) {
            System.out.println("Pria   : " + ((double) totalUsiaPria / countPria));
        }
        if (countWanita > 0) {
            System.out.println("Wanita : " + ((double) totalUsiaWanita / countWanita));
        }
    }

    public void infoDosenPalingTua(Dosen28[] arrayOfDosen) {
        System.out.println("\n===== INFO DOSEN PALING TUA =====");
        int maxUsia = 0;
        Dosen28 dosenTua = null;

        for (Dosen28 dsn : arrayOfDosen) {
            if (dsn.usia > maxUsia) {
                maxUsia = dsn.usia;
                dosenTua = dsn;
            }
        }

        if (dosenTua != null) {
            System.out.println("Kode          : " + dosenTua.kode);
            System.out.println("Nama          : " + dosenTua.nama);
            System.out.println("Jenis Kelamin : " + (dosenTua.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosenTua.usia);
        }
    }

    public void infoDosenPalingMuda(Dosen28[] arrayOfDosen) {
        System.out.println("\n===== INFO DOSEN PALING MUDA =====");
        int minUsia = 1000; // Inisialisasi dengan angka besar
        Dosen28 dosenMuda = null;

        for (Dosen28 dsn : arrayOfDosen) {
            if (dsn.usia < minUsia) {
                minUsia = dsn.usia;
                dosenMuda = dsn;
            }
        }

        if (dosenMuda != null) {
            System.out.println("Kode          : " + dosenMuda.kode);
            System.out.println("Nama          : " + dosenMuda.nama);
            System.out.println("Jenis Kelamin : " + (dosenMuda.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosenMuda.usia);
        }
    }
}
