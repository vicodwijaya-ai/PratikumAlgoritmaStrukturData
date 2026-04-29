public class Buku28 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public Buku28(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}