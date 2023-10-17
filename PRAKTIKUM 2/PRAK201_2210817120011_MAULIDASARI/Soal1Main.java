public class Soal1Main {
    public static void main(String[] args) {

        Buah o1 = new Buah("Apel", 0.4, 7000.0, 40.0);
        Buah o2 = new Buah("Mangga", 0.2, 3500.0, 15.0);
        Buah o3 = new Buah("Alpukat", 0.25, 10000.0, 12.0);

        o1.output();
        o2.output();
        o3.output();
    }
}