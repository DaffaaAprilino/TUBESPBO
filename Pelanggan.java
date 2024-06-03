package TUBES;

class Pelanggan extends Person {
    private String idPelanggan;

    public Pelanggan(String nama, String alamat, String idPelanggan) {
        super(nama, alamat);
        this.idPelanggan = idPelanggan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Pelanggan: " + idPelanggan);
    }
}
