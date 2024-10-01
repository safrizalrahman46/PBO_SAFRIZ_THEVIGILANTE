package HOSTINGMAN;

public class Demo {
    public static void main(String[] args) {
        // Create a WebHosting object using the parameterized constructor
        WebHosting webHosting = new WebHosting("HST123", "FastHosting", 29.99, "mywebsite.com");
        System.out.println(webHosting.getInfo());

        // Modify the attributes
        webHosting.serviceId = "HST456"; // Modifying inherited attribute
        webHosting.provider = "SuperHost"; // Modifying inherited attribute
        webHosting.price = 34.99; // Modifying inherited attribute
        webHosting.domainName = "newwebsite.com"; // Modifying child class attribute

        // Print updated information
        System.out.println("\nUpdated WebHosting Info:");
        System.out.println(webHosting.getInfo());
    }
}
