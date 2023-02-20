public class Main {


    public static void main(String[] args) {
        Zwierzak kot1 = new Zwierzak ("kicius", "Czarek", 3);

        System.out.println(czySpi(kot1.spi));
        kot1.idzSpac();
        System.out.println(czySpi(kot1.spi));
    }

    public static String czySpi (boolean statusSnu) {
        if (!statusSnu) {
            return "obudzony";
        } else {
            return "zaśnięty";
        }
    }
}