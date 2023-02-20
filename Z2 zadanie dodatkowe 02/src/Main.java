public class Main {


    public static void main(String[] args) {


        System.out.println(factorialRecursive(4));
    }

    public static int factorial (int n) {

        int temp = 1;
        for (n=n; n > 0; n--) {
            temp = n * temp;
        }
        return temp;
    }

    public static int factorialRecursive (int n) {
        if (n == 1) {
            return  1;
        }
        return n * factorialRecursive(n-1);
    }

    }