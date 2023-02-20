import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int table [] = {54444, 785, 854, 7, 85, 7474};

        System.out.println(Arrays.toString(table));

        reverse(table);

        System.out.println(Arrays.toString(table));
    }

    public static void reverse (int [] items) {
        int temp;
        for (int i = 0; i < items.length/2; i++) {
            temp = items [items.length - 1 - i];
            items [items.length - 1 - i] = items [i];
            items [i] = temp;
        }
    }
}