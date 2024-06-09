package TUBES;

class Karyawan extends Person {
    private String idKaryawan;

    public Karyawan(String nama, String alamat, String idKaryawan) {
        super(nama, alamat);
        this.idKaryawan = idKaryawan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat Karyawan: " + alamat);
        System.out.println("ID Karyawan: " + idKaryawan);
    }
}