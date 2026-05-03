package Jobsheet9;

public class Mahasiswa28 {
    String nim, nama, kelas;
    int nilai;

   Mahasiswa28 (String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;

    } 

    void tugasDinilai(int nilai){
        this.nilai = nilai;
        }
}
