package praktikum2.soal2;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;

    public Kopi() {
    }

    void info() {
        System.out.println("Nama: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: RP. " + harga);
    }
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getPajak() {
        return (double) (0.11 * harga);
    }
}
