public class Person {

    String firstName;
    String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    static Person constructPerson(String firstName, String lastName) {
        Person nazwa = new Person();
        nazwa.firstName = firstName;
        nazwa.lastName = lastName;
        return nazwa;
    }
}
