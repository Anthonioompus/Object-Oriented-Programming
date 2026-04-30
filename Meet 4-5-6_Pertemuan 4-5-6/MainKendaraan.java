package tugas456;
public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil("Toyota Avanza", 160, 4);
        Kendaraan k2 = new Motor("Honda CBR", 200, "4-Tak");

        System.out.println("--- Info K1 ---");
        k1.infoKendaraan();
        k1.gerakkan();

        System.out.println("\n--- Info K2 ---");
        k2.infoKendaraan();
        k2.gerakkan();
    }
}