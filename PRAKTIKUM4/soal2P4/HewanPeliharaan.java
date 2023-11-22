package soal2P4;

import java.util.Scanner;

public abstract class HewanPeliharaan {
    protected static String nama;
    protected static String ras;

    public HewanPeliharaan(String n, String r) {
        nama = n;
        ras = r;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama hewan peliharaan: ");
        nama = scanner.nextLine();
        System.out.print("Ras: ");
        ras = scanner.nextLine();
    }

    public static void display(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}


