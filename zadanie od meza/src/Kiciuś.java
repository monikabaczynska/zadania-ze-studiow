public class Kiciuś {

    String imie;
    boolean grzeczny;
    String kolor;

    public Kiciuś (String imie, boolean grzeczny, String kolor) {
        this.imie = imie;
        this.grzeczny = grzeczny;
        this.kolor = kolor;
    }

    public String toString() {
        String fraza = imie + " to " + kolor;
        if (grzeczny) {
            fraza += " grzeczny ";
        }
        else {
            fraza += " niegrzeczny ";
        }
        fraza += "kiciuś";
        return fraza;
    }
}
