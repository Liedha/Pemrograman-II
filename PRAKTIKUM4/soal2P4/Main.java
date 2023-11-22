package soal2P4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:\n1 = Kucing\n2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        if (pilih == 1) {
            Kucing kucing = new Kucing(null, null, null);
            HewanPeliharaan.display();
            kucing.displayDetailKucing();

        } else if (pilih == 2) {
            Anjing anjing = new Anjing(null, null, null, null);
            HewanPeliharaan.display();
            anjing.displayDetailAnjing();
        }
    }
}


