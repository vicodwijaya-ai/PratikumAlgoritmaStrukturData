public class SortingMain28 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        // Test Bubble Sort
        System.out.println("Data awal 1");
        Sorting28 dataurut1 = new Sorting28 (a, a.length);
        dataurut1.tampil();
        System.out.println("Data diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.bubbleSort();
        dataurut1.tampil();
        System.out.println("----------------------------------------");

        // Test Selection Sort
        System.out.println("Data awal 2");
        Sorting28 dataurut2 = new Sorting28(b, b.length);
        dataurut2.tampil();
        System.out.println("Data diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.selectionSort();
        dataurut2.tampil();
        System.out.println("----------------------------------------");

        // Test Insertion Sort
        System.out.println("Data awal 3");
        Sorting28 dataurut3 = new Sorting28(c, c.length);
        dataurut3.tampil();
        System.out.println("Data diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.insertionSort();
        dataurut3.tampil();
    }
}