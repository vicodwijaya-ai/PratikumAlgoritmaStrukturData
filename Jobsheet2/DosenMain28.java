public class DosenMain28 {
    public static void main(String[] args) {
       
        Dosen28 dsn1 = new Dosen28();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso, S.Kom., M.Kom.";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Rekayasa Perangkat Lunak";

        System.out.println("--- Dosen 1 ---");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Kecerdasan Buatan");
        dsn1.tampilInformasi();

        System.out.println("\n--- Dosen 2 ---");
        
        Dosen28 dsn2 = new Dosen28("D002", "Siti Aminah, M.T.", false, 2020, "Jaringan Komputer");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.tampilInformasi();
    }
}