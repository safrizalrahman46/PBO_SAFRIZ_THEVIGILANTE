package Pekalian;

public class Perkalian {

    // Overloading pertama: metode perkalian dengan 2 parameter
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    // Overloading kedua: metode perkalian dengan 3 parameter
    // void perkalian(int a, int b, int c) {
    //     System.out.println(a * b * c);
    // }

    //Kedua
    void perkalian(double a, double b) {

        System.out.println(a * b);
        
        }

    public static void main(String[] args) {
        Perkalian objek = new Perkalian();

        // Memanggil metode perkalian dengan 2 parameter
        objek.perkalian(25, 43); // Output: 1075

        // Memanggil metode perkalian dengan 3 parameter
        // objek.perkalian(34, 23, 56); // Output: 43744

        // objek.perkalian(34.23, 23.7); 
    }
}

