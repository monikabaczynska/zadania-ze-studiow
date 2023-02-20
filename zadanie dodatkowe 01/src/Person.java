public class Person {

    String firstName;
    String lastName;

    String getFullName() {
        return firstName + " " + lastName;
    }

    static Person constructPerson (String firstName, String lastName) {
        Person osoba = new Person();
        osoba.firstName = firstName;
        osoba.lastName = lastName;
        return osoba;
    }
}
