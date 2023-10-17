package praktikum2.soal3;

//baris dibawah ini terjadi error karena nama classnya salah
//public class Employee {

public class Pegawai {
    public String nama;
    //kode di bawah ini tipe datanya salah, seharusnya menggunakan tipe data String karena isi dari variabel Asal adalah teks
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //kode di bawah ini error karena method setJabatan tidak memiliki parameter
    //public void setJabatan() {
    public void setJabatan(String jabatan) {
        //kode di bawah ini terjadi error karena variabelj tidak sesuai dengan parameter dari method
        //this.jabatan = j;
        this.jabatan = jabatan;
    }
}
