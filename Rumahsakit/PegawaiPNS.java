package Rumahsakit;
/**
 * PegawaiPNS
 */
public class PegawaiPNS {

    private String nip19;
    private String nama19;

    public PegawaiPNS (String nip19, String nama19) {
        this.nip19 = nip19;
        this.nama19 = nama19;
    }


    public String getNip () {
        return nip19;
    }
        
        public void setNip (String nip) {
        this.nip19 = nip19;
    }   
        public String getNama () {
        return nama19;
        }    
        public void setNama (String nama) {
        this. nama19 = nama19;
        }


        public String getInfo () {
            return nama19 + " (" + nip19 + ") ";
    }
}