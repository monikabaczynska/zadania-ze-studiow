public class Converter {

    public static void main(String[] args) {
        int priceInEur = 5;
        double przelicznik = 4.25;

        double priceInPln = priceInEur * przelicznik;

        System.out.println(priceInPln);
    }
}
