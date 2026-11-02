
import java.util.Scanner;

public class Tugas306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        }

        int totalPelangganSeluruhToko = 0;
        long totalBarangSeluruhToko = 0;

        int tokoTerbanyak = 1;
        long barangTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\nToko " + i);

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif!");
                System.out.print("Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
            }

            long totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + ": ");
                int jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif!");
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            totalPelangganSeluruhToko += jumlahPelanggan;
            totalBarangSeluruhToko += totalBarangToko;

            System.out.println("Toko " + i
                    + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\n==============================");
        System.out.println("Total pelanggan seluruh toko: "
                + totalPelangganSeluruhToko);
        System.out.println("Total barang seluruh toko: "
                + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbanyak);

        sc.close();
    }
}
