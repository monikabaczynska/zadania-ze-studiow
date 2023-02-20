import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    Kot kicius = new Kot();
    kicius.setImie(getUserInput());


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }
}