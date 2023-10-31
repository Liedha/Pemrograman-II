package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Dadu> daduList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
        }

        System.out.println();
        int totalNilai = 0;
        for (int i = 0; i < daduList.size(); i++) {
            Dadu dadu = daduList.get(i);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan: " + totalNilai);
    }
}