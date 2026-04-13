public class Dosen28 {
    String kode;
    String nama;
    Boolean jenisKelamin; // true = Pria, false = Wanita
    int usia;

    Dosen28(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + usia);
        System.out.println("--------------------------------");
    }
}