package TUBES;

interface Pajak {
    double hitungPajak();
}

// Kelas Produk
class Produk implements Pajak {
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void tampilkanProduk() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public double hitungPajak() {
        // Contoh perhitungan pajak
        return harga * 0.1; // 10% pajak
    }
}