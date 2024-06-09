package TUBES;
class Transaksi {
    private Person person;
    private Produk produk;
    private int jumlah;

    public Transaksi(Person person, Produk produk, int jumlah) {
        this.person = person;
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public void tampilkanTransaksi() {
        System.out.println("Detail Transaksi:");
        person.tampilkanInfo();
        produk.tampilkanProduk();
        System.out.println("Jumlah: " + jumlah);
        double totalHarga = produk.getHarga() * jumlah;
        System.out.println("Total Harga: " + totalHarga);
        
        if (produk instanceof Pajak) {
            Pajak pajak = (Pajak) produk;
            double pajakDibayar = pajak.hitungPajak();
            System.out.println("Pajak yang harus dibayar: " + pajakDibayar);
            System.out.println("Total Harga + Pajak: " + (totalHarga + pajakDibayar));
        }
    }
}