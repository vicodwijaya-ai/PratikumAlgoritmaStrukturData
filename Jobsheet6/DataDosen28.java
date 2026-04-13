public class DataDosen28 {
    Dosen28[] dataDosen = new Dosen28[10]; 
    int idx = 0;

    void tambah(Dosen28 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    // 3. Sorting ASC berdasarkan usia (Bubble Sort) -> Termuda ke Tertua
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen28 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    // 4. Sorting DSC berdasarkan usia (Selection Sort) -> Tertua ke Termuda
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                // Perhatikan tanda > untuk mencari nilai usia paling besar (DESC)
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) { 
                    maxIdx = j;
                }
            }
            Dosen28 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}