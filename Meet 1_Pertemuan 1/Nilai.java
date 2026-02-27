package Tugasper1;

public class Nilai {
    String nim;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;
    int nilaiAkhir;


    void CetakNilai() {
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Absen[10%]  : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%]   : " + nilaiUTS);
        System.out.println("Nilai UAS [40%]   : " + nilaiUAS);
        System.out.println("Nilai Akhir       : " + nilaiAkhir);
    }
}