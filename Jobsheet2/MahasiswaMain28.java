public class MahasiswaMain28 {
    public static void main(String[] args) {
        
        Mahasiswa28 mhs1 = new Mahasiswa28();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "224172171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa28 mhs2 = new Mahasiswa28 ("Annisa Nanila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
