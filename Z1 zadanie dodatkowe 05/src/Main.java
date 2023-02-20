public class Main {


    public static void main(String[] args) {

        UniqueTable ut = new UniqueTable();
        ut.addItem(2.88);
        ut.addItem(55.84);
        ut.addItem(741.88);
        ut.addItem(2.87);
        System.out.println(ut.toString());

        ut.deleteItem(2.88);
        ut.deleteItem(555);
        System.out.println(ut.toString());
    }
}