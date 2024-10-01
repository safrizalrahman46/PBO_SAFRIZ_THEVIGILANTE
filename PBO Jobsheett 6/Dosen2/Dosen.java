package Dosen2;

public class Dosen extends Pegawai {
    public String nidn;

    // public Dosen() {
    //     System.out.println("Objek dari class Dosen dibuat");
    // }

     // Constructor without parameters
     public Dosen() {
        // Default constructor
    }

    //Percobaan7 1
    // public Dosen (String nip, String nama, double gaji, String nidn) {
    //     this.nip = nip;
    //     this.nama = nama;
    //     this.gaji = gaji;
    //     this.nidn = nidn;
    // }
    
    //Percobaan7 2
    // public Dosen (String nip, String nama, double gaji, String nidn) {
    //     super.nip = nip;
    //     super.nama = nama;
    //     super.gaji = gaji;
    //     this.nidn = nidn;
    // }
    
    //Percobaan7 3
    // public Dosen (String nip, String nama, double gaji, String nidn) {
    //     super();
    //     super.nip = nip;
    //     super.nama = nama;
    //     super.gaji = gaji;
    //     this.nidn = nidn;
    // }

    //Percobaan7 5
    // public Dosen (String nip, String nama, double gaji, String nidn) {
    //     this.nidn = nidn;
    //     super(nip, nama, gaji);
    // }
    
    //Percobaan7 6
    public Dosen (String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }
    



     // Constructor with parameters
    //  public Dosen(String nip, String nama, double gaji, String nidn) {
    //     this.nip = nip;
    //     this.nama = nama;
    //     this.gaji = gaji;
    //     this.nidn = nidn;
    //     System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    // }

    // Method to get all information
    public String getAllInfo() {
        return "NIP: " + nip + ", Nama: " + nama + ", Gaji: " + gaji + ", NIDN: " + nidn;
    }
    // public String getAllInfo() {
    //     String info = "";
    //     info += "NIP: " + nip + "\n";
    //     info += "Nama: " + nama + "\n";
    //     info += "Gaji: " + gaji + "\n";
    //     info += "NIDN: " + nidn + "\n";
    //     return info;
    // }

    //THIS
    // public String getAllInfo() {
    //     String info = "";
    //     info += "NIP: " + this.nip + "\n";
    //     info += "Nama: " + this.nama + "\n";
    //     info += "Gaji: " + this.gaji + "\n";
    //     info += "NIDN: " + this.nidn + "\n";
    //     return info;
    // }

    //SUPER
    // public String getAllInfo() {
    //     String info = "";
    //     info += "NIP: " + super.nip + "\n";
    //     info += "Nama: " + super.nama + "\n";
    //     info += "Gaji: " + super.gaji + "\n";
    //     info += "NIDN: " + super.nidn + "\n";
    //     return info;
    // }

    //Strinng statis
    // public String getAllInfo() {
    //     String info = "";
    //     info += "NIP: \n";
    //     info += "Nama: \n";
    //     info += "Gaji: \n";
    //     info += "NIDN: \n";
    //     return info;
    // }
    

    //Percobaan 5 1
    // public String getAllInfo() {
    //     String info = getInfo(); // Memanggil getInfo dari kelas Dosen
    //     info += "NIDN: " + nidn;
    //     return info;
    // }

     //Percobaan 5 2
    //  public String getAllInfo() {
    //     String info = this.getInfo(); // Memanggil getInfo dari objek saat ini
    //     info += "NIDN: " + nidn;
    //     return info;
    // }
    
    //Percobaan 5 3
    // public String getAllInfo() {
    //     String info = super.getInfo(); // Memanggil getInfo dari superclass
    //     info += "NIDN: " + nidn;
    //     return info;
    // }
    
    //getinfo
    public String getInfo() {
        return "NIDN: " + this.nidn + "\n"; // Mendefinisikan getInfo di Dosen
    }
    
}

