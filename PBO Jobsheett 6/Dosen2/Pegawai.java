package Dosen2;

// public class Pegawai {
//     public String nip;
//     public String nama;
//     public double gaji;
//     public String nidn;


//     public Pegawai() {
//         System.out.println("Objek dari class Pegawai dibuat");
//     }

//     public String getInfo() {
//         String info = "";
//         info += "NIP    : " + nip + "\n";
//         info += "Nama   : " + nama + "\n";
//         info += "Gaji   : " + gaji + "\n";
//         return info;
//     }
// }


//<ODIFIKASI PERCOBAAN 7 4
public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        String info = "";
        info += "NIP: " + nip + "\n";
        info += "Nama: " + nama + "\n";
        info += "Gaji: " + gaji + "\n";

        return info;
    }
}

