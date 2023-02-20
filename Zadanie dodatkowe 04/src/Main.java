public class Main {

    public static void main(String[] args) {

        double[] tablicaDabli = {5.33, 5.44, 3.44};

        DynamicTable tablicaDynamiczna = new DynamicTable(tablicaDabli);

        System.out.println(tablicaDynamiczna);
        tablicaDynamiczna.addItem(1000);
        System.out.println(tablicaDynamiczna);
    }
}