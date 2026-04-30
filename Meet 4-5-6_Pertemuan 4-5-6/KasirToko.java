package tugas456;
import java.util.Scanner;
public class KasirToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Total harga belanja     : ");
        double totalBelanja = input.nextDouble();

        System.out.println("Pilih kategori member   :");
        System.out.println("1. Regular   2. Silver   3. Gold   4. Platinum");
        System.out.print("Pilihan: ");
        int pilihanMember = input.nextInt();

        double persenDiskon = 0;
        String kategoriMember = "";

        switch (pilihanMember) {
            case 1:
                kategoriMember = "Regular";
                persenDiskon = 0;
                break;
            case 2:
                kategoriMember = "Silver";
                persenDiskon = 0.10;
                break;
            case 3:
                kategoriMember = "Gold";
                persenDiskon = 0.20;
                break;
            case 4:
                kategoriMember = "Platinum";
                persenDiskon = 0.30;
                break;
            default:
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan");
                kategoriMember = "Tidak Dikenal";
                persenDiskon = 0;
                break;
        }

        double nominalDiskon = totalBelanja * persenDiskon;
        double totalBayar = totalBelanja - nominalDiskon;

        String metodePembayaran = "";
        if (totalBayar < 50000) {
            metodePembayaran = "Tunai";
        } else if (totalBayar >= 50000 && totalBayar < 200000) {
            metodePembayaran = "Tunai / Transfer";
        } else if (totalBayar >= 200000) {
            metodePembayaran = "Tunai / Transfer / Kartu Kredit";
        }

        System.out.println("\n=========== STRUK PEMBAYARAN ===========");
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Kategori Member : " + kategoriMember);
        System.out.printf("Total Belanja   : Rp %,.0f\n", totalBelanja);
        System.out.printf("Diskon (%.0f%%)   : Rp %,.0f\n", (persenDiskon * 100), nominalDiskon);
        System.out.printf("Total Bayar     : Rp %,.0f\n", totalBayar);
        System.out.println("----------------------------------------");
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("========================================");

        input.close();
    }
}
