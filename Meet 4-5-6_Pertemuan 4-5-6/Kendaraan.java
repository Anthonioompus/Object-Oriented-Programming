package tugas456;
abstract class Kendaraan {
    protected String merk;
    protected int kecepatanMaksimal;

    public Kendaraan(String merk, int kecepatanMaksimal) {
        this.merk = merk;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    abstract void gerakkan();

    void infoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/h");
    }
}
