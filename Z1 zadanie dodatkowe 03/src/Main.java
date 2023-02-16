public class Main {


    public static void main(String[] args) {

        int table [] = {445, 4514, 45, 4, -100000};

        System.out.println(max(table));
    }

    public static int max (int[] items) {
        if (items.length == 0) {
            return 0;
        }
        int max = items [0];
        for (int temp: items) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}