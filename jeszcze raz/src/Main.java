public class Main {

    public static void main(String[] args) {

        Person[] tablicaOsob = {Person.constructPerson("Maciej", "Gowin"),
        Person.constructPerson("Monika", "nicNieUmiem")};

        familyMembers("Gowin", tablicaOsob);
    }

    static void familyMembers(String lastName, Person[] persons) {
        for (Person zmiennaNowa: persons) {
            if (lastName == zmiennaNowa.lastName) {
                System.out.println(zmiennaNowa.getFullName());
            }
        }
    }
}