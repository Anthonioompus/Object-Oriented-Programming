package nilaiakhir;

import java.util.ArrayList;

public class InputDataNilai {
    ArrayList<DataNilai> listNilai;

    public InputDataNilai() {
        listNilai = new ArrayList<>();
    }

    // Method untuk memasukkan data ke dalam ArrayList
    public void insertData(String npm, String nama, String alamat, String matkul, double nilaiAkhir) {
        DataNilai data = new DataNilai(npm, nama, alamat, matkul, nilaiAkhir);
        listNilai.add(data);
    }

    // Method untuk mengambil semua data
    public ArrayList<DataNilai> getALL() {
        return listNilai;
    }

    // Method untuk menghapus data berdasarkan index tabel
    public void deleteData(int index) {
        listNilai.remove(index);
    }
}