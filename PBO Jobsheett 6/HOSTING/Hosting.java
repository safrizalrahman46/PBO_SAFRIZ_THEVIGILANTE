package HOSTING;

public class Hosting {
    private String domain;
    private int storage;
    private int bandwidth;
    private String[] features;

    public Hosting() {
        features = new String[10]; // Default size for features array
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String[] getFeatures() {
        return features;
    }

    public void addFeature(String feature) {
        for (int i = 0; i < features.length; i++) {
            if (features[i] == null) {
                features[i] = feature;
                break;
            }
        }
    }

    public String getDetails() {
        String details = "Domain: " + domain + "\n" +
                         "Storage: " + storage + " GB\n" +
                         "Bandwidth: " + bandwidth + " GB\n" +
                         "Features: ";
        for (String feature : features) {
            if (feature != null) {
                details += feature + " ";
            }
        }
        return details.trim();
    }
}
