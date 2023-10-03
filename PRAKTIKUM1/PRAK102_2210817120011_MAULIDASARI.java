import java.util.Scanner;

public class PRAK102_2210817120011_MAULIDASARI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int angka = scanner.nextInt();
        int a = 0;

        while (a <= 10) {
            if (angka % 5 == 0) {
                System.out.print((angka/ 5) - 1);
            } else {
                System.out.print(angka);
            }
            if (a < 10) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
            angka++;
            a++;
        }
        scanner.close();
    }
}