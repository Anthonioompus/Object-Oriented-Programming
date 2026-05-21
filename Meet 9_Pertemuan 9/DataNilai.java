package nilaiakhir;
public class DataNilai {
    private String npm, nama, alamat, matkul;
    private double nilaiAkhir;

    // Constructor
    public DataNilai(String npm, String nama, String alamat, String matkul, double nilaiAkhir) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
        this.matkul = matkul;
        this.nilaiAkhir = nilaiAkhir;
    }

    // Getter untuk masing-masing atribut
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getMatkul() {
        return matkul;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
}
