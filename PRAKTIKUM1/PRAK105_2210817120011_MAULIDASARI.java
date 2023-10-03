import java.util.Scanner;

public class PRAK105_2210817120011_MAULIDASARI {
    public static void main(String[] args) {

        final double PHI = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jarijari = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        scanner.close();

        double volume = PHI * Math.pow(jarijari, 2) * tinggi;
        System.out.printf("\nVolume tabung dengan jari-jari %.1f dan tinggi %.1f adalah %.3f m3\n", jarijari, tinggi, volume);
    }
}