public class Sorting28 {
    int[] data;
    int jumData;

    // Konstruktor
    Sorting28 (int Data[], int jmlDat) {
        jumData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    // Algoritma Bubble Sort (Ascending)
    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    // Proses Swap (Tukar posisi)
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    // Algoritma Selection Sort (Ascending)
    void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            // Swap elemen terkecil dengan elemen awal
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }

    // Algoritma Insertion Sort (Ascending)
    void insertionSort() {
        for (int i = 1; i < jumData; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j]; // Geser elemen ke kanan
                j--;
            }
            data[j + 1] = temp;
        }
    }

    // Method Tampil
    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}