
public class MainKampus {

    public static void main(String[] args) {
        Kampus polinema = new Kampus(8);

        polinema.daftarMhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        polinema.daftarMhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        polinema.daftarMhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        polinema.daftarMhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        polinema.daftarMhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        polinema.daftarMhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        polinema.daftarMhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        polinema.daftarMhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        int batasAkhir = polinema.daftarMhs.length - 1;

        System.out.println("=== HASIL ANALISIS NILAI ===");
        System.out.println("Nilai UTS Tertinggi (DC) : " + polinema.maxUtsDC(0, batasAkhir));
        System.out.println("Nilai UTS Terendah (DC)  : " + polinema.minUtsDC(0, batasAkhir));
        System.out.println("Rata-rata UAS (BF)       : " + polinema.rataUasBF());
    }
}

class Mahasiswa {

    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    public Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

class Kampus {

    Mahasiswa[] daftarMhs;

    public Kampus(int jumlahMhs) {
        daftarMhs = new Mahasiswa[jumlahMhs];
    }

    // Divide Conquer untuk nilai UTS Tertinggi
    public int maxUtsDC(int l, int r) {
        if (l == r) {
            return daftarMhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmax = maxUtsDC(l, mid);
        int rmax = maxUtsDC(mid + 1, r);
        return Math.max(lmax, rmax);
    }

    // Divide Conquer untuk nilai UTS Terendah
    public int minUtsDC(int l, int r) {
        if (l == r) {
            return daftarMhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmin = minUtsDC(l, mid);
        int rmin = minUtsDC(mid + 1, r);
        return Math.min(lmin, rmin);
    }

    // Brute Force untuk Rata-rata UAS
    public double rataUasBF() {
        double totalUAS = 0;
        for (int i = 0; i < daftarMhs.length; i++) {
            totalUAS += daftarMhs[i].nilaiUAS;
        }
        return totalUAS / daftarMhs.length;
    }
}
