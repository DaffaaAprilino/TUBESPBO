package TUBES;
class Transaksi {
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlah;

    public Transaksi(Pelanggan pelanggan, Produk produk, int jumlah) {
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public void tampilkanTransaksi() {
        System.out.println("Detail Transaksi:");
        pelanggan.tampilkanInfo();
        produk.tampilkanProduk();
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: " + (produk.getHarga() * jumlah));
    }
}
