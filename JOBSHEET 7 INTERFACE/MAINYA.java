public class MAINYA {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Standing", 150000, "Putih", "Miyako");
        TV tv = new TV("LED", 50, 3000000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 5000000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(40, 3, 10000000, "Hitam", "Panasonic");

        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }

}
