package HOSTING;

public class VPSHosting extends Hosting {
    private int ram; // RAM in GB

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nRAM: " + ram + " GB";
    }
}
