public class Main {
    public static String bmi(double weight, double height) {
        double wynik = weight / (height * height);
        for (wynik <= 18.5) {
            return "Underweight"; {
        else if (wynik <= 25.0) {
                    return "Normal"; {
              else if (wynik <= 25.0) {
                            return "Overweight";
                        } else {
                            return "Obese";
                        }
                    }
                }
            }
        }
    }
}