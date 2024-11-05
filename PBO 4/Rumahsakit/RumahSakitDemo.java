package Rumahsakit;
import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
        PegawaiPNS ani = new PegawaiPNS("1234", "dr. Ani");
        PegawaiPNS bagus = new PegawaiPNS("4567", "dr. Bagus");
        
        PegawaiPNS desi = new PegawaiPNS("1234", "Ns. Desi");
        PegawaiPNS eka = new PegawaiPNS("4567", "Ns. Eka");
        
        PasienSakit pasien1 = new PasienSakit("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021 , 8,11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9,11), bagus, eka);
        
        System.out.println(pasien1.getInfo());
        
        PasienSakit pasien2 = new PasienSakit("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
        
        }
        
}
