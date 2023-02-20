import java.time.LocalDate;

public class Person {

    String firstName;
    String lastName;
    int yearOfBirth;

    public Person (String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName - lastName;
        this.yearOfBirth = yearOfBirth;
    }
    public void dataUrodzenia (int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int podajWiek() {
        return LocalDate.now() - dataUrodzenia(18);
    }
    System.out.print(return);
}
