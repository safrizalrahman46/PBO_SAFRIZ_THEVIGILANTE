package HOSTING;

public class VpsDemo {
    public static void main(String[] args) {
        // SharedHosting instance
        SharedHosting shared = new SharedHosting();
        shared.setDomain("example.com");
        shared.setStorage(100);
        shared.setBandwidth(1000);
        shared.setNumAccounts(50);
        shared.addFeature("Free SSL");
        shared.addFeature("Daily Backups");
        System.out.println("Shared Hosting Details:");
        System.out.println(shared.getDetails());

        // VPSHosting instance
        VPSHosting vps = new VPSHosting();
        vps.setDomain("myvps.com");
        vps.setStorage(200);
        vps.setBandwidth(2000);
        vps.setRam(16);
        vps.addFeature("Root Access");
        vps.addFeature("SSD Storage");
        System.out.println("\nVPS Hosting Details:");
        System.out.println(vps.getDetails());
    }  
}
