package TugasOverriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan mie instan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar.");
    }
}