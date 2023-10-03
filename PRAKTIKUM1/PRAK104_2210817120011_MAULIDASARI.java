import java.util.Scanner;

public class PRAK104_2210817120011_MAULIDASARI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganAbu = scanner.nextLine().toUpperCase();

        System.out.print("Tangan Bagas: ");
        String tanganBagas = scanner.nextLine().toUpperCase();

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 5; i++) {
            char Abu = tanganAbu.charAt(i);
            char Bagas = tanganBagas.charAt(i);

            if (Abu == Bagas) {
            } else if ((Abu == 'B' && Bagas == 'G') ||
                    (Abu == 'G' && Bagas == 'K') ||
                    (Abu == 'K' && Bagas == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        if (poinAbu > poinBagas) {
            System.out.println("\nAbu");
        } else if (poinAbu < poinBagas) {
            System.out.println("\nBagas");
        } else {
            System.out.println("\nSeri");
        }
        scanner.close();
    }
}