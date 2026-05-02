import java.util.Scanner;

public class KasirToko {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        double totalBelanja;
        int pilihan;
        double diskon = 0;
        String kategori = "Regular";

        System.out.print("Masukkan nama pelanggan : ");
        nama = input.nextLine();

        System.out.print("Total harga belanja : ");
        totalBelanja = input.nextDouble();

        System.out.println("Pilih kategori member:");
        System.out.println("1. Regular");
        System.out.println("2. Silver");
        System.out.println("3. Gold");
        System.out.println("4. Platinum");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                kategori = "Regular";
                diskon = 0;
                break;
            case 2:
                kategori = "Silver";
                diskon = 0.10;
                break;
            case 3:
                kategori = "Gold";
                diskon = 0.20;
                break;
            case 4:
                kategori = "Platinum";
                diskon = 0.30;
                break;
            default:
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan");
        }

        double potongan = totalBelanja * diskon;
        double totalBayar = totalBelanja - potongan;

        String metode;

        if (totalBayar < 50000) {
            metode = "Tunai";
        } else if (totalBayar < 200000) {
            metode = "Tunai / Transfer";
        } else {
            metode = "Tunai / Transfer / Kartu Kredit";
        }

        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Kategori Member : " + kategori);
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon : Rp " + potongan);
        System.out.println("Total Bayar : Rp " + totalBayar);
        System.out.println("--------------------------------------");
        System.out.println("Metode Pembayaran : " + metode);
        System.out.println("======================================");
    }
}
