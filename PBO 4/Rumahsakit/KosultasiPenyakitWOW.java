package Rumahsakit;
import java.time.LocalDate;


public class KosultasiPenyakitWOW {
    private LocalDate tanggal;
    private PegawaiPNS dokter;
    private PegawaiPNS perawat;


    public LocalDate getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    
    public PegawaiPNS getDokter() {
        return dokter;
    }
    
    public void setDokter(PegawaiPNS dokter) {
        this.dokter = dokter;
    }
    
    public PegawaiPNS getPerawat() {
        return perawat;
    }
    
    public void setPerawat(PegawaiPNS perawat) {
        this.perawat = perawat;
    }
    
    // public String getInfo() {
    //     String info = "";
    //     info += "Tanggal: " + tanggal.toString();
    //     info += "\nDokter: " + dokter.getInfo();
    //     info += "\nPerawat: " + perawat.getInfo();
    //     return info;
    // }
    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";
        return info;
    }
    
}
