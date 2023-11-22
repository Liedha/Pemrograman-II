package soal2P4;

import java.util.Scanner;

class Kucing extends HewanPeliharaan {
    String warnaBulu;

    public Kucing(String n, String r, String w) {
        super(n, r);
        warnaBulu = w;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Warna Bulu: ");
        warnaBulu = scanner.nextLine();
        System.out.println();
    }

    public void displayDetailKucing() {
        System.out.println("Memiliki warna bulu: " + warnaBulu);
    }
}

