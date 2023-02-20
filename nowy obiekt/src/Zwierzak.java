public class Zwierzak {

    String rodzaj;
    String imie;
    int wiek;
    boolean spi = false;

    public Zwierzak (String rodzaj, String imie, int wiek) {
        this.rodzaj = rodzaj;
        this.imie = imie;
        this.wiek = wiek;
    }

    void urosnij() {
        wiek++;
    }

    void idzSpac() {
        spi = true;
    }
}
