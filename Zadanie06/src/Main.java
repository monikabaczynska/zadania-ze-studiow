public class Main {
    public static void main(String[] args) {

        int [] liczby = {3, 4, 5, 7, 8, 11, 12, 14, 16,17};
        int sumaElementow = 0;

        for (int wynik: liczby) {
            sumaElementow += wynik;
        }
        System.out.println((double)sumaElementow/liczby.length);
    }
}