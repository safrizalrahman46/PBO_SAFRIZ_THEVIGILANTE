package HOSTINGMAN;

class WebHosting extends HostingService {
    // Additional attribute for WebHosting
    public String domainName;

    // Constructor without parameters
    public WebHosting() {
        super(); // Call the parent class constructor
        this.domainName = "unassigned.com";
        System.out.println("WebHosting object created with default values.");
    }

    // Constructor with parameters
    public WebHosting(String serviceId, String provider, double price, String domainName) {
        super(serviceId, provider, price); // Call the parent class constructor with parameters
        this.domainName = domainName;
        System.out.println("WebHosting object created with parameter values.");
    }

    // Overridden method to display information
    @Override
    public String getInfo() {
        return super.getInfo() + "\nDomain Name: " + domainName;
    }
}
