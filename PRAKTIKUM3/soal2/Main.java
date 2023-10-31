package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Negara> negaraList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("");
            String negara = scanner.nextLine();
            System.out.print("");
            String jenis = scanner.nextLine();
            System.out.print("");
            String pemimpin = scanner.nextLine();

            if (jenis.equals("monarki")) {
                continue;
            }

            System.out.print("");
            int tanggalMerdeka = scanner.nextInt();
            System.out.print("");
            int bulanMerdeka = scanner.nextInt();
            System.out.print("");
            int tahunMerdeka = scanner.nextInt();

            scanner.nextLine();

            Negara ngr = new Negara(negara, jenis, pemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka);
            negaraList.add(ngr);
        }

        for (Negara ngr : negaraList) {
            System.out.println(ngr.toString());
        }
    }
}
