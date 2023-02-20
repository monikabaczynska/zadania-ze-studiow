public class CarCalculator {

    static int countBrand (String brand, Car [] cars) {
        int counter = 0;
        for (Car car: cars) {
            if (brand == car.brand) {
                counter++;
            }
        }
        return counter;
    }
}
