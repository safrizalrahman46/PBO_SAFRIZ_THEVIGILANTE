// package Rumahsakit;
// import java.time.LocalDate;
// import java.util.ArrayList; // Add this import

// public class PasienSakit {

//     private String noRekamMedis;
//     private String nama;
//     private ArrayList<KosultasiPenyakitWOW> riwayatKonsultasi;

//     public String getNoRekamMedis() {
//         return noRekamMedis;
//     }


//     public void setNoRekamMedis(String noRekamMedis) {
//         this.noRekamMedis = noRekamMedis;
//     }


//     public String getNama() {
//         return nama;
//     }


//     public void setNama(String nama) {
//         this.nama = nama;
//     }

//     // public PasienSakit(String noRekamMedis, String nama) {
//     //     this. noRekamMedis = noRekamMedis;
//     //     this. nama = nama;
//     // }

//     // public String getInfo() {
//     //     String info = "";
//     //     info += "No Rekam Medis: " + this.noRekamMedis + "\n";
//     //     info += "Nama: " + this.nama + "\n";
//     //     return info;
//     // }

//     public String getInfo() {
//         String info = "";
//         info += "No Rekam Medis: " + this.noRekamMedis + "\n";
//         info += "Nama: " + this.nama + "\n";
//         if (!riwayatKonsultasi.isEmpty()) {
//             info += "Riwayat Konsultasi:\n";
//             for (KosultasiPenyakitWOW konsultasi : riwayatKonsultasi) {
//                 info += konsultasi.getInfo();
//             }
//         } else {
//             info += "Belum ada riwayat konsultasi";
//         }
//         info += "\n";
//         return info;
//     }
    

//     public PasienSakit(String noRekamMedis, String nama) {
//         this.noRekamMedis = noRekamMedis;
//         this.nama = nama;
//         this.riwayatKonsultasi = new ArrayList<KosultasiPenyakitWOW>();
//     }

//     public void tambahKonsultasi (LocalDate tanggal, PegawaiPNS dokter, PegawaiPNS perawat) {
//         KosultasiPenyakitWOW konsultasi = new KosultasiPenyakitWOW () ;
//         konsultasi. setTanggal (tanggal) ;
//         konsultasi. setDokter (dokter) ;
//         konsultasi. setPerawat (perawat) ;
//         riwayatKonsultasi. add (konsultasi);
//     }
// }
package Rumahsakit;
import java.time.LocalDate;
import java.util.ArrayList; // Add this import

public class PasienSakit {

    private String noRekamMedis;
    private String nama;
    private ArrayList<KosultasiPenyakitWOW> riwayatKonsultasi;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis: " + this.noRekamMedis + "\n";
        info += "Nama: " + this.nama + "\n";
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi:\n";
            for (KosultasiPenyakitWOW konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }
        info += "\n";
        return info;
    }

    public PasienSakit(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<KosultasiPenyakitWOW>();
    }

    public void tambahKonsultasi(LocalDate tanggal, PegawaiPNS dokter, PegawaiPNS perawat) {
        KosultasiPenyakitWOW konsultasi = new KosultasiPenyakitWOW();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
}
