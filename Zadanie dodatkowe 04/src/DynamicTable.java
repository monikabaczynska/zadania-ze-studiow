public class DynamicTable {

    double[] przykladowaTablica;

    DynamicTable (double [] tablicaWKonstruktorze) {
        przykladowaTablica = tablicaWKonstruktorze;
    }
    void addItem (double newItem) {
        double[] tablicaWMetodzie = new double [przykladowaTablica.length+1];
        int index = 0;
        for (double zmiennaZWartosciamiTablicy: przykladowaTablica) {
            tablicaWMetodzie [index] = zmiennaZWartosciamiTablicy;
            index++;
        }
        tablicaWMetodzie [index] = newItem;
        przykladowaTablica = tablicaWMetodzie;
    }

    public String toString() {
        String tymczasowyString = "";
        for (double kolejnaNowaZmiennaMasakra: przykladowaTablica) {
            tymczasowyString += kolejnaNowaZmiennaMasakra + " ";
        }
        return "[" + tymczasowyString + "]";
    }
}
