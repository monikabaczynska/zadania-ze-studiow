public class Main {
    public static void main(String[] args) {

        String[] test = {"11", "45", "485", "785","74"};

        print(test);

        print(reverse(test));
    }

    public static String[] reverse (String[] items) {
        String temp;
        for (int i = 0; i < items.length/2 ;i++) {
            temp = items [i];
            items[i] = items [items.length-1-i];
            items [items.length-1-i] = temp;
        }
        return items;
    }

    public static void print (String[] items) {
        System.out.print("Table: " );
        for (String i: items) {
            System.out.print(i + " ");
        }
    }
}