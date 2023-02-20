public class Main {

    public static void main(String[] args) {

        Kiciuś[] rodzinaKiciusiów = {
                new Kiciuś("Czarek", true, "czarny"),
                new Kiciuś("Celinka", false, "bura"),
                new Kiciuś("February", true, "rudy"),
                new Kiciuś("Gowin", true, "biały"),
                new Kiciuś("January", false, "rudy") };

        System.out.println(imionaKotów(rodzinaKiciusiów));

        statusy(rodzinaKiciusiów);
    }

    public static String imionaKotów(Kiciuś[] lista) {
        String imiona = "";
        for (Kiciuś element: lista) {
            imiona += element.imie + ", ";
        }
        return imiona;
    }

    public static void statusy(Kiciuś[] nowaLista) {
        for (Kiciuś dane: nowaLista) {
            System.out.println(dane.toString());
        }
    }
}