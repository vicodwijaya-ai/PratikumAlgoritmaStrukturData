
public class Sum {

    public double keuntungan[];

    // Konstruktor
    public Sum(int el) {
        keuntungan = new double[el];
    }

    // Method Brute Force
    public double totalBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    // Method Divide and Conquer
    public double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}
