public class Pangkat {
    public int nilai, pangkat;

    // Konstruktor berparameter
    public Pangkat(int n, int p) { 
        nilai = n;
        pangkat = p; 
    }

    // Method Brute Force
    public int pangkatBF(int a, int n) {
        int hasil = 1; 
        for (int i = 0; i < n; i++) { 
            hasil = hasil * a; 
        }
        return hasil;
    }

   int pangkatBF() {
    int hasil = 1;
    // Menggunakan atribut class 'pangkat' dan 'nilai'
    for (int i = 0; i < this.pangkat; i++) {
        hasil = hasil * this.nilai;
    }
    return hasil;
}

    // Method Divide and Conquer
    public int pangkatDC(int a, int n) { 
        if (n == 1) { 
            return a; 
        } else {
            if (n % 2 == 1) { 
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2)); 
            }
        }
    }
}