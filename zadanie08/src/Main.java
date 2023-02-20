class Car {
    String brand;
}
class CarCalculator {
    public static int countBrand (String brand, Car [] cars) {
        int sum = 0;
        for (Car car: cars) {
            if (car.brand == brand) {
                sum++;
            }
        }
        return sum;
    }
}

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";

        Car car2 = new Car ();
        car2.brand = "Mercedes";

        Car[] cars = {car1, car2};
        CarCalculator carCalculator = new CarCalculator();

        System.out.printf("Sum of BMW: %s", CarCalculator.countBrand("BMW", cars));
    }
}