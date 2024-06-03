package TUBES;
class Person {
    protected String nama;
    protected String alamat;

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
