package tugas456;
import java.util.Scanner;
public class MainToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();

        System.out.println("=== KATALOG BARANG ===");
        for (Barang b : toko.getKatalog()) {
            b.infoBarang();
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();
        input.nextLine(); // Consume newline

        // Dua array untuk menyimpan transaksi
        Barang[] belanjaBarang = new Barang[jumlahItem];
        int[] belanjaJumlah = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode       : ");
            String kode = input.nextLine();

            Barang ditemukan = toko.cariBarang(kode);

            if (ditemukan == null) {
                System.out.println("Kode barang tidak ditemukan!");
            } else {
                belanjaBarang[i] = ditemukan;
                System.out.print("Masukkan jumlah Beli: ");
                belanjaJumlah[i] = input.nextInt();
                input.nextLine(); // Consume newline
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************************************************************");
        System.out.printf("%-5s %-15s %-15s %-10s %-12s %-15s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("=========================================================================");

        int grandTotal = 0;
        int noUrut = 1;

        for (int i = 0; i < jumlahItem; i++) {
            if (belanjaBarang[i] != null) {
                Barang b = belanjaBarang[i];
                int subTotal = b.getHarga() * belanjaJumlah[i];
                grandTotal += subTotal;
                
                System.out.printf("%-5d %-15s %-15s %-10d %-12d %-15d\n", 
                        noUrut, b.getKode(), b.getNama(), b.getHarga(), belanjaJumlah[i], subTotal);
                noUrut++;
            }
        }

        System.out.println("=========================================================================");
        System.out.printf("%-58s %-15d\n", "Total Bayar", grandTotal);

        input.close();
    }
}
