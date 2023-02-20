public class Kot {
    private String imieKota;
    String getImieKota() {
        return "Imię Kota: " + this.imieKota;
    }
    void setImieKota(String imieKota) {
        if (imieKota.length() >= 2){
            this.imieKota = imieKota;
        }
    }

    private int wiekKota;
}
