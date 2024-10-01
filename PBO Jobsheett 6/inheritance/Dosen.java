package inheritance;
import testpackage.Pegawai;

public class Dosen extends Pegawai {

    public Dosen() {
        System.out.println("Gaji: " + gaji);  // Akses diperbolehkan karena gaji protected
        System.out.println("Objek dari class Dosen dibuat");
    }
}
