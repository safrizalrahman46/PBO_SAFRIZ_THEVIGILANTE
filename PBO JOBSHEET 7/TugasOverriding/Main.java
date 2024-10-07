package TugasOverriding;

public class Main {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        // Pemanggilan metode yang di-override
        manusia1.makan(); // Output: Dosen makan di kantin universitas.
        manusia2.makan(); // Output: Mahasiswa makan mie instan.

        // Manusia tidak memiliki metode lembur() atau tidur(), maka tidak bisa dipanggil langsung
        // Jika ingin memanggil metode spesifik subclass, casting diperlukan:
        ((Dosen) manusia1).lembur(); // Output: Dosen sedang lembur menyiapkan materi.
        ((Mahasiswa) manusia2).tidur(); // Output: Mahasiswa tidur setelah belajar.
    }
}