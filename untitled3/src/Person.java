public class Person {

    String firstName;
    String lastName;

    public String getFullName () {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public static Person constructPerson (String firstName, String lastName) {
        Person person = new Person();
        person.lastName = lastName;
        person.firstName = firstName;
        return person;
    }


}
