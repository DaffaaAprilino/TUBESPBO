package TUBES;

class Pelanggan extends Person {
    private String idPelanggan;

    public Pelanggan(String nama, String alamat, String idPelanggan) {
        super(nama, alamat);
        this.idPelanggan = idPelanggan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Alamat Pelanggan: " + alamat);
        System.out.println("ID Pelanggan: " + idPelanggan);
    }
}