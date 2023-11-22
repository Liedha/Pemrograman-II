package soal2P4;

import java.util.Arrays;
import java.util.Scanner;

class Anjing extends HewanPeliharaan {
    String warnaBulu;
    String[] kemampuan;

    public Anjing(String n, String r, String w, String k) {
        super(n, r);
        warnaBulu = w;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Warna Bulu: ");
        warnaBulu = scanner.nextLine();
        System.out.println("Kemampuan : ");
        kemampuan = (scanner.nextLine()).split(",");
        System.out.println();
    }

    public void displayDetailAnjing() {
        System.out.println("Memiliki warna bulu: " + warnaBulu);
        System.out.println("Kemampuan: " + Arrays.toString(kemampuan));

    }
}
