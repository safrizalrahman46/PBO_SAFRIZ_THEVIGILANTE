package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        System.out.println(dosen1.getInfo());
    }
}
