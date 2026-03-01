public class MahasiswaMain28 {
    public static void main(String[] args) {
        
        Mahasiswa28 mhs1 = new Mahasiswa28();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "224172171";
        mhs1.ipk = 3.55;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}
