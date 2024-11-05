public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return "Kipas [Jenis: " + jenis + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Merk: " + getMerk()
                + "]";
    }
}
