import java.util.Scanner;

public class PRAK103_2210817120011_MAULIDASARI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        int N = scanner.nextInt();
        int bilangan = scanner.nextInt();
        int a = 0;

        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);

                if (a < N - 1) {
                    System.out.print(", ");
                }
                a++;
            }
            bilangan ++;
        } while (a < N);
        System.out.println();
        scanner.close();
    }
}