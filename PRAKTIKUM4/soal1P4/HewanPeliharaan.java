package soal1P4;

import java.util.Scanner;

public class HewanPeliharaan {
    String nama;
    String ras;

    public HewanPeliharaan(String n, String r) {
        nama = n;
        ras = r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama Hewan Peliharaan: ");
        nama = scanner.nextLine();
        System.out.println("Ras: ");
        ras = scanner.nextLine();
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}

