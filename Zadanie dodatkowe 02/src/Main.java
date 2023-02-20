public class Main {

    public static void main(String[] args) {

        String [] elementy = new String[]{"element1","element2","element3", "element4", "element5"};

        print(elementy);
        System.out.println();
        print(reverse(elementy));
    }
    static void print (String [] dowolnaTablica) {
        System.out.print("Table: ");
        for (String elementyDowolnejTablicy: dowolnaTablica) {
            System.out.print(elementyDowolnejTablicy + " ");
        }
    }
    static String [] reverse(String[] dowolnaTablica2) {
        String [] tablicaRobocza = new String [dowolnaTablica2.length];
        int indeks = tablicaRobocza.length - 1;
        for (String dowolnaZmienna: dowolnaTablica2) {
            tablicaRobocza [indeks] = dowolnaZmienna;
            indeks--;
        }
        return tablicaRobocza;
    }
}

