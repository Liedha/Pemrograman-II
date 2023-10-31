package soal2;

import java.util.HashMap;

public class Negara {
    String negara;
    String jenis;
    String pemimpin;
    int tanggalMerdeka;
    int bulanMereka;
    int tahunMerdeka;

    public Negara(String negara, String jenis, String pemimpin, int tanggalMerdeka, int bulanKemerdekaan, int tahunMerdeka) {
        this.negara = negara;
        this.jenis = jenis;
        this.pemimpin = pemimpin;
        this.tanggalMerdeka = tanggalMerdeka;
        this.bulanMereka = bulanKemerdekaan;
        this.tahunMerdeka = tahunMerdeka;
    }

    public String toString() {
        if (jenis.equals("monarki")) {
            return "\nNegara " + negara + " mempunyai Raja bernama " + pemimpin;
        } else {
            return "\nNegara " + negara + " mempunyai " + jenis + " bernama " + pemimpin +
                    "\nDeklarasi Kemerdekaan pada Tangal " + tahunMerdeka + " " + getNamaBulan(bulanMereka) + " " + tahunMerdeka;
        }
    }

    public String getNamaBulan(int bulan) {
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");
        return namaBulan.get(bulan);
    }
}
