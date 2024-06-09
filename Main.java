package TUBES;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input data pelanggan
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan alamat pelanggan: ");
            String alamatPelanggan = scanner.nextLine();
            System.out.print("Masukkan ID pelanggan: ");
            String idPelanggan = scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan(namaPelanggan, alamatPelanggan, idPelanggan);

            // Input data produk
            System.out.print("Masukkan nama produk: ");
            String namaProduk = scanner.nextLine();
            System.out.print("Masukkan harga produk: ");
            double hargaProduk = scanner.nextDouble();

            Produk produk = new Produk(namaProduk, hargaProduk);

            // Input data transaksi
            System.out.print("Masukkan jumlah: ");
            int jumlah = scanner.nextInt();

            Transaksi transaksi = new Transaksi(pelanggan, produk, jumlah);

            // Tampilkan data transaksi
            transaksi.tampilkanTransaksi();
        }
    }
}
