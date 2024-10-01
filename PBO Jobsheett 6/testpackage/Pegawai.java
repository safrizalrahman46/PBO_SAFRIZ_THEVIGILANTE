package testpackage;

public class Pegawai {
    public String nip;
    public String nama;

    // protected double gaji;
    public double gaji;

    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";
        return info;
    }
}

//Modify
// public class Pegawai {
//     public String nip;
//     public String nama;
//     private double gaji; // Private field

//     public Pegawai() {
//         System.out.println("Objek dari class Pegawai dibuat");
//     }

//     // Getter untuk gaji
//     public double getGaji() {
//         return gaji;
//     }

//     // Setter untuk gaji
//     public void setGaji(double gaji) {
//         this.gaji = gaji;
//     }

//     public String getInfo() {
//         String info = "";
//         info += "NIP    : " + nip + "\n";
//         info += "Nama   : " + nama + "\n";
//         info += "Gaji   : " + gaji + "\n";
//         return info;
//     }
// }

