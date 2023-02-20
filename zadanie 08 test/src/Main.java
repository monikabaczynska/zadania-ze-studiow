public class Main {


    public static void main(String[] args) {

        Car [] cars = new Car[4];
        cars [0] = new Car("BMW");
        cars [1] = new Car("Mercedes");
        cars [2] = new Car("Fiat");
        cars [3] = new Car("Mercedes");

        System.out.println(CarCalculator.countBrand("Mercedes", cars));
    }
}

