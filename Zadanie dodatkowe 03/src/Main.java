public class Main {

    public static void main(String[] args) {

        int[]testowaTablica = {1,2,44777,3,5,6,45};

        int[]pustaTablica ={};

        System.out.println(max(pustaTablica));
    }
    static int max(int[] items) {
        if (items.length == 0) {
            return 0;
        }
        int zmienna = items[0];
        for (int nowaNazwa: items) {
            if (nowaNazwa > zmienna) {
                zmienna = nowaNazwa;
            }
        }
        return zmienna;
    }
}