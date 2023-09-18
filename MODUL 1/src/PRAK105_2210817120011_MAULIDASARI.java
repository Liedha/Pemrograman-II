import java.util.Scanner;

public class PRAK105_2210817120011_MAULIDASARI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
        String makanan = input.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobi = input.nextLine();
        System.out.println("Aku Suka Makan " +makanan+", dan Hobi ku " + hobi);
    }
}
