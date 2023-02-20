public class Main {


    public static void main(String[] args) {

    DynamicTable dt = new DynamicTable();

    dt.addItem(44.4);
    dt.addItem(4698.54);
    dt.addItem(8.01);

    System.out.println(dt.toString());

    dt.deleteItem(1);

    System.out.println(dt.toString());

    }
}