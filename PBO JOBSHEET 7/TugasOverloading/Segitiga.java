package TugasOverloading;

public class Segitiga {
    private int sudut;

    // Metode pertama: Menghitung total sudut segitiga
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Metode kedua: Overloading untuk menghitung total sudut dengan dua sudut
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Metode ketiga: Menghitung keliling segitiga dengan tiga sisi bertipe int
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Metode keempat: Overloading keliling segitiga dengan dua sisi bertipe double
    public double keliling(double sisiA, double sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    // public static void main(String[] args) {
    //     Segitiga segitiga = new Segitiga();

    //     // Contoh pemanggilan metode totalSudut
    //     System.out.println("Total sudut (1 sudut): " + segitiga.totalSudut(60));
    //     System.out.println("Total sudut (2 sudut): " + segitiga.totalSudut(60, 30));

    //     // Contoh pemanggilan metode keliling
    //     System.out.println("Keliling (3 sisi): " + segitiga.keliling(3, 4, 5));
    //     System.out.println("Keliling (2 sisi): " + segitiga.keliling(3.0, 4.0));
    // }
}
