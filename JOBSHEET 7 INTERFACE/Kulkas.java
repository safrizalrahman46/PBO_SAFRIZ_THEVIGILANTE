public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }

    @Override
    public String getInfo() {
        return "Kulkas [Jumlah Pintu: " + jumlahPintu + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Merk: " + getMerk() + "]";
    }
}
