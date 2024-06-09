package TUBES;
abstract class Person {
    protected String nama;
    protected String alamat;

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public abstract void tampilkanInfo();
}