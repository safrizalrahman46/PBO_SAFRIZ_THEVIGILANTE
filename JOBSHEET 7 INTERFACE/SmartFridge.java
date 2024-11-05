public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    @Override
    public void naikkanVolume(int increment) { volume += increment; }

    @Override
    public void turunkanVolume(int decrement) { volume -= decrement; }

    @Override
    public String getInfo() {
        return "SmartFridge [Volume: " + volume + ", Jumlah Pintu: " + getJumlahPintu() + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Merk: " + getMerk() + "]";
    }
}
