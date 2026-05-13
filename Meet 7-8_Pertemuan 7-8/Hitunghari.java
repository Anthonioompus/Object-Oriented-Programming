package tugas78;
public class Hitunghari {
    public int hitung(int tahun, String bulan) {
        int jumlahHari;
        if (bulan.equals("Februari")) {
            if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0)) {
                jumlahHari = 29;
            } else {
                jumlahHari = 28;
            }
        } else if (bulan.equals("April") || bulan.equals("Juni") || 
                   bulan.equals("September") || bulan.equals("November")) {
            jumlahHari = 30;
        } else {
            jumlahHari = 31;
        }
        return jumlahHari;
    }
}