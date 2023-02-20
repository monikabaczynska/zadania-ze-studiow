public class Main {
    public static void main(String[] args) {

        int age = 12;
        String animal = "pies"; {

            if (age > 10) {
                if (animal == "pies") {
                    System.out.println("STARY PIES");
                } else {
                    System.out.println("MŁODY PIES");
                }
            }
        }
        if (age <= 10) {
            if (animal != "pies") {
                System.out.println("MŁODY KOT");
            } else {
                System.out.println("STARY KOT");
            }
        }
    }
}