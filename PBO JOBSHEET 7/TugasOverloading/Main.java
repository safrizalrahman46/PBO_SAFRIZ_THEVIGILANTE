package TugasOverloading;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // Contoh pemanggilan metode totalSudut
        System.out.println("Total sudut (1 sudut): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (2 sudut): " + segitiga.totalSudut(60, 30));

        // Contoh pemanggilan metode keliling
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi): " + segitiga.keliling(3.0, 4.0));
    }
}
