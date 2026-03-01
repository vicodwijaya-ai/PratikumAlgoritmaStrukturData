public class MataKuliahMain28 {
    public static void main(String[] args) {
       
        MataKuliah28 mk1 = new MataKuliah28();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        
        System.out.println("--- Mata Kuliah 1 ---");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(10);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();  

        System.out.println("\n--- Mata Kuliah 2 ---");
       
        MataKuliah28 mk2 = new MataKuliah28("K3", "Keselamatan dan Kesehatan Kerja", 2, 4);
        mk2.tampilInformasi();
        mk2.kurangiJam(1);
    }
}