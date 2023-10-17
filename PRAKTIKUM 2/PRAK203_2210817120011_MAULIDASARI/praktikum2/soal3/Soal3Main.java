package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //kode di bawah terjadi error karena kurang tanda titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; //kode ini terjadi error karena tipe datanya adalah char seharusnya String
        p1.setJabatan("Assasin"); //kode ini terjadi error karena method setJabatan tidak memiliki parameter sehingga tidak dapat menerima jabatan yang diatur.
        p1.umur = 17; //variabel umur belum diinisiasi sehingga hasilnya 0, jadi perlu diinisiasi terlebih dahulu
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //kode di bawah ini kurang kata tahun, karena di outputnya ada kata tahun
        //System.out.println("Umur: " + p1.);
        System.out.println("Umur: " + p1.umur + "tahun");
    }
}
