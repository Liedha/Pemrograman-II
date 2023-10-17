public class Buah {

    String Nama;
    double berat;
    double harga;
    double jumlah_beli;
    double harga_sebelum_diskon;
    double total_diskon;
    double harga_setelah_diskon;

    public Buah(String nama, double berat, double harga, double jumlah_beli) {
        Nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
        this.harga_sebelum_diskon = jumlah_beli/berat * harga;
        this.total_diskon = 0.02 * (4 * harga) * Math.floor(jumlah_beli/4);
        this.harga_setelah_diskon = harga_sebelum_diskon - total_diskon;
    }

    void output() {
        System.out.println("Nama Buah: " + Nama);
        System.out.println("Berat: " + berat);
        System.out.printf("Harga: %.1f \n", harga);
        System.out.printf("Jumlah Beli: %.1f kg\n", jumlah_beli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f \n", harga_sebelum_diskon);
        System.out.printf("Total Diskon: Rp%.2f \n", total_diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", harga_setelah_diskon);
        System.out.println();
    }
}