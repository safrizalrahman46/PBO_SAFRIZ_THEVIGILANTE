package HOSTINGMAN;

class HostingService {
    // Attributes
    protected String serviceId;
    protected String provider;
    protected double price;

    // Constructor without parameters
    public HostingService() {
        this.serviceId = "N/A";
        this.provider = "Unknown";
        this.price = 0.0;
        System.out.println("HostingService object created with default values.");
    }

    // Constructor with parameters
    public HostingService(String serviceId, String provider, double price) {
        this.serviceId = serviceId;
        this.provider = provider;
        this.price = price;
        System.out.println("HostingService object created with parameter values.");
    }

    // Method to display information
    public String getInfo() {
        return "Service ID: " + serviceId + "\nProvider: " + provider + "\nPrice: $" + price;
    }
}
